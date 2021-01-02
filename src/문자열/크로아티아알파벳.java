package 문자열;
import java.io.*;
import java.util.*;
public class 크로아티아알파벳 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt2=0;
		int cnt3=0;
		
		for(int i=0; i<str.length()-1; i++) {
		if(str.substring(i,i+2).equals("d-") || str.substring(i,i+2).equals("c=")
			||str.substring(i,i+2).equals("c-") || str.substring(i,i+2).equals("d-")	
			||str.substring(i,i+2).equals("lj") || str.substring(i,i+2).equals("nj")	
			||str.substring(i,i+2).equals("s=") || str.substring(i,i+2).equals("z=")){
			cnt2++;
			}
		}
		
		for(int j=0; j<str.length()-2; j++) {
			if(str.substring(j,j+3).equals("dz="))
				cnt3++;
		}
		System.out.println(str.length()-(cnt2+cnt3));
	}
}
