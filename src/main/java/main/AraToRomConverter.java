package main;

public class AraToRomConverter {
	public String convert(int arabicNumber){
		String result = "";
		while(arabicNumber>0){
			result += "I";
			arabicNumber--;
		}
		return result;
	}
}
