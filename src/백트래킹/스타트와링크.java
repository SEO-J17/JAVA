//14889
package ��Ʈ��ŷ;
import java.io.*;
import java.util.*;
public class ��ŸƮ�͸�ũ {
	static int arr [][];
	static boolean visit[];
	static int n;
	static int minimum=Integer.MAX_VALUE;	//�ִ����� �ʱ�ȭ.
	
	public static void main(String[] args) throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		visit = new boolean[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		group(0,0);
		System.out.println(minimum);
	}
	
	//�׷��� �����°��� �߿��Ѱ� �ƴ�. ������ �� Ž���ϱ� ����!
	private static void group(int a, int b){
		if(b == n/2) {
			calc();
			return;
		}
		
		for(int i=a; i < n; i++) {
			if(visit[i] != true) {
				visit[i] = true;
				group(i+1, b+1);
				visit[i] = false;
			}
		}
	}

	private static void calc() {
		int tm1=0;
		int tm2=0;
		
		for(int i=0; i < n-1; i++) {
			for(int j=i+1; j < n; j++) {
				if(visit[i] == true && visit[j] == true) {
					tm1+= arr[i][j];
					tm1+= arr[j][i];
				}else if(visit[i] == false && visit[j] == false) {
					tm2 += arr[i][j];
					tm2 += arr[j][i];
				}
				
			}
		}
		
		int result = Math.abs(tm1-tm2);
		if(result == 0) {
			System.out.println(result);
			System.exit(0);
		}
		
		minimum = Math.min(result, minimum);
	}
}
