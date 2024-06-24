import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ortaEded;

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
            ortaEded = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            ortaEded = b;
        } else {
            ortaEded = c;
        }
        System.out.println(ortaEded);
        scanner.close();

        }

    }



