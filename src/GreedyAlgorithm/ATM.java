//ATM��Ⱑ �Ѵ��ε� N���� ������� �ټ��ְ� i������� ���� ���ϴµ� �ð��� �ּҰ��� ���ϴ� ���α׷� �ۼ�
//11399��
package GreedyAlgorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int people = a.nextInt();
		ArrayList<Integer> N = new ArrayList<>();	//N=������� �ɸ��� ó�� �ð�
		int temp = 0;
		int lowest_time = 0;
		for(int i=0; i<people; i++){
			int P = a.nextInt();
			N.add(P);
		}
		Collections.sort(N);
		for(int i : N) {
			lowest_time += (temp += i);
			
		}
		System.out.println(lowest_time);
	}
}
