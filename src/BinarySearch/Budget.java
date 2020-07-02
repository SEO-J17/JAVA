//2512
package BinarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Budget {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Integer N = Integer.parseInt(a.readLine());
		int budget[] = new int [N];
		StringTokenizer st = new StringTokenizer(a.readLine());
		for(int i=0; i < N; i++) {
			budget[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(budget);   		//오름차순 정렬
		Integer M = Integer.parseInt(a.readLine()); 	//M=총예산
		
		int start=0;
		int mid=0;
		int end=budget[N-1];
	
		while(true) {
			mid = (start+end)/2;
			if(start > end) {
				break;
			}
			int sum=0;
			int temp=0;
			for(int i=0; i<N; i++) {
				if(mid <= budget[i]) {
					temp = mid*(N-i);
					break;
				}else
				  sum += budget[i];
			}
			
			if(sum+temp > M){
				end = mid-1;
			}else if(sum+temp < M) {
			    start = mid+1;
			}else
				break;
			
			
		}
		bw.write(mid+"\n");
		bw.flush();		
		a.close();
		bw.close();
	}
}
