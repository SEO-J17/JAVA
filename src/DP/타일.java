//1904
package DP;
import java.util.*;
import java.io.*;
public class ≈∏¿œ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(calc(n));
		
	}

	private static int calc(int n) {
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 2;
		}
		
		int a=1;
		int b=2;
		int sum=0;
		
		for(int i=2; i<n; i++) {
			sum = (a+b)%15746;
			a=b;
			b=sum;
		}
		
		return sum;
	}
}
