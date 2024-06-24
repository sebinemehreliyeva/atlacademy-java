import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a > b && a > c && a * a == b * b + c * c) ||
                (b > a && b > c && b * b == a * a + c * c) ||
                (c > a && c > b && c * c == a * a + b * b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
