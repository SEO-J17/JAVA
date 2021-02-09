//1149
package DP;
import java.util.*;
import java.io.*;
public class rgb거리 {
	static int arr1[][],arr2[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr1 = new int [n][n];
		arr2 = new int [n];
		visit = new boolean [n+1][n+1];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		calc(0,0);
		System.out.println(result);
		
	}
	
	
	private static void calc(int index,int depth){
		if(depth == n) {
			int temp =0;
			for(int i=0; i<n; i++) {
					temp += arr2[i];
			}
			if(temp < result) {
				result = temp;
				return;
			}else
				return;
		}
		
		for(int i=index; i<n; i++) {
			if(visit[depth][i] != true) {			//방문하지 않았다면.
				visit[depth][i] = true;
				arr2[depth] = arr[index][i]; 
				calc(index+1,depth+1);
				visit[depth][i] = false;
			}
		}
		
		
	}
}
