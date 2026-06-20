import java.util.*;
public class invertedNumberPyramid {

    public static void invertedPyramid(int n)
    {
        // for(int i=n;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
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


