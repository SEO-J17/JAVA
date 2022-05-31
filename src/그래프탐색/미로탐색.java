package ±×·¡ÇÁÅ½»ö;
import java.io.*;
import java.util.*;
public class ¹Ì·ÎÅ½»ö {
	static int n,m;
	static int [] dx = {1,0,-1,0};		//»ó¿ìÁÂÇÏ
	static int [] dy = {0,1,0,-1};
	static int [][] maze;
	static boolean [][] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		maze = new int [n][m];
		visit = new boolean [n][m];
		
		for(int i=0; i<n; i++) {
			String temp = br.readLine();
			for(int j=0; j<m; j++) {
				maze[i][j] = (int)temp.charAt(j)-'0';
			}
		}
		bfs();
		System.out.println(maze[n-1][m-1]);
	}
	
	
	private static void bfs() {
		Queue<Integer> x = new LinkedList<>();
		Queue<Integer> y = new LinkedList<>();
		x.add(0);
		y.add(0);
		visit[0][0] = true;
		
		while(!x.isEmpty()) {
			int a = x.poll();
			int b = y.poll();
			
			for(int i=0; i<4; i++) {
				int temp1 = a+dx[i];
				int temp2 = b+dy[i];
				
			if(temp1 >= 0 && temp2 >=0 && temp1 <n && temp2 <m) {
				if(maze[temp1][temp2] == 1 && visit[temp1][temp2] == false) {
					x.add(temp1);
					y.add(temp2);
					
					visit[temp1][temp2] = true;
					
					maze[temp1][temp2] = maze[a][b] + 1;	//ÀÌµ¿¤µÈ½¼ö
							
				}
			}
			}
					
			
		}
		
	}
	
	
}
