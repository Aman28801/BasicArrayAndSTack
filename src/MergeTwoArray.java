
import java.util.*;
public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int [7];
        int b[]=new int[7];
        int c[]=new int[a.length+b.length];
        for (int i = 0; i < c.length; i++) {
            if(i==0)
                System.out.println("Enter first array elements");
            else if(i==a.length)
                System.out.println("Enter Second array elements");
            if(i<a.length){
                a[i]=sc.nextInt();
                }
            else{
                b[i-a.length]=sc.nextInt();
            }
        }
        System.out.println("--Merged Array--");
        int j=0;
        for(int i: a){//for each loop
            c[j]=i;
            j++;
        }
        j=a.length;
        for(int i: b){//for each loop
            c[j]=i;
            j++;
        }
        for(int i:c){
            System.out.println(i);
        }
    }
}