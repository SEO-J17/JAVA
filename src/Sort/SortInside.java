//1427 ���ڸ� �ڸ������ �߶� ������������
//ex)2143�Է� -> 4321�� �����.
package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortInside {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		String N = a.readLine();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N.length(); i++) {
			list.add(Integer.parseInt(N.substring(i,i+1)));
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i : list){ 
			System.out.print(i);
		}
	}
}
