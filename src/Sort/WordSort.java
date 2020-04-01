//1181 �ܾ� ���� ����, N�� �ܾ ������ 
//1.���̰� ª�� �������,2.���̰� ������ ���������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�ܾ ���� �ܾ �ִٸ� �ϳ��� ����Ͽ���.

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
		//���̷� ����
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
