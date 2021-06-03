package ex04;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class MadLib {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        MadLib app = new MadLib();
        String noun = app.enterNoun();
        String verb = app.enterVerb();
        String adjective = app.enterAdj();
        String adverb = app.enterAdv();
        app.generateOutput(verb, adjective, noun, adverb);
    }

    public String enterNoun(){
        System.out.print("Enter a noun: ");
        return input.nextLine();
    }

    public String enterVerb(){
        System.out.print("Enter a verb: ");
        return input.nextLine();
    }

    public String enterAdj(){
        System.out.print("Enter an adjective: ");
        return input.nextLine();
    }

    public String enterAdv(){
        System.out.print("Enter an adverb: ");
        return input.nextLine();
    }

    public void generateOutput(String verb, String adjective, String noun, String adverb){
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
