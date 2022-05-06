import java.util.*; //Utilities library imported to allow Scanner function to be used
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); //Keyboard declare and initialised as input device
    System.out.println("What is your name?:"); //User provided with question
    String name = kb.nextLine();
    System.out.println("Nice to met you "+name+". What year were you born in?");
    String year = kb.nextLine(); //User input stored in year variable
    int yearNum = Integer.parseInt(year); //The user input is converted into an integer for calculations
    int lastYear = 2020 - yearNum, nextYear = 2022 - yearNum; //Calculations are performed and stored in new variables
    System.out.println("Last year you were "+lastYear+".\nNext year you will be "+nextYear); //Output provided to the user
  }
}