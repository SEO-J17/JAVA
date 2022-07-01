package 슬라이딩윈도우;

import java.io.*;
import java.util.*;

public class 게으른백곰_10025 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int arr[] = new int[1000001];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int temp1 = Integer.parseInt(st.nextToken());
			int temp2 = Integer.parseInt(st.nextToken());
			arr[temp2] += temp1;
		}

		int sum = 0;
		int max = 0;
		int lim = 1 + (2 * k);
		for (int i = 0; i <= 1000000; i++) {
			if (i >= lim) {
				sum -= arr[i - lim];
			}

			sum += arr[i];
			max = Math.max(max, sum);
		}

		System.out.println(max);

	}
}
