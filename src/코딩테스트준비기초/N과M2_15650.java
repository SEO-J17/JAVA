package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class N과M2_15650 {
	static int n, m;
	static int arr[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		dfs(1, 0);

		System.out.println(sb);
	}

	private static void dfs(int node, int depth) {
		if (depth == m) {
			for (int d : arr) {
				sb.append(d).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = node; i <= n; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}
}
