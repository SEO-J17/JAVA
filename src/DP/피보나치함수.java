package DP;
import java.util.*;
import java.io.*;
public class 피보나치함수 {
	static StringBuilder sb = new StringBuilder();
	static int zero[],one[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n];
		zero = new int [41];		//0~40까지.
		one = new int [41];			// "   "
		
		zero[0] = 1;
		zero[1] = 0;
		one[0] = 0;
		one[1] = 1;
		
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			calc(temp);
		}
		
		System.out.println(sb);
		
	}
	
	
	private static void calc (int num) {
		if(num == 0) {
			sb.append(1+" "+0).append("\n");
			return;
		}else if(num == 1) {
			sb.append(0+" "+1).append("\n");
			return;
		}
		
		for(int i=2; i<41; i++) {
			one[i] = one[i-1]+one[i-2]; 
			zero[i] = zero[i-1]+zero[i-2]; 
		}
		sb.append(zero[num]+" "+one[num]).append("\n");
	}
}
