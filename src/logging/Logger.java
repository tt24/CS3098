package logging;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JOptionPane;

public class Logger {
	
	
	public static void log(String details){
		PrintWriter writer;
		try {
			writer = new PrintWriter("ErrorLog.txt", "UTF-8");
			writer.append("\n"+details);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public static void logAndDisplayError(String userMessage, String errorDetails){
		JOptionPane.showMessageDialog(null, userMessage);
		log(errorDetails);
	}
}
