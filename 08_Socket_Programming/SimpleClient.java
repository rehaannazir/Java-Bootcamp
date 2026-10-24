import java.io.*;
import java.net.*;

public class SimpleClient{

    public static void main(String[] args){

       int port = 5000;
       String IP = "127.0.0.1";
       
       try(Socket socket = new Socket(IP, port)){

        System.out.println("Connected to server");

        // Attach I/O streams
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Send message to server
        out.println("Hello from client!");

        // Read response from server
        String response = in.readLine();
        System.out.println("Server says: " + response);
       }
       catch(Exception e){
        System.out.println("Error : " + e);
       }
    }
}
    
