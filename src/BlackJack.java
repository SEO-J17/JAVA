//블랙잭게임.카드합이 21을 넘지않고 n장의 카드중 3장을골라 카드합이 입력된 m과 가까이 카드3장의 합을 구하는 문제
//2798번
import java.util.Scanner;
public class BlackJack {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int m = a.nextInt();
		int [] cards = new int [n];
		
		for(int i=0;i<n;i++) {
			cards[i]= a.nextInt();
		}
		
		int maximum=0;
		
			for(int i=0;i<n-2;i++) {
				for(int j = i+1;j<n-1;j++) {
					for(int k=j+1;k<n;k++) {
					int sum = cards[i]+cards[j]+cards[k];
					if(sum<=m && sum>maximum)
						maximum=sum;
				}
			}
		}
		System.out.println(maximum);
	}
}
