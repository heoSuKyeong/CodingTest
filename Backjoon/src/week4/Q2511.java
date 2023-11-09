package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2511 {
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
		if (same == len) {		//��� ��찡 ������ ��
			result = "D";
		} else if (scoreA>scoreB) {		//A ������ Ŭ ��
			result = "A";
		} else if (scoreA<scoreB) {		//B ������ Ŭ ��
			result = "B";
		} else if (isAWin) {		//������ ���������� ���� �������� �̱� ���
			result = "A";
		}
		System.out.println(scoreA + " " + scoreB);
		System.out.println(result);
		
	}
}
