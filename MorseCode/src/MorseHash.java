import java.util.HashMap;

public class MorseHash {
	HashMap <String, String>  translator = new HashMap<>();
	
	public void morseToEnglish() {
	
	 translator.put(".-","A");
	 translator.put("-...","B");
	 translator.put("-.-.","C");
	 translator.put("-..","D");
	 translator.put(".","E");
	 translator.put("..-.","F");
	 translator.put("--.","G");
	 translator.put("....","H");
	 translator.put("..","I");
	 translator.put(".---","J");
	 translator.put("-.-","K");
	 translator.put(".-..","L");
	 translator.put("--","M");
	 translator.put("-.","N");
	 translator.put("---","O");
	 translator.put(".--.","P");
	 translator.put("--.-","Q");
	 translator.put(".-.","R");
	 translator.put("...","S");
	 translator.put("-","T");
	 translator.put("..-","U");
	 translator.put("...-","V");
	 translator.put(".--","W");
	 translator.put("-..-","X");
	 translator.put("-.--","Y");
	 translator.put("--..","Z");
	 translator.put(".----","1");
	 translator.put("..---","2");
	 translator.put("...--","3");
	 translator.put("....-","4");
	 translator.put(".....","5");
	 translator.put("-....","6");
	 translator.put("--...","7");
	 translator.put("---..","8");
	 translator.put("----.","9");
	 translator.put("-----","0");
	 translator.put("/"," ");
	 
	 
}
	public String letterPrinter(String morse) {
		
		morseToEnglish(); 
	
		return translator.get(morse);
		
	}
}
