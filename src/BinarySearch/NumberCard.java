//10815
package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());			//상근이의 카드개수
		StringTokenizer st1 =new StringTokenizer(a.readLine());		//비교할 카드숫자
		Integer M = Integer.parseInt(a.readLine());			//비교할 카드의수
		StringTokenizer st2 =new StringTokenizer(a.readLine()); 	//비교할 카드숫자
		int [] card = new int [N];
		int [] comp = new int [M];
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(card);					//상근이 카드 정렬
		
		for(int i=0; i<M; i++) {
			comp[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i =0; i<M; i++) {
			int start = 0;
			int end =N-1;
			int target = comp[i];
			
			for(int j=0; j<N; j++) {
				if(start > end) {
					System.out.print(0+" ");
					break;
				}
				int mid =(start+end)/2;
				if(card[mid] > target) {
					end = mid-1;
				}else if(card[mid] < target) {
					start = mid+1;
				}else if(card[mid] == target) {
					System.out.print(1+" ");
					break;
				}
			}
				
			}
	}
}
//2100ms 걸림 시간 줄이는거 해야할듯