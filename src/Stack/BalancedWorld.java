//�Էµ� ��ȣ�� �Ұ�ȣ,���ȣ�� 2�����̰� �Էµ� ��ȣ�� ¦�� �´��� �� �´��� �Ǵ��ض�
//�Է��� ���� �������� �������� ���ϳ� '.'�� ���´�
//������ �̷�ٸ� yes,�ƴϸ� no
//4949��
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
			String[] input = str.split(""); 		//�Է°� �ɰ��� �ֱ�
			
			for(String scr : input) {
				if(scr.equals("(") || scr.equals("[")) {
					stack.push(scr);		//�����ʹ���
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
