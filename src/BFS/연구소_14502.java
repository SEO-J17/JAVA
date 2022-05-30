//14502
package BFS;

import java.util.*;
import java.awt.Point;
import java.io.*;

public class ������_14502 {
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int n, m;
	static int map[][];
	static int max_zone = Integer.MIN_VALUE;

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
			}
		}

		dfs(0);
		System.out.println(max_zone);
	}

	private static void dfs(int wall) {
		if (wall == 3) { // ���� 3���� �Ǹ� bfs�� ���̷��� �������� Ž������.
			bfs();
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

	private static void bfs() {
		Queue<Point> qu = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 2) {
					qu.add(new Point(i, j)); // ���̷��� ��ǥ�� ����
				}
			}
		}

		// ���� ���� �ջ��Ű�� �ʱ� ���� �� ī��.
		int copy_map[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			copy_map[i] = map[i].clone();
		}

		while (!qu.isEmpty()) {
			Point temp = qu.poll();
			for (int i = 0; i < 4; i++) {
				int xx = temp.x + dx[i];
				int yy = temp.y + dy[i];

				// ��ĭ�� ��쿡 ���̷����� ��Ʈ����.
				if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
					if (copy_map[xx][yy] == 0) {
						copy_map[xx][yy] = 2;
						qu.add(new Point(xx, yy));
					}
				}
			}
		}

		// ���������� �������� üũ�ϴ� �Լ�.
		check(copy_map);
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
		if(max_zone < cnt) {
			max_zone = cnt;
		}
	}
}
