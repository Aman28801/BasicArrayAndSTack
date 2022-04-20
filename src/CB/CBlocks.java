package CB;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class CBlocks {
    //Bubble Sorting
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the 5 Elements Of Array To Get Sorted");
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
