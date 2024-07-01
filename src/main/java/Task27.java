import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n dəyərini oxuyun
        int n = scanner.nextInt();

        // 4×n ölçülü düzbucaqlını çapa verin
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }
}


