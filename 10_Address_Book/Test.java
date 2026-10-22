import javax.swing.*;

public class Test{
    public static void main(String[] args){

        AddressBook addressBook = new AddressBook();
        
        int ch;

        while(true){

        ch =  Integer.parseInt(JOptionPane.showInputDialog("*****Welcome to Address Book*****\n Press for choice:\n1:add person\n2:Search Person\n3:DeletePerson\n4:Exit System"));
        
        switch(ch){

            case 1: 
                {   addressBook.addPerson();
                    break;
                }
            case 2:
                { 
                String name = JOptionPane.showInputDialog("Enter name:");
                addressBook.searchPerson(name);
                break;
                }
            case 3:
                { 
                String name = JOptionPane.showInputDialog("Enter name:");
                addressBook.deletePerson(name);
                break;
                }
            case 4:
                { 
                addressBook.savePersons();
                System.exit(0);
                }
        }           
        } 
    
    }
}