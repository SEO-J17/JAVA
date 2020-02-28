//그리디 알고리즘 동전문제,동전은N종류이면 동전을 사용해서 그가치의 합을 k로 만들때 이때 필요한 동전개수의 최소값을 구하는문제
//11047번

package GreedyAlgorithm;
import java.util.Scanner;
public class CoinProblem {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();		//N=동전의 종류
		int K = a.nextInt();		//K=동전가치의 합
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
