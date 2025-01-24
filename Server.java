package aC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

	public static void main(String[] args) throws Exception{
		final ServerSocket server = new ServerSocket(8083);
		System.out.println("Listening for connection on port 8083....");
		while(true) {
			final Socket clientSocket = server.accept();
			InputStreamReader isr
			= new InputStreamReader(clientSocket.getInputStream());
			BufferedReader reader = new BufferedReader(isr);
			String line = reader.readLine();
			while(!line.isEmpty()) {
			line = reader.readLine();
			System.out.println(line);

			server.close();
			}
		}
	}
}
	

