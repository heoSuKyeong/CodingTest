package week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9655 {
//µπ∞‘¿”
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		/*
		if ((n % 2) !=0) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
		*/
		System.out.println(((n % 2) ==0)?"CY":"SK");
		
	}
}
