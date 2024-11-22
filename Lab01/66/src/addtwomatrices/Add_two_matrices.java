package addtwomatrices;

import java.util.Scanner;

public class Add_two_matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[][] matrixA = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//        
//        int[][] matrixB = {
//            {9, 8, 7},
//            {6, 5, 4},
//            {3, 2, 1}
//        };
//        int rows = matrixA.length;
//        int cols = matrixA[0].length;

        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
