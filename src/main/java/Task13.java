import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = (n == 0) ? 1 : 0;
        while (n > 0) {
            n /= 10;
            res++;
        }
        System.out.println(res);
    }
}

