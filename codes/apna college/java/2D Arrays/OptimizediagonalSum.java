
public class OptimizediagonalSum {

    public static int optimalsumDiagonal(int matrix[][]) {   //O(n)
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            //Primary Diagonal
            sum += matrix[i][i];
            //Secondary Diagonal
            //When i != j
            if(i != n-1-i)  //i+j=n-1 ==> j=n-i-1
            sum += matrix[i][n-i-1];
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
        System.out.println("Sum of Diagonals of the matrix is :"+optimalsumDiagonal(matrix));
    }
}
