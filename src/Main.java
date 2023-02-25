import basic_equations.*;
import problems.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        introduction();
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
