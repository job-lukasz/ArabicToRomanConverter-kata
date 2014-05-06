package main;


public class RomToAraConverter {
	public int convert(String romanNumber) {
		romanNumber=romanNumber.replaceAll("M", "DD");
		romanNumber=romanNumber.replaceAll("D", "CCCCC");
		romanNumber=romanNumber.replaceAll("C", "LL");
		romanNumber=romanNumber.replaceAll("L", "XXXXX");
		romanNumber=romanNumber.replaceAll("X", "VV");
		romanNumber=romanNumber.replaceAll("V", "IIIII");
		return romanNumber.length();
	}
}
