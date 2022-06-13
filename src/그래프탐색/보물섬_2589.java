package ±×·¡ÇÁÅ½»ö;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class º¸¹°¼¶_2589 {
	static int n, m, distance = 0;
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		char arr[][] = new char[n][m];

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 'L') {
					calc(i, j, arr);
				}
			}
		}

		System.out.println(distance);

	}

	private static void calc(int x, int y, char[][] arr) {
		Queue<Point> qu = new LinkedList();
		int temp[][] = new int[n][m];
		boolean visit[][] = new boolean[n][m];
		qu.add(new Point(x, y));
		visit[x][y] = true;
		
		while (!qu.isEmpty()) {
			Point point = qu.poll();
			int cx = point.x;
			int cy = point.y;
			for (int i = 0; i < 4; i++) {
				int xx = cx + dx[i];
				int yy = cy + dy[i];
				if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
					if (!visit[xx][yy]&& temp[xx][yy] == 0 && arr[xx][yy] == 'L') {
						temp[xx][yy] = temp[cx][cy] + 1;
						visit[xx][yy] = true;
						qu.add(new Point(xx, yy));
						distance = Math.max(distance, temp[xx][yy]);
					}
				}
			}
		}
	}
}
