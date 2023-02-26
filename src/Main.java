import basic_equations.*;
import problems.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String input = "";
        Scanner in = new Scanner(System.in);
        introduction();
        while(!input.equals("Quit")){
            input = in.nextLine();
            switch (input){
                case "Help" -> help();
                case "Problems" -> list();
            }
        }
    }


    private static void list(){
        System.out.println("To solve a problem please type the appropriate name from below:\n"
                +"Binomial_Distribution\n"
                +"Bayes_theorem\n");
    }
    private static void introduction(){
        System.out.println("Welcome to Probability Solver!\n"
                + "==============================\n"
                + "Commands:\nHelp - lists commands");
        help();
    }
    private static void help(){
        System.out.println("Problems - lists all currently implemented equations\n"
                + "Quit - exits the program");
    }
}
