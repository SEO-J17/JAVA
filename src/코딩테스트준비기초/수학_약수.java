//1037
package �ڵ��׽�Ʈ�غ����;
import java.io.*;
import java.util.*;
public class ����_���{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		if(list.size() == 1) {
			System.out.println(list.get(0)*list.get(0));
		}else {
			System.out.println(list.get(0)*list.get(n-1));
		}
			
		
		
	}
}
