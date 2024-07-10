import java.util.Random;

public class GenericApp {
    public static void main(String[] args) {
        Box<Integer> integerBox = generateRandom();
        System.out.println(integerBox);
    }
    public  static Box<Integer>generateRandom(){
        Random random = new Random();
        int number = random.nextInt(100);
        boolean isEven = number%2==0;
        return new Box<>(number,isEven);

    }
}
