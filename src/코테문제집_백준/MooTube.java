//15591번
package 코테문제집_백준;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class MooTube {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int question = Integer.parseInt(st.nextToken());
		ArrayList<Point> list[] = new ArrayList[n + 1];				

		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();		//배열안에 ArrayList를 넣는것임!!
		}

		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			list[p].add(new Point(q, r));
			list[q].add(new Point(p, r));
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
				for (Point d : list[temp]) {
					if (!visit[d.x] && d.y >= k) {
						cnt++;
						qu.offer(d.x);
						visit[d.x] = true;
					}
				}
			}
			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}
}
