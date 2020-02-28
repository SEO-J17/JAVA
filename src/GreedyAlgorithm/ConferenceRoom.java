//N���� ȸ�ǵ鿡 ���� ȸ�ǽ� ���ǥ�� ����µ� i������ ���۽ð�,�����½ð��� ������ �ְ� 
//ȸ�ǰ� ��ġ�� �ʰ� ȸ�ǽ��� ����Ҽ� �ִ� �ִ���� ȸ�Ǽ��� ����ض�.
//1931��
package GreedyAlgorithm;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class ConferenceRoom {
	public static void main(String[] args) {
	 Scanner a= new Scanner(System.in);
	 int N = a.nextInt();
	 int [][] I = new int [N][2]; 
	 
	 for(int j=0; j<N; j++){
		 I[j][0] = a.nextInt();
		 I[j][1] = a.nextInt();
	 }
	 Arrays.sort(I,new Comparator<int[]>() {
		@Override
		public int compare(int[] start, int[] end) {
			// TODO Auto-generated method stub
			if(start[1] == end[1]){
			return Integer.compare(start[0], end[0]);
			}
			return Integer.compare(start[1], end[1]);
		}
		});
	 int count =0;
	 int end = -1;
	 for(int i=0;i<N;i++) {
		 if(I[i][0] >= end) {
			 end = I[i][1];
			 count++;
		 }
	 }
	 System.out.println(count);
	}
}
