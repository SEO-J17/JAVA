//14889
package 백트래킹;
import java.io.*;
import java.util.*;
public class 스타트와링크 {
	static int arr [][];
	static boolean visit[];
	static int n;
	static int minimum=Integer.MAX_VALUE;	//최댓값으로 초기화.
	
	public static void main(String[] args) throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		visit = new boolean[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		group(0,0);
		System.out.println(minimum);
	}
	
	//그룹을 나누는것이 중요한게 아님. 어차피 다 탐색하기 때문!
	private static void group(int a, int b){
		if(b == n/2) {
			calc();
			return;
		}
		
		for(int i=a; i < n; i++) {
			if(visit[i] != true) {
				visit[i] = true;
				group(i+1, b+1);
				visit[i] = false;
			}
		}
	}

	private static void calc() {
		int tm1=0;
		int tm2=0;
		
		for(int i=0; i < n-1; i++) {
			for(int j=i+1; j < n; j++) {
				if(visit[i] == true && visit[j] == true) {
					tm1+= arr[i][j];
					tm1+= arr[j][i];
				}else if(visit[i] == false && visit[j] == false) {
					tm2 += arr[i][j];
					tm2 += arr[j][i];
				}
				
			}
		}
		
		int result = Math.abs(tm1-tm2);
		if(result == 0) {
			System.out.println(result);
			System.exit(0);
		}
		
		minimum = Math.min(result, minimum);
	}
}
