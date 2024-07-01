import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] massiv = new int[n][m];
        int number = 1;
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                massiv[i][j] = number++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }

    }
}







