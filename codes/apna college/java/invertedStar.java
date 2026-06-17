import java.util.Scanner;

public class invertedStar {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines to print the stars");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            // for(int j=n;j>=i;j--)
            // {
            //     System.out.print("*");
            // }
            for(int j=i;j<=(n-1)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
