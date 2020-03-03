//����� +,-,��ȣ�� ������ �ִ� ���̰� 50�� ���� ����� ��ȣ�� ��� �����µ� ��ȣ�� �ļ� 
//���� �ּҷ� ����� ���α׷��� �ۼ��ض�
//1541��
package GreedyAlgorithm;
import java.util.Scanner;

public class LostParenthesis {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String [] calc = a.next().split("\\-");
		int minimum = 0;
		
		for(int i=0;i<calc.length;i++) {
			int num = sum(calc[i]);
			
			if(i == 0) { num *= -1;}		//ù��°���� -1�� ���Ѵ�
			minimum -= num;
		}
		System.out.println(minimum);	
	}

	private static int sum(String number) {
		String [] subnums = number.split("\\+");
		int result = 0;
		
		for(String i : subnums) {
			result += Integer.parseInt(i);	//���ڿ��� ���������� ��ȯ���ش�.
		}
		return result;
	}
}
