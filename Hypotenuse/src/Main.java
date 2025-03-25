import java.util.Scanner;

//right angel triangle

public class Main {
    public static void main(String[] args){

        // hypotenus c = Math.sqrt(a)

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base length(cm): ");
        double base= sc.nextDouble();
        System.out.println("Enter height length(cm): ");
        double height= sc.nextDouble();
        double hypotenus= Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
        System.out.println("The length of hypotenus is: "+ hypotenus);

    }
}