//1182
package 백트래킹;
import java.io.*;
import java.util.*;
public class 부분수열의합 {
	static int n,s,cnt;
	static int arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		arr = new int [n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		search(0,0);
		if(s == 0) {cnt--;}	//공집합일경우--
		
		System.out.println(cnt);
	}
	
	private static void search(int index,int depth) {
		if(index == n) {
			if(depth == s) {
				cnt++;
				}
			return;
			}
		
		search(index+1, depth+arr[index]);
		search(index+1, depth);
	}
}
