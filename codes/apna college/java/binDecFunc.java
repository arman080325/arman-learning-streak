import java.util.*;

public class binDecFunc {
    
    public static void binDec(int bin)
    {
        int decNum=0;
        int power=0;
        int orgBin=bin;
        while(bin>0)//101
        {
            int lastDigit=bin%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,power));
            power++;
            bin=bin/10;
        }
        System.out.println(orgBin+" --> "+decNum);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number");
        int bin=sc.nextInt();
        binDec(bin);
    }
}
