import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    System.out.println("What is your age?");
    int age = Integer.parseInt(kb.nextLine());
    if (age<10 && age>0)
    {
      System.out.println("Child");
    }
    else if (13<age && age<19)
    {
      System.out.println("Teen");  
    }
    else
    {
      System.out.println("Invalid input");
    }

  }
}