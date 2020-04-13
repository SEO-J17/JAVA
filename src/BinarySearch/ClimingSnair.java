//2869
package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClimingSnair {
	public static void main(String[] args) throws IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(a.readLine());
		Integer climb =Integer.parseInt(st.nextToken());
		Integer descend =Integer.parseInt(st.nextToken());
		Integer hight =Integer.parseInt(st.nextToken());
		int cnt=0;
		int result =0;

		while(true) {
			cnt++;
			result+=climb;
			if(result >= hight) {
				break;
			}
			result-=descend;
		}
		System.out.println(cnt);		
	}
}
