package 구현;

import java.awt.Point;
import java.io.*;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class 맥주마시면서걸어가기_9205 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < tc; k++) {
			int n = Integer.parseInt(br.readLine());
			Point arr[] = new Point[n + 2];

			for (int i = 0; i < n + 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			
			ArrayList<ArrayList<Integer>> list = new ArrayList<>();
			for (int i = 0; i < n + 2; i++) {
				list.add(new ArrayList<>());
			}

			for (int i = 0; i < n + 1; i++) {
				for (int j = i + 1; j < n + 2; j++) {
					if (Math.abs(arr[i].x - arr[j].x) + Math.abs(arr[i].y - arr[j].y) <= 1000) {
						list.get(i).add(j);
						list.get(j).add(i);
					}
				}
			}
			
			if (calc(list, n)) {
				sb.append("happy");
			}else {
				sb.append("sad");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
		
	}

	private static boolean calc(ArrayList<ArrayList<Integer>> list, int n) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(0);
		boolean visit[] = new boolean[n+2];
		visit[0] = true;

		while (!qu.isEmpty()) {
			int temp = qu.poll();
			
			if (temp == n + 1) {
				return true;
			}
			for (int d : list.get(temp)) {
				if (!visit[d]) {
					visit[d] = true;
					qu.add(d);
				}
			}
		}
		
		return false;
	}
}
