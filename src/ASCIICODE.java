//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
//11654번 문제
import java.util.Scanner;
public class ASCIICODE {
	public static void main(String[] args) {	
	Scanner input_alpha = new Scanner(System.in);
	System.out.print("알파벳을 입력: ");
	char ascii = input_alpha.nextLine().charAt(0);
	int iascii = (int)ascii;
	System.out.println("변환한 아스키코드:"+ iascii);
	}
}
