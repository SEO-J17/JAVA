package ����;

import java.io.*;
import java.util.*;

public class â��ٰ���_2304 {
	static int sum;
	static int x[];
	static int y[];
	static int end = -1;
	static int tall;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		x = new int[1001];
		y = new int[1001];
		
		int start = 999;
		int temp = -1;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xx = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			x[xx] = 1;
			y[xx] = yy;
			
			//�������� ���� ã��
			start = Math.min(xx, start);
			end = Math.max(xx, end);
			//���� ���̰� �� x��ǥ ���ϱ�
			if (temp < yy) {
				temp = yy;
				tall = xx;
			}
		}

		sum = y[start];
		int standard = y[start];
		
		for (int i = start + 1; i <= end; i++) {
			if (i == tall) {			//���� ���� �� ���̿� ���� �ߴٸ� ���ϱ⸦ �����ϰ� �ڷ� ���ϱ⸦ �ǽ��Ѵ�.
				sum += y[i];
				backcalc();				//�ں��� ����� �����ϴ� �޼ҵ�
				break;
			}
			if (standard < y[i]) {		//������ ���̺��� ��� ���ذ��� �� �䰪���� �ٲ�.
				sum += y[i];
				standard = y[i];
			} else if (standard >= y[i]) {		//������ ���̰� �� ��� �׳� ���ϱ�.
				sum += standard;
			}
		}

		System.out.println(sum);

	}

	private static void backcalc() {
		int standard = y[end];
		for (int i = end; i > tall; i--) {
			if (standard < y[i]) {
				standard = y[i];
				sum += y[i];
			} else if (standard >= y[i]) {
				sum += standard;
			}
		}
	}
}
