package ¹®ÀÚ¿­;

import java.io.*;
import java.util.*;

public class IOIOI_5525 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		sb.append("IOI");
		for (int i = 1; i < n; i++) {
			sb.append("OI");
		}
		String p = sb.toString();

		int cnt = 0;
		int s_len = s.length();
		int p_len = p.length();
		for (int i = 0; i < m; i++) {
			if (s_len - i >= p_len) {
				if (s.charAt(i) == 'I') {
					if (s.substring(i, p_len + i).contains(p)) {
						cnt++;
					}
				}
			} else {
				break;
			}
		}

		System.out.println(cnt);

	}
}
