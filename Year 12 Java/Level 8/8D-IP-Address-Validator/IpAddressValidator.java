import java.io.*;
import java.util.*;

class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean check = true;
        int counter = 0;
        while (check = true){
            System.out.print("Please enter the ip (X to stop): ");
            String ip = input.nextLine();
            if (ip.equals("X")) {
                check = false;
            }
            else {
                ipValidator(ip);
            } 
        }

    }

    public static void ipValidator(String ip) {
        String[] splitIp = ip.split(":");
        boolean flag = true;
        for (int loop = 0;  loop != splitIp.length; loop++) {

            if (loop > 3){
                System.out.println("Invalid IPv4, more than 4 sections");
                flag = false;
            }


            if (splitIp[loop].length() > 3) {
                System.out.println("Invalid IPv4, there are more than 3 characters in one or more of the values");
                flag = false;
            }
        }
        if (flag){
            System.out.println("Valid IP");
        }
        

    }


}