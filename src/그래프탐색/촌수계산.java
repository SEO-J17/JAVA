//2644
package 그래프탐색;

import java.util.*;
import java.io.*;

public class 촌수계산 {
	static int n;
	static int arr[][];
	static boolean visit[];
	static int man1, man2;
	static int cnt = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 사람수 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		man1 = Integer.parseInt(st.nextToken());
		man2 = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][n + 1];
		visit = new boolean[n + 1];
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			arr[a1][a2] = arr[a2][a1] = 1;
		}

		calc(man1, 0);

		if (cnt > 0) {
			System.out.println(cnt);
		} else
			System.out.println(-1);

	}

	
	private static void calc(int node, int depth) {
		visit[node] = true;
		if (node == man2) {
			cnt = depth;
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (visit[i] != true) {
				if (arr[node][i] == 1) {
					calc(i, depth + 1);
				}
			}
		}
	}
}
