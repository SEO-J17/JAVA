package 코딩테스트준비기초;

import java.io.*;
import java.util.*;

public class 다음순열_10972 {
	static int n;
	static int arr[];
	static int last[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int temp = n;
		boolean islast = false;

		arr = new int[n];
		last = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			last[i] = temp--;
			if (last[i] == arr[i]) {
				islast = true;
			} else {
				islast = false;
				break;
			}
		}

		if (n == 1 || islast == true) {
			System.out.println(-1);
		} else if (n == 2) {
			System.out.print("2" + " " + "1");
		} else {
			calc();
			for (int d : arr) {
				System.out.print(d + " ");
			}
		}

	}

	private static void calc() {
		for (int i = n - 1; i >= 1; i--) {
			
		}

	}

}
