package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;
import java.util.*;

public class º½¹ö¸Ç_16918 {
	static char arr[][];
	static int n, m;
	static boolean visited[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		arr = new char[n][m];

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}

		StringBuilder sb = new StringBuilder();
		if (t % 2 == 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					sb.append("O");
				}
				sb.append("\n");
			}

			System.out.print(sb);
			return;
		} else {
			int time = 3;
			while (time <= t) {
				visited = new boolean[n][m];
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if (arr[i][j] == 'O') {
							calc(i, j);
						} else if (arr[i][j] == '.' && !visited[i][j]) {
							arr[i][j] = 'O';
							visited[i][j] = true;
						}
					}
				}
				time += 2;
			}
		}
		for (char[] d : arr) {
			for (char c : d) {
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static void calc(int x, int y) {
		int dx[] = { 0, 0, -1, 1 };
		int dy[] = { 1, -1, 0, 0 };
		visited[x][y] = true;
		arr[x][y] = '.';

		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
				if (!visited[xx][yy] && arr[xx][yy] == 'O') {
					continue;
				} else {
					visited[xx][yy] = true;
					arr[xx][yy] = '.';
				}
			}
		}
	}
}
