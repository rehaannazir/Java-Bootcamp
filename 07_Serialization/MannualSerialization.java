import java.io.*;

class UserSession implements Externalizable{
    
    private final long UID = 12345L;
    private String username;
    private double balance;
    private String securitycode;

    public UserSession(String un, double bl, String sc){
        this.username = un;
        this.balance = bl;
        this.securitycode = sc;
    }    

    @Override
    public void writeExternal (ObjectOutput out)throws IOException{
        out.writeUTF(username);
        out.writeDouble(balance);
        // securitycode is missed intentionally to make it tranient mannually
    }

    @Override
    public void readExternal (ObjectInput in) throws IOException, ClassNotFoundException {
        this.username = in.readUTF();
        this.balance = in.readDouble();
        this.securitycode = null; // As it was transient
    }
}

public class MannualSerialization{
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        UserSession user = new UserSession("Prakhar11", 25000.50, "12345");

        try{
            // Serialization
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("mannualUserData.ser")
            );

            oos.writeObject(user);
            oos.close();

            System.out.println("Serialization Done !");

            // Deserialization
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("mannualUserData.ser")
            );

            UserSession user2 = (UserSession) ois.readObject();
            ois.close();

            System.out.println(user2);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
