package 삼성SW역량테스트;

import java.io.*;
import java.util.*;

public class 캐슬디펜스_A형 {
	static int n, m, d;
	static int arr[][];
	static int copyarr[][];
	static int max = -1, cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; i < m; i++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		copyarr = arr.clone();
		ArrayList<Integer> attacker = new ArrayList<>();
		find(0, m, 3, attacker);

	}

	public static int calcDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - y1) + Math.abs(x2 - y2);
	}

	private static void find(int start, int num, int count, ArrayList<Integer> attacker) {
		if (count == 0) {
			init();
			calc(attacker);
			return;
		}

		for (int i = start; i < num; i++) {
			attacker.add(i);
			find(i + 1, num, count - 1, attacker);
			attacker.remove(attacker.size() - 1);
		}
	}

	private static void calc(ArrayList<Integer> attacker) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			boolean visit[][] = new boolean[n][n];
			for (int j = 0; j < attacker.size(); j++) {
				int temp = attacker.get(j);
				
			}
		}
	}
}
