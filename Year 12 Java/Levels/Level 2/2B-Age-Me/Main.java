import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); //The keyboard is set as the input device for the user
    System.out.println("What is your name?"); //The question is output to the user
    String name = kb.nextLine(); //The user is able to reply to the question on the next line
    System.out.println("How old are you?"); 
    String age = kb.nextLine();
    int agenum = Integer.parseInt(age);
    int age10 = agenum+10; //10 is added to the user's input age
    System.out.println("Well "+name+" in 10 years time you'll be "+age10); //The program concatenates the input from the user and outputs it 
  }
}