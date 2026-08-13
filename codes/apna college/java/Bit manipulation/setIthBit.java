
public class setIthBit {

    public static void main(String[] args) {
        int n, i;
        n = 10;
        i = 2;
        int ans=setIthBit(n, i);
        System.out.println(ans);
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
}
