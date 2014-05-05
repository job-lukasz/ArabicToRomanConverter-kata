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
	 };
	}

  @Test(dataProvider = "TestingNumbers")
  public void ArabicNumberToRomanString(int arabic, String roman) {
	  //Arrange
	  AraToRomConverter converter = new AraToRomConverter();
	  //Act
	  String result = converter.convert(arabic);
	  //Assert
	  Assert.assertEquals(result, roman);
  }
}
