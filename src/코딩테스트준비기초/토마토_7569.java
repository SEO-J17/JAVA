package �ڵ��׽�Ʈ�غ����;

import java.io.*;
import java.util.*;

public class �丶��_7569 {
	static int n, m, h;
	static int arr[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		arr = new int [m*h][n];
		
		for (int i = 0; i < m * h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		
	}
}
