package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 부등호_2529 {
	static String arr[];
	static int n;
	static boolean visit[];
	static int num[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static int before_max, before_min = 1;
	static int max_cnt = 1, min_cnt = 1;
	static String min = "", max = "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visit = new boolean[10];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = st.nextToken();
		}

		solve(0);

		System.out.println(min);
		System.out.println(max);
	}

	private static void solve(int depth) {
		if (depth == n) {
			return;
		}

		for (int i = 0; i < 10; i++) {
			
		}

	}

}
