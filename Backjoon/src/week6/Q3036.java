package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3036 {
//��
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();		//���
		
		int first = Integer.parseInt(st.nextToken());
		for (int i=0; i<n-1; i++) {
			int ring = Integer.parseInt(st.nextToken());
			int count = first / ring;
			sb.append(first / ring + "").append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
