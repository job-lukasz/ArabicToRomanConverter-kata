package main;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AraToRomConverter {
	private int araNumber;
	
	private static final Map<Integer, String> numberMap;
    static {
        Map<Integer, String> tempMap = new TreeMap<Integer, String>(java.util.Collections.reverseOrder());
        tempMap.put(10, "X");
        tempMap.put(5, "V");
        tempMap.put(1, "I");
        numberMap = Collections.unmodifiableMap(tempMap);
    }
    
    private Iterator<Integer> arabicNumberSetIt;
    private int currentRomanNumber;
    
	public String convert(int numberToConvert){
		String result = "";
		araNumber = numberToConvert;
		initIterator();
		while(araNumber>0){
			result+=findMaxRomanNumber();
		}
		return result;
	}
	
	private void initIterator() {
		arabicNumberSetIt = numberMap.keySet().iterator();
		currentRomanNumber = arabicNumberSetIt.next();
	}

	private String findMaxRomanNumber(){
		if(currentRomanNumber<=araNumber){
			araNumber-=currentRomanNumber;
			return numberMap.get(currentRomanNumber);
		}
		if(arabicNumberSetIt.hasNext()){
			currentRomanNumber = arabicNumberSetIt.next();
		}
		return "";
	}
}