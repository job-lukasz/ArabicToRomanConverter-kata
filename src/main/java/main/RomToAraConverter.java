package main;

public class RomToAraConverter {
	public static final String convertersString[][] = { { "CM", "DCD" }, 
														   { "M", "DD" }, 
														   { "CD", "CCCC" },
														   { "D", "CCCCC" },
														   { "XC", "LXL" }, 
														   { "C", "LL" }, 
														   { "XL", "XXXX" },
														   { "L", "XXXXX" },
														   { "IX", "VIV" },
														   { "X", "VV" },
														   { "IV", "IIII" },
														   { "V", "IIIII" } 
														   };

	public int convert(String romanNumber) {
		for (int curConvStrNum = 0; curConvStrNum < 12; curConvStrNum++) {
			romanNumber = romanNumber.replaceAll(convertersString[curConvStrNum][0], convertersString[curConvStrNum][1]);
		}
		return romanNumber.length();
	}
}
