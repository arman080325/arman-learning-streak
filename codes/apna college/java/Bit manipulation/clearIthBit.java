
public class clearIthBit {

    public static void main(String[] args) {
        int n, i;
        n = 10;
        i = 1;
        int ans=clearIthBit(n, i);
        System.out.println(ans);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~( 1 << i) ;
        return n & bitMask;
    }
}
