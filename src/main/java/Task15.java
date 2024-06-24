import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number/10)% 10;
        int ones = number % 10 ;

        int product = hundreds * tens * ones;
        System.out.println(product);

        scanner.close();
    }
}
