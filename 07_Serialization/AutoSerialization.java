import java.io.*;

class UserSession implements Serializable {

    private final long UID = 241L;
    private String username;
    private transient String passward;

    public UserSession(String un, String pass){
        this.username = un;
        this.passward = pass;
    }

    @Override
    public String toString(){
        return "username: " + this.username + " \n passward: " + this.passward; 
    }

}

public class AutoSerialization{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        
        UserSession user = new UserSession("Prakhar11", "12345");

        try{
            // Serialization
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("AutoUserData.ser")
            );

            oos.writeObject(user);
            oos.close();

            System.out.println("Serialization Done !");

            // Deserialization
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("AutoUserData.ser")
            );

            UserSession user2 = (UserSession) ois.readObject();
            ois.close();

            System.out.println(user2);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}