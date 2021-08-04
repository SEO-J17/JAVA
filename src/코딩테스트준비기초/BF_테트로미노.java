//14500
package �ڵ��׽�Ʈ�غ����;
import java.io.*;
import java.util.*;

public class BF_��Ʈ�ι̳� {
	static int arr[][];
	static boolean visit[][];
	static int n,m;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int max = -1;
	public static void main(String[] args) throws IOException,NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int [n][m];
		visit = new boolean [n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				dfs(i,j,0,0);
				dfs2(i,j);
			}
		}
		
		System.out.println(max);
		
	}
	

	private static void dfs(int x, int y, int depth, int result) {
		if(depth == 4) {
			max = Math.max(max, result);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			if(xx >= 0 && yy >=0 && xx < n && yy < m) {
				if(!visit[xx][yy]) {
					visit[xx][yy] = true;
					dfs(xx,yy,depth + 1, result + arr[xx][yy]);
					visit[xx][yy] = false;
				}
			}else 
				continue;
		}
	}
	
	//'��' ������ ��,��,��,�� �� ���� �� �� �ֱ� ������ '��' ���� ���� �ϳ��� ���� ������ �����Ѵ�.
	//�� ����� DFS�� ������ �ȵǹǷ� ���� �����ؾ� �Ѵ�.
	//dfs2�� +��翡�� �ϳ��� Ƣ��� �κ��� ���� ���� ������ �޼ҵ� �̴�.
	private static void dfs2(int x, int y) {
		int shape = 4;				//+���, �����¿�
		int min = Integer.MAX_VALUE;
		int sum = arr[x][y];
		
		for(int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			//Ƣ��� ����� 2���̻� ���ٸ� �� ����� �ƴϹǷ� �����ϰ� �Ѵ�.
			if(shape <=2)
				return;
			//�ʹٱ��� ������ �ȵȴ�.
			if(xx < 0 || yy < 0 || xx >= n || yy >= m) {
				shape--;
				continue;
			}
			
			min = Math.min(min, arr[xx][yy]);
			sum += arr[xx][yy];
		}
		
		//+����϶� Ƣ��� �κ� �� ���� ���� ���� ����� �� ����� ���´�. 
		if(shape == 4) {
			sum -= min;
		}
		max = Math.max(max, sum);
	}
}
