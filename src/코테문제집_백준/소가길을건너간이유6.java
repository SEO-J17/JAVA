//백준 14466
package 코테문제집_백준;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class 소가길을건너간이유6 {
	static int n, k, r, cnt = 0;
	static ArrayList<Point> list[][];
	static Point cows[];
	static boolean visit[][];
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		
		cows = new Point[k];
		list = new ArrayList[n + 1][n + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				list[i][j] = new ArrayList<>();
			}
		}

		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int xx = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			
			list[x][y].add(new Point(xx, yy));
			list[xx][yy].add(new Point(x, y));
		}

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			cows[i] = new Point(x, y);
		}

		for (int i = 0; i < k; i++) {
			visit = new boolean[n + 1][n + 1];
			calc(cows[i].x, cows[i].y);

			for (int j = i; j < k; j++) {
				Point d = cows[j];
				if (!visit[d.x][d.y]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

	private static void calc(int x, int y) {
		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			if (xx <= 0 || xx > n || yy <= 0 || yy > n)
				continue;
			
			if (visit[xx][yy])
				continue;
			
			if (list[x][y].contains(new Point(xx, yy)))
				continue;
			
			calc(xx, yy);
		}
	}
}