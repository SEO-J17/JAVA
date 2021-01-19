//14501
package 브루트포스;
import java.io.*;
import java.util.*;
public class 퇴사 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr [][] = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int max=0;
		if( arr[n-1][0] != 1) {
			arr[n-1][1] =0;
		}
		for(int i=0; i < n; i++) {
			int sum=0;
			int cnt=i;
			for(int j=cnt; j < n; j++) {
					if(cnt <= n && (arr[j][0]+cnt) <= n) {
							sum += arr[j][1];
							cnt += arr[j][0];
					}else
						 break;
				}
					
			if(sum > max) {
				max = sum;
			}
			if(i == n-1) {
				System.out.print(max);
				break;
			}
		}
		
		
		
		
	}
}
