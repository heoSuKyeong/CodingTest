package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q10250 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());	//테스트 데이터
		
		int height =0;	//호텔 층 수
		int width =0;	//호텔 한 층당 방의 수
		int n=0;		//n번째 손님
		int floor =0;
		int room =0;
		int[] result = new int[T];	//결과를 담는 배열
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			height = Integer.parseInt(st.nextToken());
			width = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());

			//int len = (int) (Math.log10(width));

			floor = n % height;
			
			room = n / height +1;
			
			if (floor == 0) {
				floor = height;
				room = n/height;
			}
			
			//result[i] = (floor * len *100) + room;
			result[i] = (floor *100) + room;
		}
		
		for (int num : result) {
			System.out.println(num);
		}
		
	}
}
