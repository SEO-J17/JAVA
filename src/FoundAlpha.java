//���ĺ����־����� ���ĺ� ã�� ����
//10809��
import java.util.Arrays;
import java.util.Scanner;
public class FoundAlpha {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		
		int [] alpha = new int[26];
		Arrays.fill(alpha, -1);		//arrays.fill�޼ҵ�� �迭�� �ΉK���� ��� -1�� �ʱ�ȭ�Ѵ�.
	
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
