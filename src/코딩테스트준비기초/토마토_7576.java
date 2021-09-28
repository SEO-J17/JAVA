package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 토마토_7576 {
	static int n, m, cnt;
	static int arr[][];
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	static Queue<Dot> qu = new LinkedList<>();

	private static class Dot {
		int x;
		int y;
		int cnt;

		public Dot(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					qu.add(new Dot(i, j, 0));
				}

			}
		}

		calc();

	}

	private static void calc() {
		while (!qu.isEmpty()) {
			Dot dot = qu.poll();
			cnt = dot.cnt;

			for (int i = 0; i < 4; i++) {
				int xx = dot.x + dx[i];
				int yy = dot.y + dy[i];
				if (xx >= 0 && yy >= 0 && xx < m && yy < n) {
					if (arr[xx][yy] == 0) {
						arr[xx][yy] = 1;
						qu.add(new Dot(xx, yy, cnt + 1));
					}
				}
			}
		}

		if (chktomato()) {
			System.out.println(cnt);
		} else
			System.out.println(-1);

	}

	private static boolean chktomato() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					return false;
				}
			}
		}

		return true;

	}
}
