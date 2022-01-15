//���� 17070
package �ＺSW�����׽�Ʈ;

import java.io.*;
import java.util.*;

public class �������ű��_A�� {
	static int arr[][];
	static int n, cnt = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		calc(0, 1, 0);

		System.out.println(cnt);
	}

	private static void calc(int x, int y, int direction) {
		// 0 ����, 1 ����, 2 �밢 ����
		if (x >= 0 && y >= 0 && x < n && y < n) {
			if (direction == 2) {
				if (arr[x][y - 1] == 1 || arr[x - 1][y] == 1 || arr[x][y] == 1) {
					return;
				}

			} else {
				if (arr[x][y] == 1) {
					return;
				}
			}
			
			if (x == n - 1 && y == n - 1) {
				++cnt;
				return;
			}

			if (direction == 0) {
				calc(x, y + 1, 0); // ������
				calc(x + 1, y + 1, 2); // �밢����
			} else if (direction == 1) {
				calc(x + 1, y, 1); // ������
				calc(x + 1, y + 1, 2); // �밢����
			} else { // �밢�� �� ��.
				calc(x, y + 1, 0); // ���ι���
				calc(x + 1, y, 1); // ���ι���
				calc(x + 1, y + 1, 2);
			}
		}
	}
}
