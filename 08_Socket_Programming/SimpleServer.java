import java.io.*;
import java.net.*;

public class SimpleServer{

    public static void main(String[] args){

        int port = 5000;

        // Allocate port specifically listening to client
        try(ServerSocket serverSocket = new ServerSocket(port)){ 
            System.out.println("Server is listening at port : " + port);

            // Blocks until a client connects 
            try(Socket clientSocket = serverSocket.accept())
            {
                System.out.println("Connection established with Client : " + clientSocket.getInetAddress().getHostAddress());

                // Attach I/O Streams (Character streams wrapping byte streams)
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Read incoming message from client
                String clientMessage = in.readLine();
                System.out.println("Received: " + clientMessage);

                // Send reply back to client
                out.println("Server response: Message acknowledged.");
            }
        }
        catch(Exception e){
            System.out.println("Error : " + e);
        }

    }
}
    
