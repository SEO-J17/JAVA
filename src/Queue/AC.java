//5430
package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class AC {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Integer> qu =new ArrayDeque<Integer>();
		Integer testcase = Integer.parseInt(a.readLine());
		
		for(int i =0; i<testcase; i++) {
		String command = a.readLine();			//��ɾ� �ޱ�
		String [] command2= command.split("");
		Integer arrnum = Integer.parseInt(a.readLine());			//�迭�� ��Ұ���
		String arr = a.readLine();											//�迭�� ���� �����Ͱ�
		String arr2 = arr.substring(arr.indexOf("[")+1,arr.lastIndexOf("]"));
		}
	}
}
