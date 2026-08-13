public class clearLastBits {
    public static void main(String[] args) {
        System.out.println(clearLastBits(15,2));
    }

    public static int clearLastBits(int n,int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
}
