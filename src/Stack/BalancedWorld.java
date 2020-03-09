//입력된 괄호는 소괄호,대괄호로 2종류이고 입력된 괄호가 짝이 맞는지 안 맞는지 판단해라
//입력의 종료 조건으로 마지막에 점하나 '.'가 들어온다
//균형을 이룬다면 yes,아니면 no
//4949번
package Stack;
import java.util.Scanner;
import java.util.Stack;
public class BalancedWorld {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		while(true){
			String str = a.nextLine();
			Stack stack = new Stack<>();
			if(str.equals(".")) {break;}
			String[] input = str.split(""); 		//입력값 쪼개서 넣기
			
			for(String scr : input) {
				if(scr.equals("(") || scr.equals("[")) {
					stack.push(scr);		//데이터대입
				}else if(scr.equals(")") && !stack.isEmpty() && stack.peek().equals("(")){
					stack.pop();
				}else if(scr.equals("]") && !stack.isEmpty() && stack.peek().equals("[")) {
					stack.pop();
				}else if(scr.equals(")") || scr.equals("]")) {
					stack.push(scr);
				}
			}
			if(stack.empty()) {
				System.out.println("yes");
			}else
				System.out.println("no");
		}
	}
}
