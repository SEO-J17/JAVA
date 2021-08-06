//1748
package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class BF_수이어쓰기1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int len = str.length() - 1;
		int result = 0;

		for (int i = 0; i < len; i++) {
			if (i == 0) {
				result += 9 * (int) Math.pow(10, i);
			} else
				result += 9 * (int) Math.pow(10, i) * (i + 1);
		}

		result += str.length() * ((Integer.parseInt(str) - (int) Math.pow(10, len)) + 1);

		System.out.println(result);
	}
}
