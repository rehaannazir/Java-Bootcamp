public class Parse{

        public static void main(String[] args){

            // Parsing (Object Type -> Primitive Type)

            String age = "18";
            // int n = (int)age; // Error (Compile Time)
            
            // Integer n = (Integer)age; // Error (Compile Time)

            int n = Integer.parseInt(age);
            System.out.println(n+1);

            System.out.println(Integer.valueOf(age));
            
            Integer m = Integer.valueOf(age);
            System.out.println(m.intValue());
            
            

        }
}