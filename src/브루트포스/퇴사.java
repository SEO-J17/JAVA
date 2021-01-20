//14501
package 브루트포스;
import java.io.*;
import java.util.*;
public class 퇴사 {
	static int day [];
	static int money [];
	static int n,max=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		day = new int [n];
		money = new int [n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			day[i] = Integer.parseInt(st.nextToken());
			money[i] = Integer.parseInt(st.nextToken());
		}
		calc(0,0) ;
		System.out.println(max);
	}

	private static void calc(int date, int pay) {
		if(date >= n) {
			max = Math.max(max, pay);
			return;
		}
		
		if(date+day[date] <=n) calc(date+day[date], pay+money[date]);
		else calc(date+day[date], pay);
		
		calc(date+1, pay);
		
	}
}
