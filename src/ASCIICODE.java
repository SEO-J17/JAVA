//���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//11654�� ����
import java.util.Scanner;
public class ASCIICODE {
	public static void main(String[] args) {	
	Scanner input_alpha = new Scanner(System.in);
	System.out.print("���ĺ��� �Է�: ");
	char ascii = input_alpha.nextLine().charAt(0);
	int iascii = (int)ascii;
	System.out.println("��ȯ�� �ƽ�Ű�ڵ�:"+ iascii);
	}
}
