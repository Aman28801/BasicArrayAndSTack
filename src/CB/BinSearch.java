package CB;
import java.util.Scanner;
public class BinSearch
{
    public static int main(String[] args) {
        int[] arr = new int[9];
        Scanner sc =new Scanner(System.in);
        int i;
        for(i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int item =0;
        int low = arr[0];
        int hi = arr.length-1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid]<item){
                low = mid+1;
            }
            else if(arr[mid]>item){
                hi=mid-1;
            }
            else{
                return mid;
            }

        }

        return 0;
    }
}
