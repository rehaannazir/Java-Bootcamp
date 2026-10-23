public class Main{

    // Method 1
    static double division(double a, double b) throws ArithmeticException
        {
            return a/b;
        }   


    public static void main(String[] args){

        try {   // Method 2
            int a = 12;
            int b = 0;

            if (b == 0)  // Method 3: custom exception
            {
                throw new ArithmeticException("Division by zero");
            }

            System.out.println("Division: " + a/b);
            System.out.println("Division: " + division(a,b));
        }

        catch(ArithmeticException ae){
            System.out.println(ae.toString());
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }

        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("The code is executed successfully!");
        }
    }

}