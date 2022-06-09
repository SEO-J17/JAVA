package 릿코드;

public class LongestSubstringWithoutRepeatingCharacters_3 {
	class Solution {
		public int lengthOfLongestSubstring(String s) {
			int answer = 0;
			for (int i = 0; i < s.length(); i++) {
				String temp = "";
				for (int j = i; j < s.length(); j++) {
					if (!temp.contains(String.valueOf(s.charAt(j)))) {
						temp += String.valueOf(s.charAt(j));
						if (answer < temp.length()) {
							answer = temp.length();
						}
					} else {
						break;
					}
				}
			}
			return answer;
		}
	}
}

//substring 하면서 character가 반복되지 않고, 가장 긴 문자열의 길이를 구하는 문제였다.
//charAt을 해가며 하나씩 더하면서 contains로 중복되는 문자가 있는지 체크해, 체크된다면 break를 걸었다.

