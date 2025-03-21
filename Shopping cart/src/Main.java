import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What item you would like to buy: ");
        String item=sc.nextLine();

        System.out.println("What is the price of the item: ");
        double price=sc.nextDouble();

        System.out.println("How many you want to buy: ");
        int quantity=sc.nextInt();

        char currency= '₹';
        double total = quantity*price;

        System.out.println("You have bought "+quantity+" "+item);
        System.out.println("Your total price is "+total+currency);


        sc.close();
    }
}