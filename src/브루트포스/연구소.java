package 브루트포스;
import java.util.*;
import java.io.*;

public class 연구소 {
	static int arr [][];
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int [n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		
		
	}
}
