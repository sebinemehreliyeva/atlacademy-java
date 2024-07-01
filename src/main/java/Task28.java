import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n və m dəyərlərini oxuyun
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // n * m ölçülü düzbucaqlını çapa verin
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }
}
