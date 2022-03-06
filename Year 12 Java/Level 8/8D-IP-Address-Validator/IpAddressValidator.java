import java.io.*;
import java.util.*;

class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean check = true;
        
        while (check = true){
            System.out.print("Please enter the IP address (X to stop): ");
            String ip = input.nextLine();
            if (ip.equals("X")) {
                check = false;
            }
            else {
                ipValidator(ip);
            } 
        }

    }
    public static string ipValidator(String ip) {
        String[] splitIp = ip.split(":");
        for (int loop = 0;  loop != splitIp.length; loop++) {

            if (loop > 3){
                return ("Invalid IPv4, more than 4 sections");
            }

            if ((int)splitIp[loop] != splitIp[loop]) {
                return ("Invalid IPv4, one or more of the values are not integers");
            }
            else{
                if ( 0 > (int)splitIp[loop] || (int)splitIp[loop] > 255) {
                    return ("Invalid IPv4, the integers are out of range");
                }
            }

            if (splitIp[loop].length > 3) {
                return ("Invalid IPv4, there are more than 3 characters in one or more of the values");
            }
        }

    }


}
