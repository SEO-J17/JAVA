package 구현;

import java.io.*;
import java.util.*;

public class 경비원_2564 {
	static int n, m, tc;
	static int arr[][], point[][];
	static int x[][];
	static int stand;
	//static int left_cnt = 0 ,right_cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		tc = Integer.parseInt(br.readLine());
		arr = new int[n][m];
		point = new int[n][m];

		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				point[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		x[0][0] = Integer.parseInt(st.nextToken());
		x[0][1] = Integer.parseInt(st.nextToken());
		
		calc(0, 0);

	}

	private static void calc(int depth, int sum) {
		int left_cnt = 0, right_cnt = 0;
		if(x[0][0] == 1 || x[0][0] == 2) {	//가로에 있다면
			if(x[0][0] == arr[depth][0]) {
				calc(depth+1, sum+=Math.abs(x[0][1]-arr[depth][1]));
			}else if(arr[depth][0] != 1 && arr[depth][0] != 2) {
				
			}
		}
	}
}
