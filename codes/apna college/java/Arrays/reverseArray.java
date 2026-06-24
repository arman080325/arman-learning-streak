import java.util.*;

public class reverseArray {

    public static void reverseArray(int arr[])
    {
       int first=0,last=arr.length-1;
       while(first < last)
       {
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;

        first++;
        last--;
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
