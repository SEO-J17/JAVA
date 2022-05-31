//2606 컴퓨터들이 서로 연결되어 있고 하나가 걸리면 연결된 컴은 전부 걸린다
//1번 컴퓨터가 바이러스에 걸렸을때 1번을 통해 바이러스가 걸리게 되는 컴퓨터의 수를 출력해라.
package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());		//컴퓨터의 수
		Integer com = Integer.parseInt(a.readLine());		//연결되어있는 컴퓨터 쌍의수
		int [][] pat = new int [N+1][N+1];
		boolean [] visit = new boolean [N+1];
		int cnt =0;
		
		for(int i=0; i<com; i++) {
			StringTokenizer st =new StringTokenizer(a.readLine());
			int point1 = Integer.parseInt(st.nextToken());
			int point2 = Integer.parseInt(st.nextToken());
			pat[point1][point2] = pat[point2][point1] = 1;		//인접행렬,연결되어있음 1
		}
		
		Queue<Integer> qu = new LinkedList<Integer> ();
		qu.add(1);
		visit[1] = true;
		//BFS알고리즘을 이용한것.
		while(!qu.isEmpty()) {
			int start = qu.poll();
			for(int i=1; i<=N; i++) {
				if(pat[start][i] ==1 && !visit[i]) {
					qu.add(i);
					visit[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
