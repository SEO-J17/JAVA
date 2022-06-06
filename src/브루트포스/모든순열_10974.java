package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모든순열_10974 {
	static int n;
	static int arr[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		visit = new boolean[n];
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int depth) {
		if (depth == n) {
			for (int d : arr) {
				sb.append(d).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(depth + 1);
				visit[i] = false;
			}
		}
	}
}
