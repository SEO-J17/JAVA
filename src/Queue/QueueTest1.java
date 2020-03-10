//ť�� �⺻�� �ɷ� �׽�Ʈ ���� ť�� ��������� 0,�ƴϸ� 1�� ����ϰ� ������ ������ -1 ���
package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;


public class QueueTest1 {
	public static void main(String[] args) throws IOException {
		ArrayDeque<Integer> qu = new ArrayDeque<>();
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(a.readLine());
		for(int i=0;i<num;i++){
			StringTokenizer st = new StringTokenizer(a.readLine());
			String command = st.nextToken();
			if(command.contains("push")) {
				Integer data =Integer.parseInt(st.nextToken()); 
				qu.add(data);
			}else if(command.equals("pop")) {
				System.out.println(qu.isEmpty()? -1 : qu.poll());
			}else if(command.equals("size")) {
				System.out.println(qu.size());
			}else if(command.equals("front")) {
				System.out.println(qu.isEmpty()? -1 : qu.peek());
			}else if(command.equals("back")) {
				System.out.println(qu.isEmpty()? -1 : qu.getLast());
			}else if(command.equals("empty")) {
				System.out.println(qu.isEmpty()? 1 : 0);
			}
		}
	
	}

}
