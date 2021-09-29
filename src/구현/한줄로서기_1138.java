package 구현;

import java.io.*;
import java.util.*;

public class 한줄로서기_1138 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n + 1];
		boolean visit[] = new boolean[n + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		while (list.size() < n) {
			for (int i = 1; i <= n; i++) {
				int cnt = 0;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) > i)
						++cnt;
				}

				if (arr[i] == cnt && !visit[i]) {
					list.add(i);
					visit[i] = true;
					break;
				}
			}
		}

		for (int d : list)
			sb.append(d).append(" ");

		System.out.print(sb);

	}

}
