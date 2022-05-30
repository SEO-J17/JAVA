package ±¸Çö;

import java.io.*;
import java.util.*;

public class ºø¹°_14719 {
	static int arr[][];
	static int n, m;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			for (int j = n - 1; j >= 0; j--) {
				if (temp == 0) {
					break;
				}
				arr[j][i] = 2;
				temp--;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
			}
		}
		

	}
}
