package main;


public class RomToAraConverter {
	public int convert(String romanNumber) {
		romanNumber=romanNumber.replaceAll("X", "VV");
		romanNumber=romanNumber.replaceAll("V", "IIIII");
		return romanNumber.length();
	}
}
