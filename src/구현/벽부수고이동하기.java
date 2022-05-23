package 구현;

import java.io.*;
import java.util.*;

public class 벽부수고이동하기 {
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int n, m;
	static int visit[][];

	static class Point {
		int x, y, cnt;
		int rep;

		public Point(int x, int y, int cnt, int rep) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.rep = rep;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int arr[][] = new int[n][m];
		visit = new int[n][m];
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.valueOf(temp.charAt(j) - '0');
				visit[i][j] = Integer.MAX_VALUE;
			}
		}

		System.out.println(calc(0, 0, arr));
	}

	private static int calc(int x, int y, int arr[][]) {
		Queue<Point> qu = new LinkedList<>();
		qu.add(new Point(x, y, 1, 0));
		visit[x][y] = 0;

		while (!qu.isEmpty()) {
			Point point = qu.poll();
			if (point.x == n - 1 && point.y == m - 1) {
				return point.cnt;
			}

			for (int i = 0; i < 4; i++) {
				int xx = point.x + dx[i];
				int yy = point.y + dy[i];

				if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
					if (visit[xx][yy] > point.rep) {
						if (arr[xx][yy] == 0) {
							qu.add(new Point(xx, yy, point.cnt + 1, point.rep));
							visit[xx][yy] = point.rep;
						} else {
							if (point.rep == 0) {
								qu.add(new Point(xx, yy, point.cnt + 1, point.rep + 1));
								visit[xx][yy] = point.rep + 1;
							}
						}
					}
				}
			}
		}

		return -1;
	}
}
