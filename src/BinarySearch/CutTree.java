//2805 ���ܱ� ���̼����� �Ѵٸ� ���̼������� ������ �߸��°��̴�.

package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CutTree {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(a.readLine());
		Integer tree = Integer.parseInt(st.nextToken());
		Integer minimum = Integer.parseInt(st.nextToken());
		int [] treemeter = new int [tree];
		StringTokenizer st2 = new StringTokenizer(a.readLine());
		
		for(int i=0; i<tree; i++) {
			treemeter[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(treemeter);
		
		int start =0;
		int end = treemeter[tree-1];		//������ �ִ����
		int mid = (start+end)/2;			//���ܱ��� �߰���
		int sum = 0;
		
		while(true) {
			if(minimum <= mid) {
				System.out.println(minimum);
				break;
			}
			mid = (start+end)/2;
			
		}
		
		
		
		
		
		
	}
}




