//ȸ���ϴ� ť����, ����� ��ȯ ť�� �������ְ� ��ť���� ��� ���Ҹ� ���������Ѵ�.
//ť�� ũ�� N�� �������� �ϴ� ���� ���� M�� �־����� N<=50,m<=M �϶� ��°�ٿ��� �̾Ƴ������ϴ� ���� ��ġ�� ������� �־�����.
//�̰� ���� ���Ұ� �־��� ������ �̴µ� ������ �ּڰ��� ����ض�.
//ť!!!!
//1021��

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
