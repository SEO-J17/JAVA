//1149
package DP;
import java.util.*;
import java.io.*;
public class rgb°Å¸® {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n][3];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());			//red 
			arr[i][1] = Integer.parseInt(st.nextToken()); 			//green
			arr[i][2] = Integer.parseInt(st.nextToken());			//blue 
		}
		
		for(int i=1; i<n; i++) {
			arr[i][0] += Math.min(arr[i-1][1],arr[i-1][2]);
			arr[i][1] += Math.min(arr[i-1][0],arr[i-1][2]);
			arr[i][2] += Math.min(arr[i-1][0],arr[i-1][1]);
		}
		
		System.out.println(Math.min(Math.min(arr[n-1][0],arr[n-1][1]), arr[n-1][2]));
		
		
	}
}
