//스택을 구현해라
//10828
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner a = new Scanner(System.in);
		int amount = a.nextInt();
		for(int i =0; i<amount; i++) {
			String input  = a.next();
			if(input.contains("push")) {
				int input2 = a.nextInt();
				stack.push(input2);
			}else if(input.equals("pop")) {
				System.out.println(stack.isEmpty()?-1:stack.pop());
			}else if(input.equals("size")) {
				System.out.println(stack.size());
			}else if(input.equals("empty")) {
				System.out.println(stack.isEmpty()?1:0);
			}else if(input.equals("top")) {
				System.out.println(stack.isEmpty()?-1:stack.peek());
			}
		}
	}
}
