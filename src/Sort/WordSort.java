//1181 단어 정렬 문제, N개 단어가 들어오면 
//1.길이가 짧은 순서대로,2.길이가 같으면 사전순으로 정렬하는 프로그램을 작성하시오.
//단어가 같은 단어가 있다면 하나만 출력하여라.

package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a =new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(a.readLine());
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<N; i++) {
			list.add(a.readLine());
		}
		//길이로 정렬
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return 1;
				}
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		System.out.println(list.get(0));
		for(int i=1; i<N; i++) {
		if(list.get(i-1).equals(list.get(i))) {
			continue;
		}
			System.out.println(list.get(i));
		}
	}
}
