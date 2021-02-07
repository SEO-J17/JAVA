package DP;
import java.util.*;
import java.io.*;
public class 피보나치함수 {
	static StringBuilder sb = new StringBuilder();
	static int a,b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			calc(arr[i]);
			sb.append(a).append(" ").append(b).append("\n");
			a=0;
			b=0;
		}
		System.out.println(sb);
		
	}
	private static int calc(int num) {
		if(num == 0) {
			return a++;
		}else if(num == 1){
			return b++;
		}else
			return calc(num-1) + calc(num-2);
	}
}
