import java.util.*;

public class inbuiltSort {

    public static void main(String[] args) {
        Integer arr[] = {9, 7, 5, 4, 3, 2};
        System.out.println("Sorted Array: ");
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // Arrays.sort(arr,0,3);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//O(n logn)
//it is non-exclusive to so last element is index+1
//reverseOrder will only work on objects ,so convert the int type to Integer type