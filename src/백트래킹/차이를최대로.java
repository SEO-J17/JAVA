package 백트래킹;
import java.util.*;
import java.io.*;
public class 차이를최대로 {
	static int n,result;
	static int arr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		StringTokenizer  st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		calc(0,0);
		
		
	}
	private static void calc(int index, int depth) {
		if(depth == n) {
			
		}
		for(int i=index; i<n; i++) {
			
		}
		
	}
}
