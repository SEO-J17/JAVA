//N���� ���� ������� �־������� ������ ���� ���ϴ� ����
//11720�� 
import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
	Scanner number_cnt = new Scanner(System.in);
	int amount = number_cnt.nextInt();
	String input = number_cnt.next();
	
	int temp = 0;
	for(int i=0;i<amount;i++) {
		temp += input.charAt(i)-'0';
	}
	System.out.println(temp);
	}
}
