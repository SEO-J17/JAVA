//요세푸스 수열,1~N까지 수가 있을때 원형으로 k을 입력받아 k번째사람은 빼고 k번째 부터 정렬한다.
//11866
package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Josephus {
	public static void main(String[] args) throws IOException {
		ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
		BufferedReader a =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(a.readLine());
		Integer num = Integer.parseInt(st.nextToken());
		Integer limit = Integer.parseInt(st.nextToken());
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i=1; i<=num; i++) {
			qu.add(i);
		}
		while(qu.size() != 0) {
			for(int j=0; j<limit-1; j++) {
			qu.add(qu.poll());
			}
			list.add(qu.poll());
		}
		System.out.print(list);
	}
}

//링크드 리스트를 써도 되었다.