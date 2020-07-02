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
		String command = a.readLine();			//명령어 받기
		String [] command2= command.split("");
		Integer arrnum = Integer.parseInt(a.readLine());			//배열의 요소개수
		String arr = a.readLine();											//배열의 실제 데이터값
		String arr2 = arr.substring(arr.indexOf("[")+1,arr.lastIndexOf("]"));
		}
	}
}
