package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//�Ͼ� ĭ
public class Q1100 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result =0;		//�����
		
		for (int i=0; i<8; i++) {
			String line = br.readLine();	//ü���� �� ��
			
			for (int j=0; j<8; j++) {		//ü���� �� ĭ
				//���� ���� �� �� ¦�� �̰ų� �� �� Ȧ�� �� �� ��� ĭ�̴�.
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
