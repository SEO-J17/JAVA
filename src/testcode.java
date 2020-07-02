import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class testcode{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int arr[] = new int[N];
        int max = Integer.parseInt(br.readLine());
        int l = 0;
        int r = 0;
        for (int i = 0; i < N; i++) {
            int money = Integer.parseInt(str1[i]);
            arr[i] = money;
            r = arr[i] > r ? arr[i] : r;
        }
        while (l < r) {
            int sum = 0;
            int m = (l + r + 1) / 2;
            for (int i = 0; i < N; i++) {
                if (arr[i] > m) sum += m;
                else sum += arr[i];
            }
            if (max < sum) r = m - 1;
            else l = m;
        }
        bw.write(String.valueOf(l));
        bw.flush();

	}
}
  