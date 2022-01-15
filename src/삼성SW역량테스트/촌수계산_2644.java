package 삼성SW역량테스트;

import java.io.*;
import java.util.*;

public class 촌수계산_2644 {
	static int n, me, you, num;
	static int arr[][];
	static boolean visit[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		me = Integer.parseInt(st.nextToken());
		you = Integer.parseInt(st.nextToken());
		num = Integer.parseInt(br.readLine());

		arr = new int[n + 1][n + 1];
		visit = new boolean[n + 1];

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			arr[n1][n2] = arr[n2][n1] = 1;
		}

		Queue<Integer> qu = new LinkedList<>();

		qu.add(me);
		visit[me] = true;
		int cnt = 0;
		while (true) {
			int temp = qu.poll();
			if(temp == you)
				break;
			for (int i = 1; i <= n; i++) {
				if (arr[temp][i] == 1 && !visit[i]) {
					visit[i] = true;
					qu.add(i);
					
				}
			}
			cnt++;
		}
		if(cnt != 0) {
			System.out.println(cnt);
		}else
			System.out.println(-1);

	}
}
