import java.util.*;
public class floydTriangle2 {

    public static void invertedPyramid(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
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


