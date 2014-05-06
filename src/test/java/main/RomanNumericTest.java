package main;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RomanNumericTest {
	@DataProvider(name = "TestingNumbers")
	public Object[][] numbersArabicRoman() {
		return new Object[][] { 
				{ new Integer(0), "" }, 
				{ new Integer(1), "I" }, 
				{ new Integer(2), "II" },
				{ new Integer(4), "IV" }, 
				{ new Integer(5), "V" },
				{ new Integer(9), "IX" },  
				{ new Integer(10), "X" },
				{ new Integer(40), "XL" }, 
				{ new Integer(50), "L" },
				{ new Integer(90), "XC" }, 
				{ new Integer(100), "C" },
				{ new Integer(400), "CD" }, 
				{ new Integer(500), "D" },
				{ new Integer(900), "CM" }, 
				{ new Integer(1000), "M" },
				{ new Integer(1999), "MCMXCIX" }, 
				{ new Integer(3448), "MMMCDXLVIII" }, 
				{ new Integer(1684), "MDCLXXXIV" }, 
				};
	}

	@Test(dataProvider = "TestingNumbers")
	public void ArabicNumberToRomanString(int arabic, String roman) {
		// Arrange
		AraToRomConverter converter = new AraToRomConverter();
		// Act
		String result = converter.convert(arabic);
		// Assert
		Assert.assertEquals(result, roman);
	}
	
	@Test
	public void RomanStringIToArabNumber1() {
		// Arrange
		RomToAraConverter converter = new RomToAraConverter();
		// Act
		int result = converter.convert("I");
		// Assert
		Assert.assertEquals(result, 1);
	}
	
	@Test
	public void RomanStringIIToArabNumber2() {
		// Arrange
		RomToAraConverter converter = new RomToAraConverter();
		// Act
		int result = converter.convert("II");
		// Assert
		Assert.assertEquals(result, 2);
	}
}
