import java.util.Scanner;

public class ArrayPosNeg
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar =new int[10];
        System.out.println("Element in Array");
        int i=0;
        while(i<ar.length){
            ar[i]=sc.nextInt();
            i++;
        }
        int j=0,pos=0,neg=0;

        while(j<ar.length){
        if(ar[j]>0){
            pos++;
        }
        else{
            neg++;
        }
        j++;
        }
        System.out.println("Positive = " + pos);
        System.out.println("Negative = "+ neg);

    }
}
