package 그래프탐색;

import java.awt.Point;
import java.io.*;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class 효율적인해킹_1325 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] list = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int temp1 = Integer.parseInt(st.nextToken());
			int temp2 = Integer.parseInt(st.nextToken());
			list[temp1].add(temp2);
		}

		int max = -1;

		int rank[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			calc(i, list, rank, n);
		}

		for (int i = 1; i <= n; i++) {
			if (max < rank[i]) {
				max = rank[i];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (max == rank[i]) {
				sb.append(i).append(" ");
			}
		}

		System.out.println(sb);

	}

	private static void calc(int i, ArrayList<Integer>[] list, int[] rank, int n) {
		Queue<Integer> qu = new LinkedList<>();
		boolean[] visit = new boolean[n + 1];
		qu.add(i);
		visit[i] = true;
		while (!qu.isEmpty()) {
			int node = qu.poll();
			for (int d : list[node]) {
				if (!visit[d]) {
					visit[d] = true;
					rank[d]++;
					qu.add(d);
				}
			}
		}
	}
}
