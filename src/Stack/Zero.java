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
