import java.util.Scanner;

public class ArrayInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        System.out.println("Enter the Elements of the array");
        for(int i = 0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("------Array Elements-------");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }

    }
}
