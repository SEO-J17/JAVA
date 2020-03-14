//덱 기본문제, 입력으로 주어지는 명령을 처리하는 프로그램을 만들어라.
//10866
package Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Deque {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
		int num = Integer.parseInt(a.readLine());
		for(int i =0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(a.readLine());
			String command = st.nextToken();

			if(command.contains("push_back")) {
				Integer data = Integer.parseInt(st.nextToken());
				qu.addLast(data);
			}else if (command.contains("push_front")) {
				Integer data = Integer.parseInt(st.nextToken());
				qu.addFirst(data);
			}else if(command.equals("front")) {
				System.out.println(qu.isEmpty() ? -1 : qu.peek());
			}else if(command.equals("back")) {
			System.out.println(qu.isEmpty() ? -1 :  qu.getLast());
			}else if(command.equals("pop_front")) {
				System.out.println(qu.isEmpty() ? -1 : qu.pollFirst());
			}else if(command.equals("pop_back")) {
				System.out.println(qu.isEmpty() ? -1 : qu.pollLast());
			}else if(command.equals("size")) {
				System.out.println(qu.size());
			}else if(command.equals("empty")) {
				System.out.println(qu.isEmpty() ? 1:0);
			}
		}
	}
}
