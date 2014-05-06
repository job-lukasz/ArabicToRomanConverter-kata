package main;

public class RomToAraConverter {

	public int convert(String romanNumber) {
		int currentChar = romanNumber.length();
		int arabNumber = 0;
		while(currentChar>0){
			if(romanNumber.charAt(currentChar-1) == 'I'){
				arabNumber++;
			}
			else {
				arabNumber+=5;	
			}
			currentChar--;
		}
		return arabNumber;
	}

}
