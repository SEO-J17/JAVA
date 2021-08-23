package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 퇴사_14501 {
	static int arr[][];
	static int n;
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		calc(0, 0);

		System.out.print(max);
	}

	private static void calc(int date, int sum) {
		if (date >= n) {
			if (max < sum) {
				max = sum;
			}
			
			return;
			
		}

		
		if (date + arr[date][0] <= n) {
			calc(date + arr[date][0], sum + arr[date][1]);
		} else
			calc(date + arr[date][0], sum);

		
		calc(date + 1, sum);

	}

}
