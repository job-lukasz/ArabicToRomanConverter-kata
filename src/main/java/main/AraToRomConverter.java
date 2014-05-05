package main;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AraToRomConverter {
	private int arabicNumber;

	private static final Map<Integer, String> numberMap;
	static {
		Map<Integer, String> tempMap = new TreeMap<Integer, String>(java.util.Collections.reverseOrder());
		tempMap.put(1, "I");
		tempMap.put(4, "IV");
		tempMap.put(5, "V");
		tempMap.put(9, "IX");
		tempMap.put(10, "X");
		tempMap.put(40, "XL");
		tempMap.put(50, "L");
		tempMap.put(90, "XC");
		tempMap.put(100, "C");
		tempMap.put(400, "CD");
		tempMap.put(500, "D");
		tempMap.put(900, "CM");
		tempMap.put(1000, "M");
		numberMap = Collections.unmodifiableMap(tempMap);
	}

	private Iterator<Integer> arabicNumberSetIt;
	private int currentRomanNumber;

	public String convert(int numberToConvert) {
		StringBuilder result = new StringBuilder();
		arabicNumber = numberToConvert;
		initIterator();
		while (arabicNumber > 0) {
			result.append(findMaxRomanNumber());
		}
		return result.toString();
	}

	private void initIterator() {
		arabicNumberSetIt = numberMap.keySet().iterator();
		currentRomanNumber = arabicNumberSetIt.next();
	}

	private String findMaxRomanNumber() {
		if (currentRomanNumber <= arabicNumber) {
			arabicNumber -= currentRomanNumber;
			return numberMap.get(currentRomanNumber);
		}
		if (arabicNumberSetIt.hasNext()) {
			currentRomanNumber = arabicNumberSetIt.next();
		}
		return "";
	}
}