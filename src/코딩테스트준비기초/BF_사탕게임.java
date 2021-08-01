//3085
package 코딩테스트준비기초;
import java.io.*;
import java.util.*;
public class BF_사탕게임 {
	static char arr[][];
	static boolean visit[][];
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new char [n][n];
		
		for(int i = 0; i < n; i++) {
			String temp = br.readLine();
			for(int j = 0; j < n; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j + 1 <  n) {
					char temp = arr[i][j];
					arr[i][j] = arr[i][j+1];	//옆에 자리하고 스왑
					arr[i][j+1] = temp;
					int chk = calc();
					
					if(result < chk) 
						result = chk;	
					
					temp = arr[i][j];			//원상태로.
					arr[i][j] = arr[i][j+1];	
					arr[i][j+1] = temp;
					
				}
				
				if(i + 1 < n ) {
					char temp = arr[i][j];
					arr[i][j] = arr[i+1][j];	//아래 자리하고 스왑
					arr[i+1][j] = temp;
					int chk = calc();
					
					if(result < chk) 
						result = chk;	
					
					temp = arr[i][j];			//원상태로.
					arr[i][j] = arr[i+1][j];	
					arr[i+1][j] = temp;
				}
			}
		}
		
		System.out.println(result);
		
	}
	
	
	private static int calc() {
		int N = n;
		int cnt = 1;
		
		for(int i = 0; i < N; i++) {
			int temp = 1;
			for(int j = 1; j < N; j++) {
				if(arr[i][j] == arr[i][j-1]) {
					temp += 1;
				}else
					temp = 1;
				
				if(cnt < temp)
					cnt = temp;
			}
			
			temp = 1;
			for(int j = 1; j < N; j++) {
				if(arr[j][i] == arr[j-1][i]) {
					temp += 1;
				}else
					temp = 1;
				
				if(cnt < temp)
					cnt = temp;
			}
		}
		
		return cnt;
	}
}
