package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 암호만들기_1759 {
	static int l, c;
	static String arr[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		arr = new String[c];
		visit = new boolean[c];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < c; i++) {
			arr[i] = st.nextToken();
		}

		Arrays.sort(arr);

		dfs(0, 0);

		System.out.print(sb);

	}

	private static void dfs(int index, int depth) {
		if (depth == l) {
			String result = "";
			int vow = 0, con = 0;
			for (int i = 0; i < c; i++) {
				if (visit[i] == true) {
					result += arr[i];
					if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o")
							|| arr[i].equals("u")) {
						vow++;
					} else
						con++;
				}

			}
			if (vow > 0 && con > 1) {
				sb.append(result).append("\n");
				return;
			}

		}

		for (int i = index; i < c; i++) {
			if (visit[i] != true) {
				visit[i] = true;
				dfs(i + 1, depth + 1);
				visit[i] = false;
			}
		}

	}
}

