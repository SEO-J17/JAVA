//백준 14466
package 코테문제집_백준;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class 소가길을건너간이유6 {
	static int n, k, r;
	static ArrayList<Point> list[][];
	static int cows[][];
	static boolean visit[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		cows = new int[n + 1][n + 1];
		visit = new boolean[n + 1][n + 1];
		list = new ArrayList[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
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
			cows[x][y] = 1;
		}

		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (list[i][j] != null ) {
					visit[i][j] = true;
					for (Point d : list[i][j]) {
						if (cows[d.x][d.y] == 1 && visit[d.x][d.y] != true) {
							cnt++;
						}
					}
				}
			}
		}

		System.out.println(cnt);

	}
}