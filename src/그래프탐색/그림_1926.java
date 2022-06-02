package 그래프탐색;

import java.io.*;
import java.util.*;

public class 그림_1926 {
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int n, m;
	static int cnt;
	static boolean visit[][];
	static int arr[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visit = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int area = 0;
		int max = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				cnt = 0;
				if (!visit[i][j] && arr[i][j] == 1) {
					area++;
					calc(i, j);
				}
				if (max < cnt) {
					max = cnt;
				}
			}
		}

		System.out.println(area);
		System.out.println(max);

	}

	private static void calc(int x, int y) {
		visit[x][y] = true;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
				if (!visit[xx][yy] && arr[xx][yy] == 1) {
					calc(xx, yy);
				}
			}
		}

	}
}
