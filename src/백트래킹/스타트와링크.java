//14889
package 백트래킹;
import java.io.*;
import java.util.*;
public class 스타트와링크 {
	static int arr [][];
	static int minimum,n;
	public static void main(String[] args) throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		calc(0,0);
		
		
	}
	
	private static void calc(int row, int col){
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				
			}
		}
		
	}
}
