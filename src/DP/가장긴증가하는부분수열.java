//11053
package DP;
import java.util.*;
import java.io.*;
public class 가장긴증가하는부분수열 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n];
		int result[] = new int [n];
		int max=-1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			result[i] = 1;
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j] && result[i] < result[j]+1) {
					result[i] = result[j]+1;
				}
			}
		}
		
		for(int d:result) {
			if(max < d)
				max = d;
		}
		
		System.out.println(max);
		
	}
}
