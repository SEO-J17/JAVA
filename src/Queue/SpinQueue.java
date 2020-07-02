//회전하는 큐문제, 양방향 순환 큐를 가지고있고 이큐에서 몇개의 원소를 뽑으려고한다.
//큐의 크기 N과 뽑으려고 하는 수의 개수 M이 주어질때 N<=50,m<=M 일때 둘째줄에는 뽑아내려고하는 수의 위치가 순서대로 주어진다.
//뽑고 싶은 원소가 주어진 순서로 뽑는데 연산의 최솟값을 출력해라.
//큐!!!!
//1021번

package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SpinQueue {
	public static void main(String[] args) throws IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
		int cnt = 0,sum=0;
		StringTokenizer st = new StringTokenizer(a.readLine());
		Integer num = Integer.parseInt(st.nextToken());
		Integer loca = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(a.readLine());
		for(int d=1; d<=num; d++) {
			qu.add(d);
		}
		
		for(int i=0; i<loca; i++) {
			Integer temp=Integer.parseInt(st2.nextToken());
			while(true) {
			if(qu.peek() == temp) {
				qu.poll();
				break;
			}
			else if(qu.size()/2<temp) {
				qu.addFirst(qu.pollLast());
				cnt++;
			}else if(qu.size()/2 >= temp) {
				qu.addLast(qu.pollFirst());
				cnt++;
			}
		  }
		}
		System.out.println(cnt);
	}
}
