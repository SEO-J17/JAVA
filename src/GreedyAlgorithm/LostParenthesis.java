//양수와 +,-,괄호를 가지고 최대 길이가 50인 식을 만들고 괄호를 모두 지웠는데 괄호를 쳐서 
//식을 최소로 만드는 프로그램을 작성해라
//1541번
package GreedyAlgorithm;
import java.util.Scanner;

public class LostParenthesis {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String [] calc = a.next().split("\\-");
		int minimum = 0;
		
		for(int i=0;i<calc.length;i++) {
			int num = sum(calc[i]);
			
			if(i == 0) { num *= -1;}		//첫번째값에 -1을 곱한다
			minimum -= num;
		}
		System.out.println(minimum);	
	}

	private static int sum(String number) {
		String [] subnums = number.split("\\+");
		int result = 0;
		
		for(String i : subnums) {
			result += Integer.parseInt(i);	//문자열을 정수형으로 반환해준다.
		}
		return result;
	}
}
