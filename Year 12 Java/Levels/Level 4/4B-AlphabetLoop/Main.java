class Main {
	public static void main(String[] args) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //String contains all alphabet letters in order
		for (int loop = 0; loop < 26; loop++) { //Loop runs 26 times
			System .out .println((loop+1)+" - "+alphabet.charAt(loop)); //Number of the letter and letter iteslf printed
		}
	}
}
