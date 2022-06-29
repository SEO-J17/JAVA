package ¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOIOI_5525 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int answer = 0;
		int cnt = 0;
		for (int i = 1; i < m - 1; i++) {
			if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
				cnt++;
				if (cnt == n) {
					cnt--;
					answer++;
				}
				i++;
			} else {
				cnt = 0;
			}
		}

		System.out.println(answer);
	}
}
