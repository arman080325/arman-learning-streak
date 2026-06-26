
public class diagonalSum {

    public static int sumDiagonal(int matrix[][]) {
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i == j)
                {
                    sum += matrix[i][j];
                }
                else if(i + j == n-1)
                {
                    sum +=matrix[i][j];
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int r = matrix.length;
        int c = matrix[0].length;
        System.out.println("2D Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of Diagonals of the matrix is :"+sumDiagonal(matrix));
    }
}
