import java.util.Scanner;

public class p1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i :arr)
        {
            System.out.println(i);
        }


    }
}
