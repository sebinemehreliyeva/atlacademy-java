import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

                int[][] matrix = new int[n][n];
                int num = 1;

                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        // Soldan sağa doğru doldur
                        for (int j = 0; j < n; j++) {
                            matrix[i][j] = num++;
                        }
                    } else {
                        // Sağdan sola doğru doldur
                        for (int j = n - 1; j >= 0; j--) {
                            matrix[i][j] = num++;
                        }
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }




