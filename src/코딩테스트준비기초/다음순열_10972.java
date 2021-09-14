package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 다음순열_10972 {
	static int n;
	static int arr[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (calc()) {
			for (int d : arr) {
				System.out.print(d + " ");
			}
			System.out.println();
		} else
			System.out.println("-1");
	}

	private static boolean calc() {
		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] >= arr[i]) {
			i--;
		}
		if (i <= 0)
			return false;

		int j = arr.length - 1;
		while (arr[i - 1] >= arr[j]) {
			j--;
		}
		int temp = arr[j];
		arr[j] = arr[i - 1];
		arr[i - 1] = temp;

		int start = i;
		int end = arr.length - 1;

		while (start < end) {
			int tmp = arr[end];
			arr[end] = arr[start];
			arr[start] = tmp;
			start++;
			end--;
		}
		return true;
	}

}
