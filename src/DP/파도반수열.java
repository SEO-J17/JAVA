//9461
package DP;
import java.util.*;
import java.io.*;
public class 파도반수열 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		long arr[] = new long [101]; 				//100개가 필요
		
		arr[1]=arr[2]=arr[3]=1;
		arr[4]=arr[5]=2;
		arr[6]=3;
		
		for(int i=7; i<=100; i++) {
			arr[i] = arr[i-1]+arr[i-5];
		}
		
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			sb.append(arr[temp]).append("\n");
		}
		System.out.print(sb);
	}
}
