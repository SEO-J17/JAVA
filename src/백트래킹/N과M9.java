package ��Ʈ��ŷ;
import java.util.*;
import java.io.*;
public class N��M9 {
	static int n,m;
	static int arr[],result[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [n];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		calc(0,0);
	}
	private static void calc(int index, int depth) {
		if(depth == m) {
			
		}
		
		for(int )
		
	}
}
