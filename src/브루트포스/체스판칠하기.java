//백준 1018
package 브루트포스;

import java.io.*;
import java.util.*;

public class 체스판칠하기 {
	static String arr[][];
	static int n, m;
	static int min = 64;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new String[n][m];
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = String.valueOf(temp.charAt(j));
			}
		}

		int xx = n - 7;
		int yy = m - 7;

		for (int i = 0; i < xx; i++) {
			for (int j = 0; j < yy; j++) {
				calc(i, j);
			}
		}

		System.out.println(min);

	}

	private static void calc(int x, int y) {
		int xx = x + 8;
		int yy = y + 8;
		String first = arr[x][y];
		int cnt = 0;

		for (int i = x; i < xx; i++) {
			for (int j = y; j < yy; j++) {
				if (!arr[i][j].equals(first)) {
					cnt++;
				}

				if (first.equals("B")) {
					first = "W";
				} else
					first = "B";
			}

			if (first.equals("B")) {
				first = "W";
			} else
				first = "B";

		}

		cnt = Math.min(cnt, 64 - cnt);
		// 현재 cnt값이 min 보다 작으면 갱신
		min = Math.min(min, cnt);

	}
}
