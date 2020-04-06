//1920 N���� ������ �־������� �̾ȿ� x��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ض�.
package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());	
		int [] arr1 = new int [N];
		StringTokenizer st = new StringTokenizer(a.readLine());
		for(int i=0; i<N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		Integer M = Integer.parseInt(a.readLine());	
		int [] arr2 = new int [M];
		StringTokenizer st2 = new StringTokenizer(a.readLine());
		Arrays.sort(arr1);
		//�̺� Ž��
		for(int i=0; i<M; i++) {
			int target = Integer.parseInt(st2.nextToken());
			int start = 0;
			int end = N-1;
			int mid;
					while(true) {
						if(start > end) {
						System.out.println(0);
						break;
						}
						mid = (start+end)/2;
						if(arr1[mid] == target) {
							System.out.println(1);
							break;
						}else if(arr1[mid] < target) {
							start =mid+1;
						}else if(arr1[mid] > target) {
							end =mid-1;
						}
					}
		}	
	}
}
