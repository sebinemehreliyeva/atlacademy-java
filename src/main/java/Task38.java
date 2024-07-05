import java.text.DecimalFormat;
import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                long N = scanner.nextLong();
                scanner.close();

                long sum = 0;
                long product = 1;
                long temp = N;

                while (temp > 0) {
                    long digit = temp % 10;
                    sum += digit;
                    product *= digit;
                    temp /= 10;
                }

                double ratio = (double) product / sum;
                DecimalFormat df = new DecimalFormat("0.000");
                System.out.println(df.format(ratio));
            }
        }

