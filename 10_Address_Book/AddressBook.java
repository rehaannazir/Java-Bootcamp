import javax.swing.*;
import java.util.*;

class AddressBook{

    ArrayList<PersonInfo> persons;

    public AddressBook(){
        this.persons = new ArrayList<PersonInfo>();
    }

    public void addPerson(){
        String name = JOptionPane.showInputDialog("Enter name:");
        String address = JOptionPane.showInputDialog("Enter address:");
        String phoneNumber = JOptionPane.showInputDialog("Enter phoneNumber:");

        PersonInfo p = new PersonInfo(name, address, phoneNumber);

        persons.add(p);
    }

    public void searchPerson(String name){

        int x = 0;

        for(PersonInfo i: this.persons){

            if (i.getName().equals(name)){
                i.showPersonInfo();

                x=1;
            }
        }
        if(x==0){
            JOptionPane.showMessageDialog(null, "Person not found");
        }
        
    } 

    public void deletePerson(String name){

        int x = 0;

        for(PersonInfo i: this.persons){

            if (i.getName().equals(name)){
                this.persons.remove(i);
                x=1;
                break;
            }
        }

        if(x==0){
            JOptionPane.showMessageDialog(null, "Person not found");
        }

    } 

}