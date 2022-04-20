import java.util.Scanner;
public class Swap
{
    void swap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter I value");
        int a = input.nextInt();
        System.out.println("Enter II value");
        int b = input.nextInt();
        System.out.println("Container 1 value : " + a);
        System.out.println("Container 2 value : " + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("Values after swapping-->");
        System.out.println("Container 1 value : " + a);
        System.out.println("Container 2 value : " + b);
    }
    public static void main(String[] args)
    {
        Swap obj = new Swap();
        obj.swap();
    }
}
