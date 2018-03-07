import java.util.Scanner;

public class InputOutput {
MorseHash mH = new MorseHash();

	public String input(){
		System.out.println("input morse code");
		Scanner sc = new Scanner (System.in);
		
		String morse = sc.nextLine();
		return morse;
	}
	
	public String[] splitter(String morse) {
		String [] letter = morse.split(" ");
		return letter;
	}
	public void translator() {
		
	String morse =	input();
	
	String[] letters = splitter(morse);
	
	for (String i : letters ) {
		
		System.out.print(mH.letterPrinter(i));
	}
	
	
	}
	}
