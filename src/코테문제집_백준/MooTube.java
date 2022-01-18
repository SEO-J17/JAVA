//15591번
package 코테문제집_백준;

import java.io.*;
import java.util.*;

public class MooTube {
	static long arr[][];
	static int n, q;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		arr = new long[n + 1][n + 1];

		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			long val = Long.parseLong(st.nextToken());
			arr[x1][x2] = arr[x2][x1] = val;
		}

		find();
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			long k = Long.parseLong(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			long cnt = 0;

			for (int d = 1; d <= n; d++) {
				if (arr[v][d] >= k && v != d) {
					++cnt;
				}
			}
			sb.append(cnt).append("\n");
		}

		System.out.print(sb);

	}

	private static void find() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					continue;
				}

				if (arr[i][j] > 0) {
					long temp = arr[i][j];
					for (int k = 1; k <= n; k++) {
						if (k == j) {
							continue;
						}
						if (arr[j][k] > 0) {
							arr[i][k] = Math.min(temp, arr[j][k]);
						}

					}
				}

			}
		}
	}
}
