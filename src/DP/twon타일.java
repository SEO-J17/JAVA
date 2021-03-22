package DP;
import java.io.*;
import java.util.*;
public class twon≈∏¿œ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n+1];
		arr[1] = 1;
		
		if(n == 1) {
			System.out.println(1);
		}else {
			arr[2] = 2;
			for(int i=3; i<=n; i++) {
				arr[i] = (arr[i-1]+arr[i-2])%10007;
			}
			
			System.out.println(arr[n]);
			
		}
		
		
	}
}
