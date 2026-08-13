
public class getIthBit {
    public static void main(String[] args) {
        int n=10;
        int i=5;
        System.out.println(getIthBit(n,i));
    }

    public static int getIthBit(int n,int i)
    {
        int bitMask= (1 << i);
        if((n & bitMask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }

    }
}
