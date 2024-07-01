import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n dəyərini oxuyun
        int n = scanner.nextInt();

        // n sayda tam ədəd oxuyun
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Ən böyük və ən kiçik elementləri tapın
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Ən böyük elementləri ən kiçiklə, ən kiçikləri isə ən böyüklə əvəzləyin
        for (int i = 0; i < n; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }

        // Yenilənmiş massivi çapa verin
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}

