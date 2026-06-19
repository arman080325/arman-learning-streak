import java.util.*;

public class decBinFunc {
    
    public static void decBin(int dec)
    {
        int binNum=0;
        int power=0;
        int orgDec=dec;
        while(dec>0)
        {
            int rem=dec%2;
            binNum=binNum+(rem*(int)Math.pow(10,power));
            power++;
            dec=dec/2;
        }
        System.out.println(orgDec+" --> "+binNum);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int dec=sc.nextInt();
        decBin(dec);
    }
}
