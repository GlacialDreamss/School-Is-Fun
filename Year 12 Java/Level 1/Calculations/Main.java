class Main {
    public static void main(String[] args) {
      int num1 = 1, num2 = 1, num3 = 1; //The three numbers are declared as integers and initialised
      double num4 = 1.1, num5 = num1+num2+num3+num4, num6 = num5/3, num7 = num6*2, num8 = num7-9; //Calculations are performed with the numbers and need to be saved as doubles due to not being whole integers
      System.out.println("Starting numbers: "+num1+", "+num2+", "+num3+", "+num4+"\nCalculation 1 = "+num5+"\nCalculation 2 = "+num6+"\nCalculation 3 = "+num7+"\nCalculation 4 = "+num8); //The result of the calculations and starting numbers are output
    }
  }