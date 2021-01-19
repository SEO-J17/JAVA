//14501
package 브루트포스;
import java.io.*;
import java.util.*;
public class 퇴사 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr [][] = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int max=0;
		for(int i=0; i < n; i++) {
			int sum=0;
			for(int j=0; j < n; j++) {
				
			}
		}
		
		
		
		
	}
}
