//πÈ¡ÿ 2447
package ¿Á±Õ;

import java.io.*;
import java.util.*;

public class ∫∞¬Ô±‚ {
	static String[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new String[n][n];

		calc(0, 0, n, false);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}

	
	private static void calc(int x, int y, int n, boolean isblank) {
		if (isblank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = " ";
				}
			}
			return;
		}

		if (n == 1) {
			arr[x][y] = "*";
			return;
		}

		int depth = n / 3;
		int cnt = 0; // ∫∞√‚∑¬ »Ωºˆ

		for (int i = x; i < x + n; i += depth) {
			for (int j = y; j < y + n; j += depth) {
				cnt++;
				if (cnt == 5) {
					calc(i, j, depth, true);
				} else {
					calc(i, j, depth, false);
				}
			}
		}
	}

}
