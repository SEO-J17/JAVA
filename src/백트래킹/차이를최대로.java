//10819
package 백트래킹;
import java.util.*;
import java.io.*;
public class 차이를최대로 {
	static int n,max =Integer.MIN_VALUE;
	static int arr[],result[];
	static boolean visit[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		result = new int [n];
		visit = new boolean [n];
		StringTokenizer  st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		calc(0);
		System.out.println(max);
		
	}
	
	private static void calc(int depth) {
		if(depth == n) {
			int sum=0;
			for(int i=1; i<n; i++) {
				sum += Math.abs(result[i-1] - result[i]);
			}
			if(max < sum) {
				max = sum;
			}
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visit[i] != true) {
				visit[i] = true;
				result[depth] = arr[i];
				calc(depth+1);
				visit[i] = false;
			}
		}
	}
}
