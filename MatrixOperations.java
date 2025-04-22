public class MatrixOperations { 
    public static void main(String[] args) { 
       System.out.println("G. POOJA PRIYANKA,24107,CSE-B");
        int[][] A = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        }; 
 
         
        int[][] B = { 
            {9, 8, 7}, 
            {6, 5, 4}, 
            {3, 2, 1} 
        }; 
 
         
        int[][] sum = new int[3][3]; 
        int[][] product = new int[3][3]; 
 
         
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                sum[i][j] = A[i][j] + B[i][j]; 
            } 
        } 
 
     
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                product[i][j] = 0; 
                for (int k = 0; k < 3; k++) { 
                    product[i][j] += A[i][k] * B[k][j]; 
                } 
            } 
        } 
        System.out.println("Matrix A:"); 
        displayMatrix(A); 
 
        System.out.println("Matrix B:"); 
        displayMatrix(B); 
 
        System.out.println("Sum of A and B:"); 
        displayMatrix(sum); 
        System.out.println("Product of A and B:"); 
        displayMatrix(product); 
    } 
 
     
    public static void displayMatrix(int[][] matrix) { 
        for (int[] row : matrix) { 
            for (int val : row) { 
                System.out.print(val ); 
            } 
            System.out.println(); 
        } 
    } 
} 
