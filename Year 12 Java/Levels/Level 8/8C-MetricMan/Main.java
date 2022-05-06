import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to do:\nA) Fahrenheit to Celsius\nB) Celcius to Fahrenheit\nC) Miles to Kilometers\nD) Kilometers to Miles\nE) Inches to Centimeters\nF) Centimeters to Inches\nX) Quit the program");    
        String choice = input.nextLine();
        
        if (choice.equals("A")) {
            System.out.println("Enter the temperature (C)");
            double temp = Integer.parseInt(input.nextLine());
            System.out.print(convertFtoC(temp));
        }
        else if (choice.equals("B")) {
            System.out.println("Enter the temperature (F)");
            double temp = Integer.parseInt(input.nextLine());    
            System.out.print(convertCtoF(temp));                    
        }
        else if (choice.equals("C")) {
            System.out.println("Enter the distance (M)");
            double distance = Integer.parseInt(input.nextLine()); 
            System.out.print(convertMtoK(distance));
        }
        else if (choice.equals("D")) {
            System.out.println("Enter the distance (K)");
            double distance = Integer.parseInt(input.nextLine());
            System.out.print(convertKtoM(distance)); 
        }
        else if (choice.equals("E")) {
            System.out.println("Enter the length (I)");
            double length = Integer.parseInt(input.nextLine());
            System.out.print(convertItoC(length));  
        }
        else if (choice.equals("F")) {
            System.out.println("Enter the length (C)");
            double length = Integer.parseInt(input.nextLine());
            System.out.print(convertCtoI(length));   
        }
        else if (choice.equals("X")) {

        }
        else {

        }
    }

    public static double convertFtoC(double temp) {
        return ((temp - 32) * 5/9);
    }
    public static double convertCtoF(double temp) {
        return ((temp * 9/5) + 32);
    }

    public static double convertMtoK(double distance) {
        return (distance*1.609);        
    }
    public static double convertKtoM(double distance) {
        return (distance/1.609);          
    }

    public static double convertItoC(double length) {
        return (length*2.54);         
    }
    public static double convertCtoI(double length) {
        return (length/2.54); 
    }
}

