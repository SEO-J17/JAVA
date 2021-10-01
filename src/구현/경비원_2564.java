package 구현;

import java.io.*;
import java.util.*;

public class 경비원_2564 {
	static int n, m, tc;
	static int arr[][];
	static int x[][];
	static int stand;
	static int sum=0;

	// static int left_cnt = 0 ,right_cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		tc = Integer.parseInt(br.readLine());
		arr = new int[n][m];
		x = new int[1][2];

		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		x[0][0] = Integer.parseInt(st.nextToken());
		x[0][1] = Integer.parseInt(st.nextToken());

		calc();

		System.out.println(sum);
	}

	private static void calc() {

		for (int i = 0; i < tc; i++) {
			if (x[0][0] == 1 || x[0][0] == 2) { // 가로에 있다면
				if (x[0][0] == arr[i][0]) {
					sum += Math.abs(x[0][1] - arr[i][1]);
				} else if (arr[i][0] == 3) {
					sum += Math.min(x[0][1] + arr[i][1], (n - x[0][1]) + m + n + (m - arr[i][1]));
				} else if (arr[i][0] == 4) {
					sum += Math.min(x[0][1] + m + n + (m - arr[i][1]), (n - x[0][1]) + arr[i][1]);
				} else {
					sum += Math.min(x[0][1] + m + arr[i][1], (n - x[0][1]) + m + n - arr[i][1]);
				}
			} else { // 세로에 있다면
				if (x[0][0] == arr[i][0]) {
					sum += Math.abs(x[0][1] - arr[i][1]);
				} else if (arr[i][0] == 1) {
					sum += Math.min(x[0][1] + n - arr[i][1], (m - x[0][1]) + n + m + arr[i][1]);
				} else if (arr[i][0] == 2) {
					sum += Math.min(m - x[0][1] + (n - arr[i][1]), x[0][1] + n + m + arr[i][1]);
				} else {
					sum += Math.min(x[0][1] + n + arr[i][1], (m - x[0][1]) + n + (m - arr[i][1]));
				}
			}
		}
	}
}
