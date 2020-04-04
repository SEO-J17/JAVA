//1260 ��������,��������,Ž���� ������ ��ȣ�� �־����� dfs,bfs������ ����� ����ض�.
package DFSandBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DF_BFS_EX {
	static int N,M,V=0;
	static boolean [] visit;
	static int [][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(a.readLine());
		N=Integer.parseInt(st.nextToken());		//�������� �Է�
		M=Integer.parseInt(st.nextToken());		//�������� �Է�
		V=Integer.parseInt(st.nextToken());		//������ ������ ��ȣ �Է�
		
		map = new int [N+1][N+1];		//����̱� ������ �ε��� 0�� �Ⱦ��� ����+1�� �Ѵ�!
		visit = new boolean[N+1];		//�湮�ߴ��� üũ�뵵.
		
		for(int i=0; i<M; i++) {
			StringTokenizer temp = new StringTokenizer(a.readLine());
			int x = Integer.parseInt(temp.nextToken());
			int y = Integer.parseInt(temp.nextToken());
			map[x][y] = map[y][x] = 1;		//���� ���.
		}
		//dfs ����.
		dfs(V,N);
		System.out.println();				//bfs ���� �ٹٲ�!
		visit = new boolean[N+1];
	}

	private static void dfs(int V, int n) {
		if(visit[V]) {
			return;				//�湮�� ��� ��������
		}
		visit[V] =true;
		System.out.print(V+" ");
		
		for(int d=1; d<=n; d++) {
			if(map[V][d] == 1) {
				dfs(d, n);
			}
		}
	}
}
