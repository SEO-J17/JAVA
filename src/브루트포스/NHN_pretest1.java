package 브루트포스;

import java.io.*;
import java.util.*;

public class NHN_pretest1 {
	static int n, num;
	static int arr[][];
	static boolean visit[][];
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			num = 1;
			for (int j = 0; j < n; j++) {
				if (!visit[i][j] && arr[i][j] == 1) {
					cnt++;
					dfs(i, j);
					list.add(num);
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		for (int d : list) {
			System.out.print(d + " ");
		}
	}

	private static void dfs(int x, int y) {
		visit[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && yy >= 0 && xx < n && yy < n) {
				if (!visit[xx][yy] && arr[xx][yy] == 1) {
					num++;
					dfs(xx, yy);
				}
			}
		}
	}
}
