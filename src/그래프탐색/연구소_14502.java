//14502
package 그래프탐색;

import java.util.*;
import java.awt.Point;
import java.io.*;

public class 연구소_14502 {
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int n, m;
	static int map[][];
	static int max_zone = Integer.MIN_VALUE;
	static ArrayList<Point> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) {
					list.add(new Point(i, j));
				}
			}
		}

		dfs(0);
		System.out.println(max_zone);
	}

	private static void dfs(int wall) {		//벽세우기
		if (wall == 3) { // 벽이 3개가 되면 바이러스 퍼짐상태 탐색시작.
			// 원본 맵을 손상시키지 않기 위해 맵 카피.
			int copy_map[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				copy_map[i] = map[i].clone();
			}
			
			for (Point point : list) {
				calc(point.x, point.y, copy_map);
			}
			
			check(copy_map);
			return;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					dfs(wall + 1);
					map[i][j] = 0;
				}
			}
		}

	}

	private static void calc(int x, int y, int[][] copy_map) {
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && yy >= 0 && xx < n && yy < m) {
				if (copy_map[xx][yy] == 0) {
					copy_map[xx][yy] = 2;
					calc(xx, yy, copy_map);
				}
			}
		}

	}

	private static void check(int[][] copy_map) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (copy_map[i][j] == 0) {
					cnt++;
				}
			}
		}
		if (max_zone < cnt) {
			max_zone = cnt;
		}
	}
}
