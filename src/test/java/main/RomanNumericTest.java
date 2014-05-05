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
				{ new Integer(5), "V" },
				{ new Integer(10), "X" },
				{ new Integer(50), "L" },
				{ new Integer(100), "C" },
				{ new Integer(500), "D" },
				{ new Integer(1000), "M" },
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
}
