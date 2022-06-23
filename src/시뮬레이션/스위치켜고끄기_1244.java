package 시뮬레이션;

import java.io.*;
import java.util.*;

public class 스위치켜고끄기_1244 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int student = Integer.parseInt(br.readLine());
		for (int i = 0; i < student; i++) {
			st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (sex == 1) {
				int temp = 1;
				while (true) {
					int multi = num * temp;
					if (multi > n) {
						break;
					}
					if (arr[multi] == 0) {
						arr[multi] = 1;
					} else {
						arr[multi] = 0;
					}
					temp++;
				}
			} else {
				int temp = 1;
				if (arr[num] == 0) {
					arr[num] = 1;
				} else {
					arr[num] = 0;
				}
				while (true) {
					if (num - temp >= 1 && num + temp <= n) {
						if (arr[num - temp] == arr[num + temp]) {
							swap(arr, num, temp);
						} else {
							break;
						}
					} else {
						break;
					}
					temp++;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (i % 20 != 0) {
				sb.append(arr[i]).append(" ");
			} else {
				sb.append(arr[i]).append(" ");
				sb.append("\n");
			}
		}

		System.out.println(sb);
	}

	private static void swap(int[] arr, int num, int temp) {
		if (arr[num - temp] == 1) {
			arr[num - temp] = 0;
			arr[num + temp] = 0;
		} else {
			arr[num - temp] = 1;
			arr[num + temp] = 1;
		}
	}
}
