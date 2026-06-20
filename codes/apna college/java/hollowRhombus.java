import java.util.Scanner;

public class hollowRhombus {
    public static void rhombus(int n) {
        // Step 1: Print leading spaces for slant effect
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
        // Step 2: Print the stars/hollow pattern
            for (int j = 1; j <= n; j++) {
                // First or last row → full stars
                // First or last column → star
                // Otherwise → space
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines or rows for pyramid");
        n = sc.nextInt();
        rhombus(n);
    }
}
