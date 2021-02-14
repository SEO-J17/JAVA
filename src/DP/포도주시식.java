//2156
package DP;
import java.util.*;
import java.io.*;
public class 포도주시식 {
	static int arr[];
	static Integer result[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int [n+1];
		result = new Integer[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		result[0] = 0;
		result[1] = arr[1];
		
		if(n > 1) {
			result[2] = arr[1]+arr[2];
		}
		
		System.out.println(calc(n));
		
	}
	
	
	private static int calc(int n) {
		if(result[n] == null)
			result[n] = Math.max(Math.max(calc(n-2), calc(n-3)+arr[n-1])+arr[n],calc(n-1));
		
		return result[n];
	}
}
