import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String week1;
        String place1;
        String place2;
        String adjective1;
        String noun1;
        String adjective2;
        String animal1;
        String verb1;
        String noun2;
        String adjective3;
        String verb2;
        String verb3;
        String noun3;
        String adjective4;
        String noun4;
        String adjective5;
        String exclamation1;
        String verb4;
        String adjective6;
        String noun5;
        String verb5;

        System.out.println("Enter an weekday:");
        week1=sc.nextLine();
        System.out.println("Enter a place:");
        place1=sc.nextLine();
        System.out.println("Enter a place:");
        place2=sc.nextLine();
        System.out.println("Enter an adjective:");
        adjective1=sc.nextLine();
        System.out.println("Enter a noun:");
        noun1=sc.nextLine();
        System.out.println("Enter an adjective:");
        adjective2=sc.nextLine();
        System.out.println("Enter an animal:");
        animal1=sc.nextLine();
        System.out.println("Enter a verb:");
        verb1=sc.nextLine();
        System.out.println("Enter another noun:");
        noun2=sc.nextLine();
        System.out.println("Enter an adjective:");
        adjective3=sc.nextLine();
        System.out.println("Enter a verb:");
        verb2=sc.nextLine();
        System.out.println("Enter a verb:");
        verb3=sc.nextLine();
        System.out.println("Enter a noun:");
        noun3=sc.nextLine();
        System.out.println("Enter an adjective:");
        adjective4=sc.nextLine();
        System.out.println("Enter a noun:");
        noun4=sc.nextLine();
        System.out.println("Enter an adjective:");
        adjective5=sc.nextLine();
        System.out.println("Enter an exclamation:");
        exclamation1=sc.nextLine();
        System.out.println("Enter a verb");
        verb4=sc.nextLine();
        System.out.println("Enter an adjective");
        adjective6=sc.nextLine();
        System.out.println("Enter a noun");
        noun5=sc.nextLine();
        System.out.println("Enter a verb");
        verb5=sc.nextLine();

        /*On a [Day of the Week] morning, I decided to visit a [Place] in a nearby [Place]. I wanted to find a [Adjective] [Noun]. While walking, I saw a [Adjective] [Type of Animal] trying to [Verb] a very large [Noun]. It looked quite [Adjective]. I decided to [Verb] closer, but the bird began to [Verb] loudly. I jumped and spilled my [Type of Drink]. Suddenly, a [Adjective] [Noun] fell from a [Adjective] [Noun] above. It made a [Adjective] sound. I yelled, '[Exclamation]!' and started to [Verb] away as fast as I could. It was the most [Adjective] experience of my [Noun] so far. I will definitely [Verb] about it later.*/

        System.out.println("On a "+ week1+" morning, I decided to visit a "+place1+" in a nearby "+place2+". I found a "+adjective1+noun1+". While walking, I saw a "+adjective2+animal1+" trying to "+verb1+" a very large "+noun2+". It looked quite "+adjective3+". I decided to "+verb2+" closer, but the bird began to "+verb3+" loudly. I jumped and spilled my "+noun3+". Suddenly, a "+adjective4+noun4+" fell from a tall tree above. It made a "+adjective5+ "sound. I yelled, '"+exclamation1+"!' and started to"+verb4+" away as fast as I could. It was the most "+adjective6+"experience of my "+noun5+" so far. I will definitely "+verb5+" about it later.");
        sc.close();
    }
}