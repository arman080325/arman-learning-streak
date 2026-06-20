import java.util.*;


public class invertedRotatedPyramid {

    public static void invertedPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines or rows for pyramid");
        n=sc.nextInt();
        invertedPyramid(n);
    }
}

