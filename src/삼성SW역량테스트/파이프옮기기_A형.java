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

		calc(0, 0, 0, 1);

		System.out.println(cnt);
	}

	private static void calc(int x1, int y1, int x2, int y2) {
		int chk_x = Math.abs(x2 - x1);
		int chk_y = Math.abs(y2 - y1);

		if (x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0 && x1 < n && y1 < n && x2 < n && y2 < n) {
			if (x2 == n - 1 && y2 == n - 1) {
				++cnt;
				return;
			}

			if (chk_x == 0 && chk_y == 1) { // 1. ���� ����
				if (y2 + 1 < n) {
					if (arr[x2][y2 + 1] != 1) {
						calc(x1, y1 + 1, x2, y2 + 1); // ������ �б�
					}
				}

				if (check(x2, y2)) {
					calc(x1, y1 + 1, x2 + 1, y2 + 1); // �밢 ȸ��
				}

			} else if (chk_x == 1 && chk_y == 0) { // 2. ���� ����
				if (x2 + 1 < n) {
					if (arr[x2 + 1][y2] != 1) {
						calc(x1 + 1, y1, x2 + 1, y2); // ������ �б�
					}
				}
				if (check(x2, y2)) {
					calc(x1 + 1, y1, x2 + 1, y2 + 1); // �밢ȸ��
				}
			} else if (chk_x == 1 && chk_y == 1) { // 3. �밢 ����
				if (y2 + 1 < n) {
					if (arr[x2][y2 + 1] != 1) {
						calc(x1 + 1, y1 + 1, x2, y2 + 1); // �����ιб�
					}
				}
				if (x2 + 1 < n) {
					if (arr[x2 + 1][y2] != 1) {
						calc(x1 + 1, y1 + 1, x2 + 1, y2); // �Ʒ��ιб�
					}
				}
				if (check(x2, y2)) {
					calc(x1 + 1, y1 + 1, x2 + 1, y2 + 1); // �밢���� �б�
				}
			}
		} else
			return;
	}

	private static boolean check(int x, int y) {
		boolean flag = false;
		if (y + 1 < n && x + 1 < n) {
			if (arr[x][y + 1] != 1 && arr[x + 1][y] != 1 && arr[x + 1][y + 1] != 1) {
				flag = true;
			} else {
				flag = false;
			}
		}

		return flag;
	}

}
