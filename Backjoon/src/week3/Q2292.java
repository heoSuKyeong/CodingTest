package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2292 {

	//¹úÁý
	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		int i=1;
		
		if (n==1) {
			System.out.println(1);
		} else {
			//n +=2;
			
			while (n>1) {
				n -= 6*i;
				i++;
			}
			
			System.out.println(i);
		}
		
	}
	
}
