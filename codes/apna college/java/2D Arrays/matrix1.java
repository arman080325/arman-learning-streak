
import java.util.*;

public class matrix1 {

    public static boolean searchMatrix(int matrix[][], int key) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(matrix[i][j] == key)
                { 
                   System.out.println("Element found at Index ("+i+","+j+")");
                   return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int r = matrix.length;
        int c = matrix[0].length;
        System.out.println("Enter the elements of the 2D Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        searchMatrix(matrix, key);
    }
}
