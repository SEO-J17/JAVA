package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Router_ex {
	public static void main(String[] args) throws IOException {
		  	BufferedReader a =new BufferedReader(new InputStreamReader(System.in));
		  	StringTokenizer st = new StringTokenizer(a.readLine());
		  	int house = Integer.parseInt(st.nextToken());
		  	int router = Integer.parseInt(st.nextToken());
		  	int [] distance = new int [house];
		  	
		  	for(int i=0; i<house; i++) {
		  		distance[i] = Integer.parseInt(a.readLine());
		  	}
		  	Arrays.sort(distance);
		  	
		  	
		
	}

}
