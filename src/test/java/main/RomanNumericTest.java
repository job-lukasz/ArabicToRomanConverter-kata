package main;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RomanNumericTest {
  @Test
  public void ZeroNumberToEmptyString() {
	  //Arrange
	  AraToRomConverter converter = new AraToRomConverter();
	  //Act
	  String result = converter.convert(0);
	  //Assert
	  Assert.assertEquals(result, "");
  }
  @Test
  public void OneNumberToIString() {
	  //Arrange
	  AraToRomConverter converter = new AraToRomConverter();
	  //Act
	  String result = converter.convert(1);
	  //Assert
	  Assert.assertEquals(result, "I");
  }
}