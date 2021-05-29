import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){
        Scanner nInput = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = nInput.next();

        Scanner vInput = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String verb = vInput.next();

        Scanner adjInput = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adjective = adjInput.next();

        Scanner advInput = new Scanner(System.in);
        System.out.print("Enter an adverb: ");
        String adverb = advInput.next();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
