package main;

public class RomToAraConverter {
	public int convert(String romanNumber) {
		romanNumber=romanNumber.replaceAll("CM", "DCD");
		romanNumber=romanNumber.replaceAll("M", "DD");
		romanNumber=romanNumber.replaceAll("CD", "CCCC");
		romanNumber=romanNumber.replaceAll("D", "CCCCC");
		romanNumber=romanNumber.replaceAll("XC", "LXL");
		romanNumber=romanNumber.replaceAll("C", "LL");
		romanNumber=romanNumber.replaceAll("XL", "XXXX");
		romanNumber=romanNumber.replaceAll("L", "XXXXX");
		romanNumber=romanNumber.replaceAll("IX", "VIV");
		romanNumber=romanNumber.replaceAll("X", "VV");
		romanNumber=romanNumber.replaceAll("IV", "IIII");
		romanNumber=romanNumber.replaceAll("V", "IIIII");
		
		return romanNumber.length();
	}
}
