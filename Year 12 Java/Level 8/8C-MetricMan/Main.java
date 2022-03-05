import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What would you like to do:\nA) Fahrenheit to Celsius\nB) Celcius to Fahrenheit\nC) Miles to Kilometers\nD) Kilometers to Miles\nE) Inches to Centimeters\nF) Centimeters to Inches\nX) Quit the program");    
        String choice = input.nextLine();
        
        if (choice.equals("A")) {
            System.out.println("Enter the temperature (C)");
            int temp = input.nextLine();
            convertFtoC(temp);
        }
        else if (choice.equals("B")) {
            System.out.println("Enter the temperature (F)");
            int temp = input.nextLine();            
        }
        else if (choice.equals("C")) {
            System.out.println("Enter the distance (M)");
            int distance = input.nextLine(); 
        }
        else if (choice.equals("D")) {
            System.out.println("Enter the distance (K)");
            int distance = input.nextLine(); 
        }
        else if (choice.equals("E")) {
            System.out.println("Enter the length (I)");
            int length = input.nextLine(); 
        }
        else if (choice.equals("F")) {
            System.out.println("Enter the length (Cm)");
            int length = input.nextLine(); 
        }
        else if (choice.equals("X")) {

        }
        else {

        }
    }

    public static void convertFtoC(int[] temp) {
        return (length*3.15);
    }
    public static void convertCtoF(int[] temp) {
        
    }

    public static void convertMtoK(int[] distance) {
        
    }
    public static void convertKtoM(int[] distance) {
        
    }

    public static void convertItoC(int[] length) {
        
    }
    public static void convertCtoI(int[] length) {
        
    }
}

