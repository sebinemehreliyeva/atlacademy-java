import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            for(int j = 0; j<n; i++){
                System.out.print("#");

            }
            System.out.println();

        }
        scanner.close();
    }
}

