package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열_2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int start = 0;
		int end = 0;
		int sum = 0;
		int result = Integer.MIN_VALUE;
		int cnt = 0;

		while (true) {
			if (cnt == k) {
				result = Math.max(sum, result);
				sum -= arr[start++];
				cnt--;
			}

			if (end == n) {
				break;
			}

			sum += arr[end++];
			cnt++;

		}
		System.out.println(result);
	}
}
