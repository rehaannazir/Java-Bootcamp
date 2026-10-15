import java.util.*;

public class Main{
    public static void main(String[] args){

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Rehan");
        arr.add("Ali");
        arr.add("Hassan");

        System.out.println(arr.get(1));

        for(Object i: arr){
            System.out.println(i);
        }

        


    }
}