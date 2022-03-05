import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); //Keyboard (kb)is declared as a scanner from which input can be detected
    System.out.println("What is your name"); //The question is output to the user
    String name = kb.nextLine(); //The user is able to reply on the next line using their input device
    System.out.println("Hello "+name+"! How are you?"); //The program replies with concatenated output to the user
  }
}