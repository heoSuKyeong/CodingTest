package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//하얀 칸
public class Q1100 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result =0;		//결과값
		
		for (int i=0; i<8; i++) {
			String line = br.readLine();	//체스판 한 줄
			
			for (int j=0; j<8; j++) {		//체스판 한 칸
				//열과 행이 둘 다 짝수 이거나 둘 다 홀수 일 때 흰색 칸이다.
				/*
				if (i%2 ==0 && j%2==0) {	
					if (line.charAt(j) == 'F') {
						result++;
					}
				}
				
				if (i%2 != 0 && j%2 != 0) {
					if (line.charAt(j) == 'F') {
						result++;
					}
				}
				*/
				
				if ((i+j) % 2 ==0 && line.charAt(j) == 'F') {
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}
}
