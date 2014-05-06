package main;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RomanNumericTest {
	@DataProvider(name = "ArabToRomanTestingNumbers")
	public Object[][] numbersArabicRoman() {
		return new Object[][] { { new Integer(0), "" }, { new Integer(1), "I" }, { new Integer(2), "II" }, { new Integer(4), "IV" },
				{ new Integer(5), "V" }, { new Integer(9), "IX" }, { new Integer(10), "X" }, { new Integer(40), "XL" },
				{ new Integer(50), "L" }, { new Integer(90), "XC" }, { new Integer(100), "C" }, { new Integer(400), "CD" },
				{ new Integer(500), "D" }, { new Integer(900), "CM" }, { new Integer(1000), "M" }, { new Integer(1999), "MCMXCIX" },
				{ new Integer(3448), "MMMCDXLVIII" }, { new Integer(1684), "MDCLXXXIV" }, };
	}

	@DataProvider(name = "RomanToArabTestingNumbers")
	public Object[][] numbersRomanArabic() {
		return new Object[][] { { "", new Integer(0) }, 
								 { "I", new Integer(1) }, 
								 { "II", new Integer(2) },
								 { "V", new Integer(5)},
								 { "X", new Integer(10)},
								 { "L", new Integer(50)},
								 { "C", new Integer(100)},
								 { "D", new Integer(500)},
								 { "M", new Integer(1000)},
								 { "IV", new Integer(4)},
								 { "IX", new Integer(9)},
								 { "XL", new Integer(40)},
								 { "XC", new Integer(90)},
								 { "CD", new Integer(400)},
								 { "CM", new Integer(900)},
								 { "MMMCDXLVIII",new Integer(3448) }
								 };
	}

	@Test(dataProvider = "ArabToRomanTestingNumbers")
	public void ArabicNumberToRomanString(int arabic, String roman) {
		// Arrange
		AraToRomConverter converter = new AraToRomConverter();
		// Act
		String result = converter.convert(arabic);
		// Assert
		Assert.assertEquals(result, roman);
	}

	@Test(dataProvider = "RomanToArabTestingNumbers")
	public void RomanStringToArabNumber(String roman, int arabic) {
		// Arrange
		RomToAraConverter converter = new RomToAraConverter();
		// Act
		int result = converter.convert(roman);
		// Assert
		Assert.assertEquals(result, arabic);
	}
}
