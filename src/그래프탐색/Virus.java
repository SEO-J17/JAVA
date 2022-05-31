//2606 ��ǻ�͵��� ���� ����Ǿ� �ְ� �ϳ��� �ɸ��� ����� ���� ���� �ɸ���
//1�� ��ǻ�Ͱ� ���̷����� �ɷ����� 1���� ���� ���̷����� �ɸ��� �Ǵ� ��ǻ���� ���� ����ض�.
package �׷���Ž��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());		//��ǻ���� ��
		Integer com = Integer.parseInt(a.readLine());		//����Ǿ��ִ� ��ǻ�� ���Ǽ�
		int [][] pat = new int [N+1][N+1];
		boolean [] visit = new boolean [N+1];
		int cnt =0;
		
		for(int i=0; i<com; i++) {
			StringTokenizer st =new StringTokenizer(a.readLine());
			int point1 = Integer.parseInt(st.nextToken());
			int point2 = Integer.parseInt(st.nextToken());
			pat[point1][point2] = pat[point2][point1] = 1;		//�������,����Ǿ����� 1
		}
		
		Queue<Integer> qu = new LinkedList<Integer> ();
		qu.add(1);
		visit[1] = true;
		//BFS�˰����� �̿��Ѱ�.
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
