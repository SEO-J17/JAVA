//VPS(올바른 괄호)주어진 괄호 문자열이 vps인지 아닌지를 판단하여 결과를 yes,no로 나타내라
//9012
package Stack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args){	
		Scanner a= new Scanner(System.in);
		int num = a.nextInt();
		ArrayList <String> list = new ArrayList<>();
		
		 for(int i=0;i<num;i++){
			String ps = a.next();
			Stack stack = new Stack<>();
		  for(int j=0;j<ps.length();j++) {
			  if(ps.charAt(j) == '(') 
			  	{stack.push('(');}
			  else if(ps.charAt(j) == ')') {
				 if(!stack.isEmpty()) 
				 		{stack.pop(); break;}
				 		
				 else 
				 		{stack.push(')');}
			  	}
			 }
		  if(stack.isEmpty()) 
		  		{list.add("YES");}
		  else 
		  		{list.add("NO");}
		  
		 }
		for(String i : list) {
			System.out.println(i);
		}
	 }
	}
