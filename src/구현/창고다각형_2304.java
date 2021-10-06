package 구현;

import java.io.*;
import java.util.*;

public class 창고다각형_2304 {
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
			
			//시작점과 끝점 찾기
			start = Math.min(xx, start);
			end = Math.max(xx, end);
			//가장 길이가 긴 x좌표 구하기
			if (temp < yy) {
				temp = yy;
				tall = xx;
			}
		}

		sum = y[start];
		int standard = y[start];
		
		for (int i = start + 1; i <= end; i++) {
			if (i == tall) {			//만약 제일 긴 길이에 도달 했다면 더하기를 중지하고 뒤로 더하기를 실시한다.
				sum += y[i];
				backcalc();				//뒤부터 계산을 시작하는 메소드
				break;
			}
			if (standard < y[i]) {		//기준의 길이보다 길면 기준값을 더 긴값으로 바꿈.
				sum += y[i];
				standard = y[i];
			} else if (standard >= y[i]) {		//기준이 길이가 더 길면 그냥 더하기.
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
