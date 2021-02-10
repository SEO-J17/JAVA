//1932
package DP;
import java.util.*;
import java.io.*;
public class 정수삼각형 {
	static int arr[][];
	static Integer result[][];			//integer배열은 null값이 있으모로 0이  중복될수 있으므로 int형이 아닌 integer로 사용한다.
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		result = new Integer [n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			result[n - 1][i] = arr[n - 1][i];
		}
		
		System.out.println(calc(0,0));
		
	}
	
	
	
	private static int calc(int depth, int index) {
		if(depth == n-1) {
			return result[depth][index];
		}
		
		if(result[depth][index] == null)
			result[depth][index] = Math.max(calc(depth+1, index), calc(depth+1, index+1)) + arr[depth][index];
		
		return result[depth][index];
	}
}

//밑에서 부터 탐색하는 방법이 제일 좋음. for문 이용가능. 