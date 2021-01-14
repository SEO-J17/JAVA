//1065
package 브루트포스;
import java.io.*;
import java.util.*;

public class 한수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(n > 0) {
			if(n < 100) {
				System.out.print(n);
				break;
			}else if(n >= 100 && n <= 110) {
				System.out.print(99);
				break;
			}else if( n >= 111 && n <= 1000 ){	//3자리 라면.
				if((n/100) - (n%100)/10 == (n%100)/10 - (n%100)%10) 
					cnt++;
			}
			
		if(n == 111) {
			System.out.print(cnt+99);
			break;
			}
		
		n--;
		}	
	}
}
