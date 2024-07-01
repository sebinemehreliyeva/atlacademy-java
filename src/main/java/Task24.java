import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n dəyərini oxuyun
        int n = scanner.nextInt();

        // n×n matrisi oxuyun
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // r və c dəyərlərini oxuyun
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        // r×c matrisini çapa verin
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

