import javax.swing.*;
import java.util.*;

class AddressBook{

    ArrayList<PersonInfo> persons;

    public AddressBook(){
        this.persons = new ArrayList<PersonInfo>();
        this.loadPersons()
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

    public void loadPersons(){
        String tokens[] = null;
        String nam, add, phn;

        try{
            FileReader loaded_file = new FileReader("persons.txt");
            BufferedReader bf = new BufferedReader(loaded_file);
            String line = bf.readLine();

            while(line != null){
                tokens = line.split(",");
                nam = token[0];
                add = token[1];
                phn = token[2];

                PersonInfo person = new PersonInfo(nam, add, phn);
                persons.add(person);

                line = bf.readLine();
            }

            br.close();
            loaded_file.close();
        }
        catch(IOException ioex){
            System.out.println(ioex);
        }
    }

    public void savePersons(){

        try{
            FileWriter opened_file = new FileWriter("persons.txt");
            PrintWriter wr = new PrintWriter(opened_file);

            for(PersonInfo i: persons){
                String line = i.getName() + "," + i.getAddress() + "," + i.getPhoneNumber();
                wr.println(line);
            }  
            wr.flush();
            wr.close();
            opened_file.close();
        }
        catch(IOException iox){
            System.out.println(iox);
        }
    }

}