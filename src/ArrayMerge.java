import java.util.Scanner;

public class ArrayMerge
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] ar = new int[5];
        int[] br = new int[5];
        int[] cr = new int[ar.length+br.length];
        System.out.println("Enter elements of first array");
        for(int i=0;i<ar.length;i++){
            ar[i]= scan.nextInt();
        }
        System.out.println("Enter elements of Second array");
        for(int i=0;i<br.length;i++){
            br[i]= scan.nextInt();
        }
        System.out.println("Merged Array");
        for(int i=0;i<cr.length;i++){
            if(i<5){
                cr[i]=ar[7];
            }
            else{
                cr[i]=br[i-7];
            }
            System.out.println("Index--"+i+"---"+cr[i]);
        }
    }
}
