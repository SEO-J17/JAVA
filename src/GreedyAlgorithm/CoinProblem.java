//�׸��� �˰��� ��������,������N�����̸� ������ ����ؼ� �װ�ġ�� ���� k�� ���鶧 �̶� �ʿ��� ���������� �ּҰ��� ���ϴ¹���
//11047��

package GreedyAlgorithm;
import java.util.Scanner;
public class CoinProblem {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();		//N=������ ����
		int K = a.nextInt();		//K=������ġ�� ��
		int count = 0;
		int [] coins = new int[N];
		for(int i=0;i<N;i++){
			coins[i] = a.nextInt();
		}
		
			for(int i=N-1;i>=0;i--) {
			 count += K/coins[i];
			 K %=coins[i];
		}
		System.out.println(count);
	}
}
