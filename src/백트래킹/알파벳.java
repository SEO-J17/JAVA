//1987
package ¹éÆ®·¡Å·;
import java.util.*;
import java.io.*;
public class ¾ËÆÄºª {
	static int arr[][];
	static int r,c;
	static boolean visit[] = new boolean[26];
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1}; 		//µ¿,¼­,³²,ºÏ ÁÂÇ¥
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		 
		arr = new int[r][c];
		
		for(int i=0; i<r; i++) {
			String temp = br.readLine();
			for(int j=0; j<c; j++) {
				arr[i][j] = temp.charAt(j)-'A';
			}
		}
		
		calc(0,0,0);
		System.out.println(max);
	}
	
	
	
	private static void calc(int x, int y, int cnt) {
		if(visit[arr[x][y]] == true) {
			if(max < cnt) 
				max = cnt;
			return;
		}else {
			visit[arr[x][y]] = true;
			for(int i=0; i<4; i++) {
				int cx = x+dx[i];
				int cy = y+dy[i];
				
				if(cx >= 0 && cy >=0 && cx < r && cy <c)
					calc(cx, cy, cnt+1);
			}
		}
		
		visit[arr[x][y]] = false;
		
	}
}
