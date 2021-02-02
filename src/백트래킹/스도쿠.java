package 백트래킹;
import java.util.*;
import java.io.*;
public class 스도쿠 {
	static int[][] arr = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		calc(0, 0);
 
	}
 
	public static void calc(int row, int col) {
		StringBuilder sb = new StringBuilder();
		//열 검사가 다 끝났다면
		if (col == 9) {
			calc(row + 1, 0);
			return;
		}
 
		if (row == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			
			System.out.print(sb);
			return;
		}
 
		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (check(row, col, i)) {
					arr[row][col] = i;
					calc(row, col + 1);
				}
			}
			arr[row][col] = 0;
			return;
		}
 
		calc(row, col + 1);
		
	}
 
	public static boolean check(int row, int col, int val) {
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == val) {
				return false;
			}
		}
 
		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == val) {
				return false;
			}
		}
 
		//작은 정사각형의 숫자 중복 체크
		int squre_row = (row / 3) * 3; 
		int squre_col = (col / 3) * 3; 
 
		for (int i = squre_row; i < squre_row + 3; i++) {
			for (int j = squre_col; j < squre_col + 3; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}
		}
 
		return true; //중복이 없을 때 true
	}
 
}