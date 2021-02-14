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
		arr = new int [n];
		result = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		result[0] = arr[0];
		if(n > 1) {
			result[1] = arr[1]+arr[0];
			
		}
		
		System.out.println(calc(n));
		
	}
	
	
	private static int calc(int n) {
		if(result[n-1] == null)
			result[n-1] = Math.max(Math.max(calc(n-2), calc(n-3)+arr[n-2])+arr[n-1],calc(n-2));
		
		return result[n-1];
	}
}
