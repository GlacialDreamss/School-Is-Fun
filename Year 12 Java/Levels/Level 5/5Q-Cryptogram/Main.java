import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true){
			System.out.println("\nWhat do you want to do?\n1. Encrypt plaintext\n2. Decrypt ciphertext\n3. Terminate program");
			String choice = input.nextLine();

			if (choice.equals("1")){
				System.out.println("Please enter your plaintext");
				String plaintext = input.nextLine().toUpperCase();

				for(int loop = 0; loop != plaintext.length(); loop++){
					int plus13 = (int)plaintext.charAt(loop);
					if((int)plaintext.charAt(loop) == ' ' ){}
					 	
					else if(plus13 < 78){
						System.out.print((char)(plus13+13));
					}
					else{
						System.out.print((char)(plus13-13));
					} 

				}
			}
			else if (choice.equals("2")){
				System.out.println("Please enter your plaintext");
				String plaintext = input.nextLine().toUpperCase();

				for(int loop = 0; loop != plaintext.length(); loop++){
					int plus13 = (int)plaintext.charAt(loop);
					if((int)plaintext.charAt(loop) == ' ' ){}
					 	
					else if(plus13 < 78){
						System.out.print((char)(plus13-13));
					}
					else{
						System.out.print((char)(plus13+13));
					} 

				}
			}
			else if (choice.equals("3")){break;}
		}
		
	}
}