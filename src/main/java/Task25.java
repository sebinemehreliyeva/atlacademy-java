import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n dəyərini oxuyun
        int n = scanner.nextInt();

        // n×3 ölçülü düzbucaqlını çapa verin
        for (int i = 0; i < n; i++) {
            System.out.println("###");
        }

        scanner.close();
    }
}



