import java.util.*;


public class swapFunc {

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);

    }
}
//Java always calls by value that means it only gives the copy of the values of variables rather than the original values like C++ which is known as call by reference