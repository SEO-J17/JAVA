package DP;
import java.util.*;
import java.io.*;
public class 일이삼더하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [11];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i=4; i<=10; i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			sb.append(arr[temp]).append("\n");
		}
		
		System.out.println(sb);
		
		
		
		
	}
}
