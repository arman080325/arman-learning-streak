
import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string to check for palindrome");
        str = sc.nextLine();
        if(checkPalindrome(str))
            System.out.println(str+" is a Palindrome String");
        else
            System.out.println("Not a Palindrome");
    }

    public static boolean checkPalindrome(String str) {
        for(int i=0;i<str.length()/2;i++)
        {
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-i-1))
            {
                //Condition to check not a palindrome
                return false;
            }
        }
        return true;
    }
}
//O(n)