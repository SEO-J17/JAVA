package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 링크와스타트_15661 {
	static int result = Integer.MAX_VALUE;
	static int n;
	static int arr[][];
	static boolean visit[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visit = new boolean[n];
		arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		search(0, 1);
		System.out.print(result);

	}

	private static void search(int depth, int node) {
		if (depth == n) {
			result = Math.min(result, calc());
			return;
		}

		for (int i = node; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				search(depth + 1, i);
				visit[i] = false;
			}
		}

	}

	
	
	private static int calc() {
		int a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				if (visit[i] && visit[j]) {
					a += arr[i][j];
				} else if (!visit[i] && !visit[j]) {
					b += arr[i][j];
				}
			}
		}

		return Math.abs(a - b);

	}
}
