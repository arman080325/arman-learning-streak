
public class oddEven {
    public static void main(String[] args) {
        // int num =10;
        int num =5;
        oddEven(num);
    }

    public static void oddEven(int num)
    {
        int bitMask=1;
        if((num & bitMask) == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
