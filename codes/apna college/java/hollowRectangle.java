import java.util.*;

public class hollowRectangle {

    public static void hollowRect(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1 || i==r || j==1 || j==c)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        row=sc.nextInt();
        col=sc.nextInt();
        hollowRect(row,col);
    }
}
