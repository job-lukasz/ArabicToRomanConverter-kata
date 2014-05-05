package main;

public class AraToRomConverter {
	public String convert(int arabicNumber){
		String result = "";
		while(arabicNumber>0){
			if(arabicNumber>=5){
				result+="V";
				arabicNumber-=5;
			}
			else{
				result += "I";
				arabicNumber--;
			}
		}
		return result;
	}
}
