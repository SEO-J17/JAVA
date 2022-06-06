package 문자열;

import java.io.*;
import java.util.*;

public class 팰린드롬만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int result = str.length();

		for (int i = 0; i < str.length(); i++) {
			if (calc(str.substring(i))) {
				break;
			}
			result++;
		}
		System.out.println(result);
	}

	private static boolean calc(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
