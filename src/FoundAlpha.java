//알파벳을주어지고 알파벳 찾기 문제
//10809번
import java.util.Arrays;
import java.util.Scanner;
public class FoundAlpha {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		
		int [] alpha = new int[26];
		Arrays.fill(alpha, -1);		//arrays.fill메소드는 배열의 인덷스를 모두 -1로 초기화한다.
	
		for(int i=0;i<b.length();i++) {
			int pos = b.charAt(i)-97;
			if(alpha[pos] == -1) {
				alpha[pos]=i;
			}
		}
		for(int i : alpha)
			System.out.print(i);
	}
}
