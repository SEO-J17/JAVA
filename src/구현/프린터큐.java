//1966
package 구현;

import java.io.*;
import java.util.*;

public class 프린터큐 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int paper = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());

			int arr[] = new int[paper];

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < paper; j++) {
				int temp = Integer.parseInt(st.nextToken());
				qu.add(temp);
				arr[j] = temp;
			}

			if (paper == 1) {
				sb.append(1).append("\n");
				continue;
			}

			int cnt = 0;
			while (!qu.isEmpty()) {
				for (int d = 0; d < paper; d++) {
					if (qu.peek() == arr[d]) {
						cnt++;
						qu.poll();
						if (target == d) {
							sb.append(cnt).append("\n");
							qu.clear();
							break;
						}
					}
				}
			}

		}

		System.out.println(sb);
	}
}
