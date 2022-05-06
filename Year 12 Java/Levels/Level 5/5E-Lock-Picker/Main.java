import java.util.*;
class Main {
	public static void main(String[] args) {
		int max = 10;
		int min = 99;
		int loop = 0;
		while(true){
			loop++;	//Variable checks iteration number

			int ranInt = min + (int) (Math.random() * (max - min + 1));
			System.out.println(ranInt); //Random number generated and printed

			if (ranInt == 55){
				System.out.println("That took "+loop+" tries"); //Number of tries output
				break; //Loop exited

			}
		}

	}
}