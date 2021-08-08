package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class NM과K {
	static int n, m, k;
	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };
	static int arr[][];
	static boolean visit[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(calc(0, 0, 0, 0));

	}

	private static int calc(int x, int y, int sum, int depth) {
		if (depth == k) {
			return sum;
		}

		int max = Integer.MIN_VALUE;
		for (int i = x; i < n; i++) {
			for (int j = (i == x) ? y : 0; j < m; j++) {			//이게 ㅜ멀까...ㅠ
				if (check(i, j)) {
					visit[i][j] = true;
					int temp = calc(i, j, sum + arr[i][j], depth + 1);
					visit[i][j] = false;

					max = Math.max(max, temp);
				}
			}

		}
		return max;
	}

	private static boolean check(int x, int y) {
		if (visit[x][y]) {
			return false;
		}
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && yy >= 0 && xx < n && yy < m) {
				if (visit[xx][yy])
					return false;

			}
		}
		return true;

	}
}
