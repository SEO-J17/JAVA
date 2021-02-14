//2630
package ��������;
import java.util.*;
import java.io.*;
public class �����̸���� {
	static int arr[][];
	static int cnt[] = new int [2];
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		calc(n,0,0);

		System.out.print(cnt[0]+"\n"+cnt[1]);
		
	}
	
	
	private static void calc(int n, int y, int x) {
		for(int i=y; i<y+n; i++) {
			for(int j=x; j<x+n; j++) {
				if(arr[i][j] != arr[y][x]) {
					calc(n/2,y,x);				//1��и�
					calc(n/2,y+n/2,x);			//3��и�
					calc(n/2,y,x+n/2);			//2��и�
					calc(n/2,y+n/2,x+n/2);		//4��и�
					return;
				}
			}
		}
		cnt[arr[y][x]]++;
		
	}
}
