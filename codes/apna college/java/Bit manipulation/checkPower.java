
public class checkPower {

    public static void main(String[] args) {
        System.out.println(checkPower(2));
    }

    public static boolean checkPower(int n) {
        return (n & (n - 1)) == 0;
    }
}
