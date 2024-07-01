import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int sum =0;
        long  mult = 1;
        int[] myArray = new int[n];
        for(int i = 0; i< myArray.length; i++){
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]+" ");

        }
        System.out.println();
        int min = myArray[0];
        for (int i = 0; i<myArray.length; i++){
            sum += myArray[i];
            mult *= myArray[i];
            if (myArray[i]<min){
                min =myArray[i];
            }
        }
        System.out.println("mult:"+mult);
        System.out.println("min:"+min);
        System.out.println("sum:"+sum);
    }
}
