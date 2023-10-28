package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q10250 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());	//�׽�Ʈ ������
		
		int height =0;	//ȣ�� �� ��
		int width =0;	//ȣ�� �� ���� ���� ��
		int n=0;		//n��° �մ�
		int floor =0;
		int room =0;
		int[] result = new int[T];	//����� ��� �迭
		
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