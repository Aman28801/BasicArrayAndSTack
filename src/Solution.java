
import java.util.*;
public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        for(int n=0;n<5;n++){
            arr[n]= sc.nextInt();
        }
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }




    }
}
