package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 스타트와링크_14889 {
	static int arr[][];
	static boolean visit[];
	static int result = Integer.MAX_VALUE;
	static int n;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		calc(0, 1);
		
		System.out.print(result);

	}

	
	
	private static void calc(int depth, int node) {
		if (depth == n / 2) {
			result = Math.min(result, solve());
			return;
		}

		for (int i = node; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				calc(depth + 1, i);
				visit[i] = false;
			}
		}
	}

	
	
	private static int solve() {
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
