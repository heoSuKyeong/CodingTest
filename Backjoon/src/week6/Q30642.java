package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q30642 {
//아이그루스와 화장실
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("annyong", 1);	//용은 홀수
		map.put("induck", 0);	//오리는 짝수
		
		int result = 0;
		
		int floor = Integer.parseInt(br.readLine());
		String mascot = br.readLine();
		int curFloor = Integer.parseInt(br.readLine());
		
		int num = map.get(mascot);
		
		if (curFloor % 2 == num) {
			result = curFloor;
		} else {
			result = curFloor -1;
			if (result <= 0) {
				result +=2;
			}
		}
		
		System.out.println(result);

	}
}
