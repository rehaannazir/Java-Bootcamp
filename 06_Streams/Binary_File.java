import java.io.*;

public class Binary_File{

    public static void main(String[] args){
        
        try (FileInputStream fis = new FileInputStream("image.png");
             FileOutputStream fos = new FileOutputStream("dest.png")) {

            byte[] chunk = new byte[1024]; // buffer to read/write chunks of data
            int byteRead;

            while ((byteRead = fis.read(chunk)) != -1) {   // fis.read returns no. of bytes read
                fos.write(chunk, 0, byteRead); // (array, offset, no of bytes)
            }
            System.out.println("Successfully copied");
        }

        catch(IOException e){
            e.printStackTrace();
        }

    }
}
