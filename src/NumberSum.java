//N개의 수가 공백없이 주어졌을때 숫자의 합을 구하는 문제
//11720번 
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
