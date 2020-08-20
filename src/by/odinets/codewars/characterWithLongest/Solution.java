package by.odinets.codewars.characterWithLongest;

public class Solution {

	public static Object[] longestRepetition(String s) {
		
		String letterSample = "";
		int numbLetter = 0;
		int maxNumbLetter = 0;
		String letterOut = "";
		for(int i = 0; i < s.length(); i++) {
			String letter = s.substring(i, i+1);
			if(letter.equalsIgnoreCase(letterSample)) {
				numbLetter++;
			} else {
				letterSample = letter;
				numbLetter = 1;
			}
			if(numbLetter > maxNumbLetter) {
				letterOut = letter;
				maxNumbLetter = numbLetter;
			}
		}
		if(maxNumbLetter > 0) {
			return new Object[] {letterOut, maxNumbLetter};
		}
        return new Object[]{"", 0};
    }
}
