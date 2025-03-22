import java.util.Random; // for random number generation
public class Main {
    public static void main(String[] args) {

        // how 3 times simultaneously rolling dice looks?
        Random random = new Random();

        int number1= random.nextInt(1,7);
        int number2= random.nextInt(1,7);
        int number3= random.nextInt(1,7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);



    }
}