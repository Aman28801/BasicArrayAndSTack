
public class sd {



    public static void main(String[] args) {
        System.out.println("Main method Begins");
        try
        {
            System.out.println(10/0);
            System.out.println(args[2]);
        }
        catch(ArithmeticException | IndexOutOfBoundsException obj)
        {
            obj.printStackTrace();
        }
        System.out.println("End of the main method");

    }


}






