package 구현;

import java.io.*;
import java.util.*;

public class 결혼식_5567 {
	static int n, m; // m = 리스트의 길이
	static int arr[][];
	static boolean chk[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		arr = new int[n + 1][n + 1];
		chk = new boolean[n + 1];
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

		while (!qu.isEmpty()) {
			int start = qu.poll();
			for (int i = 1; i <= n; i++) {
				if(start == 1 && arr[start][i] == 1) {
					qu.add(i);
					chk[i] = true;
					cnt++;
				}else if (arr[start][i] == 1 && !chk[i]) {
					cnt++;
				}
			}
		}	

		System.out.println(cnt);

	}
}
