//N개의 회의들에 대해 회의실 사용표를 만드는데 i에대해 시작시간,끝나는시간이 정해져 있고 
//회의가 겹치지 않게 회의실을 사용할수 있는 최대수의 회의수를 출력해라.
//1931번
package GreedyAlgorithm;
import java.util.Scanner;
public class ConferenceRoom {
	public static void main(String[] args) {
	 Scanner a= new Scanner(System.in);
	 int N = a.nextInt();
	 int [][] I = new int [N][2]; 
	 int count = 0 ;	//가능한 회의실 개수 카운트 변수
	 
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
