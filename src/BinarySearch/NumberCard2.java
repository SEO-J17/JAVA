//10816 숫자카드 N개를 가지고 있고 m이 주어졌읋때 이수가 적혀있는 숫자카드를 몇개 가지고 있는지 알ㅇ내라.

package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2 {
	static int [] cards;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());	
		cards = new int [N];
		StringTokenizer st = new StringTokenizer(a.readLine());
		for(int i=0; i<N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cards);
		Integer M = Integer.parseInt(a.readLine());	
		int [] num= new int [M];
		StringTokenizer st2 = new StringTokenizer(a.readLine());
		for(int i=0; i<M; i++) {
			num[i] = Integer.parseInt(st2.nextToken());	
		}
		
		for(int d : num) {
			System.out.print(find(d)+" ");
		}
			
	}

	private static int find(int d) {
		int start = findstart(cards,0,cards.length,d);
		int end = findend(cards,0,cards.length,d); 
		return end-start;
	}
	
	
	private static int findstart(int [] arr, int start, int end, int target){
		int mid = (start+end)/2;
		if(start >= end) {
			return mid;
		}
		if(arr[mid] >= target) {
			return findstart(arr, start, mid, target);
		}else
			return findstart(arr, mid+1, end, target);
	}

	
	
	private static int findend(int [] arr, int start, int end, int target) {
		int mid = (start+end)/2;
		if(start >= end) {
			return mid;
		}
		if(arr[mid] <= target) {
			return findend(arr, mid+1, end, target);
		}else
			return findend(arr, start, mid, target);
	}

}
