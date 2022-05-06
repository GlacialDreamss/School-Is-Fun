class Main {
	public static void main(String[] args) {
		String[] names = {"Alex", "Jack", "Jeff", "John"};
		int[][] grades = {{23, 45, 56}, {12, 34, 45}, {34, 22, 24}, {44, 26, 28}}; //Both lists containing ready made data are defined
		
		double subjectTotal = 0;
		double studentTotal = 0; //The totals are defined as doubles so decimal places are output

		System.out.println("Names\tS1\tS2\tS3");
		for(int array = 0; array != 4; array++){
			System.out.println(names[array]+"\t"+grades[array][0]+"\t"+grades[array][1]+"\t"+grades[array][2]); //The array is printed out using index values and iteration
		}

		System.out.println("");
		
		for(int scoreIndex = 0; scoreIndex != 3; scoreIndex++){ //The scores are printed using nested loops that iterate through different indexes
			subjectTotal = 0;

			System.out.println("The average score for subject "+(scoreIndex+1));
			
			for(int studentIndex = 0; studentIndex != 4; studentIndex++){
				subjectTotal += grades[studentIndex][scoreIndex];
			}
			System.out.println((subjectTotal / 4));

		}

		System.out.println("");

		for(int scoreIndex = 0; scoreIndex != 4; scoreIndex++){
			subjectTotal = 0;

			System.out.println("The average score for student "+(scoreIndex+1));
			
			for(int studentIndex = 0; studentIndex != 3; studentIndex++){
				subjectTotal += grades[scoreIndex][studentIndex];
			}
			System.out.println((subjectTotal / 3));

		}
		
	}
}