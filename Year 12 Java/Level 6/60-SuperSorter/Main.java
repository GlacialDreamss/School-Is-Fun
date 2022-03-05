import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] nameList = {"Superman","Batman","Hulk","Thor","Iron Man","Deadpool","Groot"};
		int[] strengthList = {5,1,10,6,2,3,4};
		boolean[] availableList= {true,true,true,false,true,true,false};

		LinkedList<String> names = new LinkedList<String>();
		LinkedList<Integer> strength = new LinkedList<Integer>();
		LinkedList<Boolean> available = new LinkedList<Boolean>();

		for(int loop = 0; loop != 7; loop++ ){ //Arrays converted to linkedlists
			names.add(nameList[loop]);
			strength.add(strengthList[loop]);
			available.add(availableList[loop]);

		}

		while(true){
			System.out.println("Would you like to sort by\nA: Name\nB: Strength\nC: Availability"); //User's input gathered
			String choice = input.nextLine();

			if(choice.toUpperCase().equals("A")){
				for(int index = 0; index != 7; index++){

					for(int index2 = 0; index2 != 7; index2++){

						if(names.get(index).length() > names.get(index2).length()){ //If A input, bubble sort on all values
							String placeholder = names.get(index);
							names.set(index, names.get(index2));
							names.set(index2, placeholder);

							int placeStrength =  strength.get(index);
							strength.set(index, strength.get(index2));
							strength.set(index2, placeStrength);

							boolean placeAvail = available.get(index);
							available.set(index, available.get(index2));
							available.set(index2, placeAvail);
						}
					}
				}
				for(int rows = 0; rows != 7; rows++){ //Data output in table
					System.out.printf("%-12s", names.get(rows) );
					System.out.printf("%-5s", strength.get(rows));
					System.out.println( available.get(rows));
				}

			}
			else if(choice.toUpperCase().equals("B")){ //If B input, bubble sort on all values
				for(int index = 0; index != 7; index++){

					for(int index2 = 0; index2 != 7; index2++){

						if(strength.get(index) > strength.get(index2)){
							String placeholder = names.get(index);
							names.set(index, names.get(index2));
							names.set(index2, placeholder);

							int placeStrength =  strength.get(index);
							strength.set(index, strength.get(index2));
							strength.set(index2, placeStrength);

							boolean placeAvail = available.get(index);
							available.set(index, available.get(index2));
							available.set(index2, placeAvail);
						}
					}
				}
				for(int rows = 0; rows != 7; rows++){
					System.out.printf("%-12s", names.get(rows) );
					System.out.printf("%-5s", strength.get(rows));
					System.out.println( available.get(rows));
				}

			}
			else if(choice.toUpperCase().equals("C")){ //If C input, bubble sort on all values except false ones as they filter to the back as a result
				for(int index = 0; index != 7; index++){

					for(int index2 = 0; index2 != 7; index2++){
						
					
						if(available.get(index) == true){
							String placeholder = names.get(index);
							names.set(index, names.get(index2));
							names.set(index2, placeholder);

							int placeStrength =  strength.get(index);
							strength.set(index, strength.get(index2));
							strength.set(index2, placeStrength);

							boolean placeAvail = available.get(index);
							available.set(index, available.get(index2));
							available.set(index2, placeAvail);
						}
					}
				}
				for(int rows = 0; rows != 7; rows++){
					System.out.printf("%-12s", names.get(rows) );
					System.out.printf("%-5s", strength.get(rows));
					System.out.println( available.get(rows));
				}

			}
			else{
				System.out.print("Invalid");
				break;
			}
			
			System.out.print("Would you like to try again? Y/N");
			String choice2 = input.nextLine().toUpperCase();
			if(choice2.equals("N")){ //Id user chooses, program is quit
				break;
			}
		}
	}
}