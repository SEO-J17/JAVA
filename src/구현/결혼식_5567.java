package ±¸Çö;

import java.io.*;
import java.util.*;

public class °áÈ¥½Ä_5567 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int arr[][] = new int[n + 1][n + 1];
		boolean chk[] = new boolean[n + 1];
		boolean visit[] = new boolean[n + 1];
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}

		Queue<Integer> qu = new LinkedList<>();
		int cnt = 0;
		qu.add(1);
		chk[1] = true;
		visit[1] = true;
		
		while (!qu.isEmpty()) {
			int start = qu.poll();
			for (int i = start+1; i <= n; i++) {
				if (start == 1 && arr[start][i] == 1) {
					qu.add(i);
					chk[i] = true;
					visit[i] = true;
					cnt++;
				} else if (arr[start][i] == 1 && !chk[i] && !visit[i]) {
					visit[i] = true;
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}
}
