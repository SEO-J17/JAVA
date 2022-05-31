//4963
package ±×·¡ÇÁÅ½»ö;
import java.io.*;
import java.util.*;
public class ¼¶ÀÇ°³¼ö {
	static int w,h;
	static int arr[][];
	static boolean visit[][];
	static int dx[] = {0,0,-1,1,-1,1,-1,1};		//xÁÂÇ¥
	static int dy[] = {1,-1,0,0,1,1,-1,-1};		//yÁÂÇ¥
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			arr = new int [h][w];
			visit = new boolean [h][w];
			
			if(w == 0 && h == 0) { break; }
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt = 0;
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(arr[i][j] == 1 && !visit[i][j]) {
						dfs(i, j);
						cnt++;
					}
				}
			} 
			sb.append(cnt).append("\n");
		}		
		System.out.println(sb);
	}
	
	
	private static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i = 0; i < 8; i++) {
			int temp_x = dx[i]+x;
			int temp_y = dy[i]+y;
			
			if(temp_x >= 0 && temp_y >= 0 && temp_x < h && temp_y < w) {
				if(arr[temp_x][temp_y] == 1 && visit[temp_x][temp_y] != true) {
					dfs(temp_x, temp_y);
				}
			}
			
		}
		
	}
}
