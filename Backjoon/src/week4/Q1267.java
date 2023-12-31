package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1267 {
	//핸드폰 요금
	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int yFee=0;
		int mFee=0;
		int time=0;
		
		int n= Integer.parseInt(br.readLine());
		
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			
			time = Integer.parseInt(st.nextToken());
			/*
			//영식 요금 계산
			if (time % 29 == 0) {
				yFee += (time / 29) * 10;
			} else {
				yFee += (time / 29 + 1) * 10;
			}
			
			//민식 요금 계산
			if (time % 59 == 0) {
				mFee += (time / 59) * 15;
			} else {
				mFee += (time / 59 + 1) * 15;
			}
			*/
			yFee += (time / 30+1) * 10;
			mFee += (time / 60+1) * 15;
			
			
		}
		if (yFee < mFee) {
			System.out.println("Y " + yFee);
		} else if (mFee < yFee) {
			System.out.println("M " + mFee);
		} else {
			System.out.println("Y M " + yFee);
		}
		System.out.println("y " + yFee + ", m " + mFee);
	}
}
