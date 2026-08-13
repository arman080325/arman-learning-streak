public class clearRangeBits {
    public static void main(String[] args) {
        System.out.println(clearRangeBits(10,2,4));
    }

    public static int clearRangeBits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;

        int finalBitMask=a|b;

        return n & finalBitMask;        
    }
}
