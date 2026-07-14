
// Write a Java program that takes a year from the user and prints whether that year is a leap year or not.
import java.util.*;

public class leapYear {
    public static void main(String args[]) {
        int year;
        System.out.println("Enter a year to check if it is a leap year or not: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Year " + year + " is a leap year.");
        } else {
            System.out.println("Year " + year + " is not a leap year.");
        }
    }
}