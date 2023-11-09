package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2456 {
//전교회장 > 틀림
	static int[] student1 = new int[3];
	static int[] student2 = new int[3];
	static int[] student3 = new int[3];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int score1=0, score2=0, score3=0;
		int sum1=0, sum2=0, sum3=0;
		
		StringTokenizer st;
		int num=0;
		for (int i=0; i<n; i++) {
			st =  new StringTokenizer(br.readLine());
			
			num = Integer.parseInt(st.nextToken());
			score1 += Math.pow(num, 2);
			sum1 += num;
			num = Integer.parseInt(st.nextToken());
			score2 += Math.pow(num, 2);
			sum2 += num;
			num = Integer.parseInt(st.nextToken());
			score3 += Math.pow(num, 2);
			sum3 += num;
		}
		
		//회장 결정 조건
		//1. 승점
		//2. 3의 갯수
		//3. 무승부일 때 0
		if (score1 > score2 && score1 > score3) {
			System.out.printf("%d %d", 1, sum1);
		} else if (score2 > score1 && score2 > score3) {
			System.out.printf("%d %d", 2, sum2);		
		} else if (score3 > score1 && score3 > score2) {
			System.out.printf("%d %d", 3, sum3);		
		} else {
			System.out.printf("%d %d", 0, sum1);
		}
			
	}
}
