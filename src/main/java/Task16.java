import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(1);  // Bərabərtərəfli üçbucaq
        } else if (a == b || b == c || a == c) {
            System.out.println(2);  // Bərabəryanlı üçbucaq
        } else {
            System.out.println(3);  // Müxtəliftərəfli üçbucaq
        }
    }
}


