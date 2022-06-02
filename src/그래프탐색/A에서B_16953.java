package 그래프탐색;

import java.io.*;
import java.util.*;

public class A에서B_16953 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		System.out.println(calc(a, b, 0));
	}

	private static int calc(long a, long b, int cnt) {
		Queue<Long> qu = new LinkedList<>();
		qu.add(a);

		while (!qu.isEmpty()) {
			int size = qu.size();
			for (int i = 0; i < size; i++) {
				long node = qu.poll();
				if (node == b) {
					return cnt + 1;
				}
				if (node * 2 <= b) {
					qu.add(node * 2);
				}
				if (node * 10 + 1 <= b) {
					qu.add(node * 10 + 1);
				}
			}
			cnt++;
		}
		return -1;
	}
}
