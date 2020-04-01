//2108 통계학문제
package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class Statistics {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int [] cntlist = new int [N];
		int avg=0;
		int count=0;
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(a.readLine()));
		}
		Collections.sort(list);
		//산술평균 
		for(int i=0; i<list.size(); i++) {
			avg+=list.get(i);
		}
		if((Math.abs(avg)%N*10)/N > 4) {
			if(avg>0) {
				System.out.println(avg/N+1);
			}else
				System.out.println(avg/N-1);
		}else
			System.out.println(avg/N);
		
		//중앙값
		System.out.println(list.get((N-1)/2));
		
		//최빈값
		for(int i=0;i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(list.get(i) == list.get(j)){
					cntlist[i]+=1;
				}
			}
		}
		Arrays.sort(cntlist);
		System.out.println(cntlist[0]);
		
		
		//범위
		System.out.println(Math.abs(list.get(0)-list.get(N-1)));
	}
}
