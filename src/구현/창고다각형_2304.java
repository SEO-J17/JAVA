package ����;

import java.io.*;
import java.util.*;

public class â��ٰ���_2304 {
	static int y[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		y = new int[1001];

		int start = 999;
		int temp = -1;
		int end = -1;
		int tall = -1;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xx = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			y[xx] = yy;

			// �������� ���� ã��
			start = Math.min(xx, start);
			end = Math.max(xx, end);
			// ���� ���̰� �� x��ǥ ���ϱ�
			if (temp < yy) {
				temp = yy;
				tall = xx;
			}
		}

		sum = y[start];
		int standard = y[start];

		for (int i = start + 1; i <= tall; i++) {
			if (i == tall) {	 // ���� ���� �� ���̿� ���� �ߴٸ� ���ϱ⸦ �����Ѵ�.
				sum += y[i];
				break;
			}
			if (standard < y[i]) { // ������ ���̺��� ��� ���ذ��� �� �䰪���� �ٲ�.
				sum += y[i];
				standard = y[i];
			} else if (standard >= y[i]) { // ������ ���̰� �� ��� �׳� ���ϱ�.
				sum += standard;
			}
		}
		
		//backcalc ��� �޼ҵ带 ���ؼ� �� �ں��� ���� �� ������ x��ǥ �ձ��� ����� �Ѵ�. 
		System.out.print(backcalc(sum, end, tall));

	}

	private static int backcalc(int sum, int end, int tall) {
		int standard = y[end];
		
		for (int i = end; i > tall; i--) {
			if (standard < y[i]) {
				standard = y[i];
				sum += y[i];
			} else if (standard >= y[i]) {
				sum += standard;
			}
		}
		
		return sum;
		
	}
}
