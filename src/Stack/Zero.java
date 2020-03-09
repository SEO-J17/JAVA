//0을 만났을때  최근값을 지우고 이렇게해서 모든 받은값의 합을 구해라.
//10773
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Zero {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner a = new Scanner(System.in);
		int K = a.nextInt();
		int sum = 0;
		
		for(int i=0;i<K;i++) {
			int temp=a.nextInt();
			if(temp == 0) {
				stack.pop();
			}else {stack.push(temp);}
		}
		
		for(int i : stack) {sum += i;}
		
		System.out.println(sum);
	}
}
