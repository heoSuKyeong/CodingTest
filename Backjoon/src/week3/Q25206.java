package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25206 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int major = 20;	//전공과목 수
		float grades = 0;
		float scores = 0;
		
		for (int i=0; i<major; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			float grade = Float.parseFloat(st.nextToken());
			String score = st.nextToken();
			
			if (score.equals("P")) {
				continue;
			}
			grades += grade;
			scores += conversion(score)*grade;
		}
		
		System.out.printf("%.6f", scores/grades);
		
	}
	
	//입력받은 문자열 등급을 점수로 변환한다.
	private static float conversion(String str) {
		
		switch (str) {
		case "A+":
			return 4.5f;
		case "A0":
			return 4.0f;
		case "B+":
			return 3.5f;
		case "B0":
			return 3.0f;
		case "C+":
			return 2.5f;
		case "C0":
			return 2.0f;
		case "D+":
			return 1.5f;
		case "D0":
			return 1.0f;
		case "F":
			return 0;
		default:
			break;
		}
		return 0;
	}

}
