//N���� ȸ�ǵ鿡 ���� ȸ�ǽ� ���ǥ�� ����µ� i������ ���۽ð�,�����½ð��� ������ �ְ� 
//ȸ�ǰ� ��ġ�� �ʰ� ȸ�ǽ��� ����Ҽ� �ִ� �ִ���� ȸ�Ǽ��� ����ض�.
//1931��
package GreedyAlgorithm;
import java.util.Scanner;
public class ConferenceRoom {
	public static void main(String[] args) {
	 Scanner a= new Scanner(System.in);
	 int N = a.nextInt();
	 int [][] I = new int [N][2]; 
	 int count = 0 ;	//������ ȸ�ǽ� ���� ī��Ʈ ����
	 
	 for(int j=0; j<N; j++){
		 I[j][0] = a.nextInt();
		 I[j][1] = a.nextInt();
	 }
	 for(int i =0; i<N; i++) {
		 if(I[i][1] >= I[i+1][0]){
				count += 1;
			}
	 }
	 System.out.println(count);
	}
}
