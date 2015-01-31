package lobby.logic;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectionProcessor {
	private final int portNumber = 1777;
	private String hostname;
	public ConnectionProcessor(){
		try {
			hostname = InetAddress.getLocalHost().getHostName();
			Socket lobbySocket = new Socket(hostname, portNumber);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void createAGame(){
		
	}
}
