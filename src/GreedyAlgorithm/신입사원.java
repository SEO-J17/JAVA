package GreedyAlgorithm;
import java.io.*;
import java.util.*;
public class ���Ի�� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			int [] grade = new int [num+1];
			int max=1;
			
			for(int i=0; i<num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				grade[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
			}
			
			//������������ ���ĵǾ��ֱ⿡ �ι�° ���� ���ϸ� �ȴ�!
			int temp = grade[1];
			for(int i=2; i<=num; i++) {
				if(temp > grade[i]) {
					max++;
					temp = grade[i];
				}
			}
			sb.append(max).append("\n");
			}
		
		System.out.println(sb);
		}
}
