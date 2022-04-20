//10  element array
//print the sum of each element
//initialize it by taking the input from user

import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        int i, sum=0;
        int[] arr =new int[10];
        System.out.println("Enter 10 Numbers");
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;++i) {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<10;++i){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }

}
