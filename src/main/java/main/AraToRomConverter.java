package main;

public class AraToRomConverter {
	private int araNumber;
	
	
	public String convert(int arabicNumber){
		String result = "";
		araNumber = arabicNumber;
		while(araNumber>0){
			result+=findMaxRomanNumber();
		}
		return result;
	}
	
	private String findMaxRomanNumber(){
		if(araNumber>=10){
			araNumber-=10;
			return "X";
		}
		else if(araNumber>=5){
			araNumber-=5;
			return "V";
		}
		else{
			araNumber--;
			return "I";
		}
	}
}
