import javax.swing.*;

public class PersonInfo{
    String name;
    String address;
    String phoneNumber;

    public PersonInfo(String n, String a, String p){
        name = n;
        address = a;
        phoneNumber = p;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void showPersonInfo(){
        JOptionPane.showMessageDialog(null, "Name: " + name+"\nAddress: " + address+"\nPhone Number: " + phoneNumber);
    }
}