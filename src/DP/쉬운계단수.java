//10844
package DP;
import java.io.*;
import java.util.*;
public class 쉬운계단수 {
	static Long arr[][];
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new Long [n+1][10];
		
		for(int i=0; i < 10; i++ ) {
			arr[1][i] = (long)1;
		}
		
		long sum=0;
		for(int i=1; i<10; i++) {
			sum += calc(n,i);
		}
		
		System.out.println(sum%1000000000);
			
	}
	
	
	private static long calc(int num, int value) {
		if(num == 1) {
			return arr[num][value];
		}
		
		if(arr[num][value] == null) {
			if(value == 0) {
				arr[num][value] = calc(num-1, 1);
			}else if(value == 9) {
				arr[num][value] = calc(num-1, 8);
			}else
				arr[num][value] = calc(num-1, value-1) + calc(num-1, value+1) ;
		}
		
		return arr[num][value]%1000000000;
	}
}
