import java.util.Scanner;

public class Task39 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String N = scanner.nextLine();
            scanner.close();

            StringBuilder reversedN = new StringBuilder(N);
            reversedN.reverse();

            System.out.println(reversedN);
        }
    }


