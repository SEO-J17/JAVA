package ���ڵ�;

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

//substring �ϸ鼭 character�� �ݺ����� �ʰ�, ���� �� ���ڿ��� ���̸� ���ϴ� ��������.
//charAt�� �ذ��� �ϳ��� ���ϸ鼭 contains�� �ߺ��Ǵ� ���ڰ� �ִ��� üũ��, üũ�ȴٸ� break�� �ɾ���.

