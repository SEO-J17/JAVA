//ATM기기가 한대인데 N명의 사람들이 줄서있고 i번사람이 돈을 인하는데 시간의 최소값을 구하는 프로그램 작성
//11399번
package GreedyAlgorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int people = a.nextInt();
		ArrayList<Integer> N = new ArrayList<>();	//N=사람들이 걸리는 처리 시간
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
