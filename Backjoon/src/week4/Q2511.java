package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2511 {
//카드놀이
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = 10;
		int[] arrA = new int[len]; 
		int[] arrB = new int[len];
		
		StringTokenizer st =  new StringTokenizer(br.readLine());
		for (int i=0; i<len; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		
		st =  new StringTokenizer(br.readLine());
		for (int i=0; i<len; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}
		
		int scoreA=0, scoreB=0, same=0;
		boolean isAWin=true;
		
		for (int i=0; i<len; i++) {
			
			if (arrA[i]>arrB[i]) {
				scoreA += 3;
				isAWin = true;
			} else if (arrA[i]<arrB[i]) {
				scoreB += 3;
				isAWin = false;
			} else {
				scoreA++; scoreB++;
				same++;
			}
			
		}
		
		String result="B";
		if (same == len) {		//모든 경우가 동점일 때
			result = "D";
		} else if (scoreA>scoreB) {		//A 승점이 클 때
			result = "A";
		} else if (scoreA<scoreB) {		//B 승점이 클 때
			result = "B";
		} else if (isAWin) {		//승점이 동일하지만 제일 마지막에 이긴 사람
			result = "A";
		}
		System.out.println(scoreA + " " + scoreB);
		System.out.println(result);
		
	}
}

