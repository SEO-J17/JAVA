package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 부등호_2529 {
	static char arr[];
	static int n;
	static boolean visit[];
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visit = new boolean[10];
		arr = new char[10];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = st.nextToken().charAt(0);
		}

		solve("", 0);
		Collections.sort(list);

		System.out.println(list.get(list.size() - 1));
		System.out.println(list.get(0));

	}

	private static void solve(String str, int depth) {
		if (depth == n + 1) {
			list.add(str);
			return;
		}

		for (int i = 0; i < 10; i++) {
			if (!visit[i]) {
				if (depth == 0 || calc(Character.getNumericValue(str.charAt(depth - 1)), i, arr[depth - 1])) {
					visit[i] = true;
					solve(str + i, depth + 1);
					visit[i] = false;
				}
			}
		}

	}

	private static boolean calc(int n1, int n2, char ch) {
		if (ch == '<') {
			if (n1 > n2)
				return false;
		} else if (ch == '>') {
			if (n1 < n2)
				return false;
		}

		return true;
	}

}
