package lobby.logic;

import java.io.IOException;
import java.net.*;

public class ConnectionProcessor {
	private final int portNumber = 1777;
	private DatagramSocket connectSock;

	public ConnectionProcessor() {
		try {
			connectSock = new DatagramSocket(portNumber);
		} catch (IOException e) {
			logging.Logger
					.logAndDisplayError(
							"An error occurred whilst trying to make a socket, now exiting",
							e.getMessage());
			;
			System.exit(1);
		}
	}

	public InetAddress waitForAGame() {
		while (true) {
			byte[] receiveData = new byte[1024];
			byte[] sendData = new byte[1024];
			DatagramPacket receivePacket = new DatagramPacket(receiveData,
					receiveData.length);
			try {
				connectSock.receive(receivePacket);
				return receivePacket.getAddress();
			} catch (IOException e) {
				logging.Logger.logAndDisplayError(
						"An error occurred whilst listening for games",
						e.getMessage());
				;
			}
		}
	}

	public void createAGame() {
		String serverData = "DATATOSENDTOSTARTASERVER";
		byte[] sendData = serverData.getBytes();
		DatagramPacket sendPacket;
		try {
			sendPacket = new DatagramPacket(sendData,
					sendData.length, InetAddress.getByName("255.255.255.255"), portNumber);
			connectSock.send(sendPacket);
		} catch (UnknownHostException e) {
			logging.Logger.logAndDisplayError(
					"An error occurred while looking for all IPs on the LAN",
					e.getMessage());
			;
		} catch (IOException e) {
			logging.Logger.logAndDisplayError(
					"An error occurred whilst sending out game data",
					e.getMessage());
			;
		}
	}
}
