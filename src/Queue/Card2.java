//N���� ī�尡 �־����ԵǸ� 1~N�������� ī�尡 �ִµ� ������ ���������� �״������� ���������� �����ؼ�
//�������� ���� ī�尡 ��� ������ ���ض�
//2164
package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Card2 {
	public static void main(String[] args) throws IOException {
		ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(a.readLine());
		for(int i =1; i<=num; i++){
			qu.add(i);
			if(num==1) {
			 System.out.println(1);
			 break;
			}else if(num ==2){
			  System.out.println(2);
			  break;
			}else if(qu.size()==num){
			  for(int j=0;j<num;j++) {
				qu.remove();
				qu.add(qu.poll());
			  if(qu.size() == 2) {
				qu.remove();
				System.out.println(qu.peek());
				break;
				}
			  }
			}
		}
	}
}

