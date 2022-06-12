package GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class 행렬_1080 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				a[i][j] = temp.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				b[i][j] = temp.charAt(j) - '0';
			}
		}
		
		int cnt = 0;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                if (a[i][j] != b[i][j]) {
                    cnt++;
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            a[k][l] = (a[k][l] == 0) ? 1 : 0;
                        }
                    }
                }
            }
        }
        
        //검증
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != b[i][j]) {
                    flag = true;
                    break;
                }
            }
        }
        if(flag) {
        	System.out.println(-1);
        }else {
        	System.out.println(cnt);
        }
	}
}
