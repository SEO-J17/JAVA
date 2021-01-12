package 브루트포스;
import java.io.*;
import java.util.*;
public class 덩치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int data [][] = new int [n][2];
		int rank [] = new int [n];
		
		for(int i=0; i < n; i++) rank[i] =1;
		
		for(int i=0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i< n ; i++) {
			for(int j=0; j < n; j++) {
				if(data[i][0] < data[j][0] && data[i][1] < data[j][1]) {
					rank[i]++;
			}
		}
		}
		
		for(int d : rank)
			System.out.print(d+" ");
		
		
	}
}
