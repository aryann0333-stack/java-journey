public class tryCatch{
    public static void main(String[] args) {
        int i =0;  // normal statement
        int j =0;  
        try
        {
          j=18/i; // critical statement due to zero
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("Exception handeld !!");

    }
}