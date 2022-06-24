package �ùķ��̼�;

import java.io.*;
import java.util.*;

public class Ʈ�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken()); // �ٸ�����
		int w = Integer.parseInt(st.nextToken()); // ��� ����
		
		Queue<Integer> truck = new LinkedList();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			truck.add(Integer.parseInt(st.nextToken()));
		}

		Queue<Integer> qu = new LinkedList();	//���� �ٸ� ���¸� ��Ÿ���� ť
		for (int i = 0; i < l; i++) {
			qu.add(0);
		}

		int time = 0;
		int weight = 0;
		while (!qu.isEmpty()) {
			time++;
			weight -= qu.poll();
			if (!truck.isEmpty()) {
				if (truck.peek() + weight <= w) {
					weight += truck.peek();
					qu.add(truck.poll());
				} else {
					qu.add(0);
				}
			}
		}

		System.out.print(time);

	}
}
