package 그래프탐색;

import java.io.*;
import java.util.*;

public class 음식물피하기_1743 {
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int trash = Integer.parseInt(st.nextToken());
		int arr[][] = new int[n][m];

		for (int i = 0; i < trash; i++) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
		}

		int max = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				cnt = 0;
				if (arr[i][j] == 1) {
					calc(i, j, arr, n, m);
				}
				if (max < cnt) {
					max = cnt;
				}
			}
		}
		System.out.println(max);
	}

	private static void calc(int x, int y, int[][] arr, int n, int m) {
		arr[x][y] = 0;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
				if (arr[xx][yy] == 1) {
					calc(xx, yy, arr, n, m);
				}
			}
		}

	}
}
