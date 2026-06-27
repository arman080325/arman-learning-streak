
public class subString {

    public static void main(String[] args) {
        String str = "ArmanKhan";
        // System.out.println("Substring : " + subString(str, 0, 5));
        System.out.println("Substring : " + str.substring(0, 5));

    }

    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}
