//16637
package 삼성A형;
import java.io.*;
import java.util.*;
public class 괄호추가하기 {
	static int len;
	static String calc;
	static int max = -99;
	static ArrayList<Integer> num;
	static ArrayList<Character> oper;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		len = Integer.parseInt(br.readLine());
		calc = br.readLine();
		num = new ArrayList<>();
		oper = new ArrayList<>();
		
		for(int i = 0; i < len; i++) {
			if(i%2 == 0) {
				num.add(calc.charAt(i)-'0');
			}else
				oper.add(calc.charAt(i));
		}
		
		dfs(num.get(0),0);
		
		System.out.println(max);
		
		
	}
	
	private static void dfs(int sum, int idx) {
		if(idx >= oper.size()) {
			max = Math.max(sum, max);
			return;
		}
		
		int temp1 = calc(oper.get(idx), sum, num.get(idx + 1));	//괄호가 없을경우.
		dfs(temp1, idx + 1);
		
		if(idx + 1 < oper.size()) {
			int temp = calc(oper.get(idx + 1), num.get(idx + 1), num.get(idx + 2));
			dfs(calc(oper.get(idx), sum, temp), idx+2);
		}
		
	}

	private static int calc(Character operation, int num1, int num2) {
		switch (operation) {
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
        }
        return 0;
	}
}
