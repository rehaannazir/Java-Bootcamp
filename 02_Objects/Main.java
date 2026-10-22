public class Main{

    public static void main(String[] args){

        Object person = new Object (); // Parent class of every java class you make.
        System.out.println(person); // same as toString 
        System.out.println(person.toString()); // returns the address of object in string form  
        System.out.println(person.hashCode()); // returns the address of object in int form
        System.out.println(person.getClass()); // returns the class of object


        // Object person = new Object("Rehan"); // error bcz Constructor Object doesn't take arguments

    }
}