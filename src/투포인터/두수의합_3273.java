package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두수의합_3273 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		Arrays.sort(arr);

		int start = 0;
		int end = n - 1;
		int result = 0;
		int sum = 0;
		while (start < end) {
			sum = arr[start] + arr[end];
			if (sum == x) {
				result++;
			}
			if (sum < x) {
				start++;
			} else {
				end--;
			}
		}
		System.out.println(result);
	}
}
