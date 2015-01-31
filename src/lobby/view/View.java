package lobby.view;

import java.net.InetAddress;
import java.util.ArrayList;

import lobby.logic.ConnectionProcessor;

public class View extends Thread{
	public static boolean isListening = false;
	public ConnectionProcessor cP;
	
	public View(ConnectionProcessor cP) {
	       this.cP = cP;
	   }
	
	
	public void run() {
		listenForServers();
    }
	
	public void listenForServers(){
		isListening =true;
		ArrayList<InetAddress> currentList = new ArrayList<InetAddress>();
		while(isListening){
			InetAddress newServer = cP.waitForAGame(currentList);
			
			/*
			 * DO SOME MAGIC TO UPDATE THE GUI
			 * 
			 */
			
			currentList.add(newServer);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void createAGame(){
		isListening =false;
		/*
		 * close old window, open new one
		 */
		cP.createAGame();
		
		//TODO now do game comm proc to take in payload arguments
	}
}
