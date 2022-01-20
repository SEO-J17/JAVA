//15591번
package 코테문제집_백준;

import java.io.*;
import java.util.*;

public class MooTube {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int question = Integer.parseInt(st.nextToken());
		ArrayList<int[]>[] list = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<int[]>();
		}

		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			list[p].add(new int[] { q, r });
			list[q].add(new int[] { p, r });
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < question; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			Queue<Integer> qu = new LinkedList<>();
			boolean[] visit = new boolean[n + 1];
			visit[v] = true;

			qu.offer(v);
			while (!qu.isEmpty()) {
				int temp = qu.poll();
				for (int[] d : list[temp]) {
					if (!visit[d[0]] && d[1] >= k) {
						cnt++;
						qu.offer(d[0]);
						visit[d[0]] = true;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}
}
