//1932
package DP;
import java.util.*;
import java.io.*;
public class �����ﰢ�� {
	static int arr[][];
	static Integer result[][];			//integer�迭�� null���� ������� 0��  �ߺ��ɼ� �����Ƿ� int���� �ƴ� integer�� ����Ѵ�.
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		result = new Integer [n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			result[n - 1][i] = arr[n - 1][i];
		}
		
		System.out.println(calc(0,0));
		
	}
	
	
	
	private static int calc(int depth, int index) {
		if(depth == n-1) {
			return result[depth][index];
		}
		
		if(result[depth][index] == null)
			result[depth][index] = Math.max(calc(depth+1, index), calc(depth+1, index+1)) + arr[depth][index];
		
		return result[depth][index];
	}
}

//�ؿ��� ���� Ž���ϴ� ����� ���� ����. for�� �̿밡��. 