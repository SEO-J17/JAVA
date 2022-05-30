package DFS;

import java.io.*;
import java.util.*;

public class 숨바꼭질 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 수빈이의 위치
		int k = Integer.parseInt(st.nextToken()); // 동생의 위치

		if (n >= k) {
			System.out.println(n - k);
		} else {
			System.out.println(calc(n, k));
		}

	}

	private static int calc(int n, int k) {
		Queue<Integer> qu = new LinkedList<>();
		int[] arr = new int[100001];

		qu.add(n);
		arr[n] = 1;

		while (!qu.isEmpty()) {
			int current = qu.poll();

			for (int i = 0; i < 3; i++) {
				int next = 0;

				if (i == 0) {
					next = current - 1;
				} else if (i == 1) {
					next = current + 1;
				} else {
					next = current * 2;
				}

				if (next == k) {
					return arr[current];
				}

				if (next >= 0 && next <= 100000) {
					if (arr[next] == 0) {
						qu.add(next);
						arr[next] = arr[current] + 1;
					}
				}
			}
		}

		return 0;

	}
}
