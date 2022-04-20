import java.util.Arrays;
import java.util.Scanner;

public class HR
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
}
