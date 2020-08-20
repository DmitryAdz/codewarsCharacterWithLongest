package by.odinets.codewars.characterWithLongest;

import java.util.Arrays;

public class RunnerCharacter {

	public static void main(String[] args) {
		
		Object[] solution = Solution.longestRepetition("aaaabbaaaaaaaa");
		System.out.println("solution :: " + Arrays.toString(solution));
		
		Object[] solution1 = Solution.longestRepetition("");
		System.out.println("solution1 :: " + Arrays.toString(solution1));
	}

}
