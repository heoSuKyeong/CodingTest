package week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10431 {
//�ټ����
	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		
		int n = Integer.parseInt(br.readLine());	//�׽�Ʈ ���̽� Ƚ��
		int tc = 0;			//�׽�Ʈ ���̽�
		int result =0;		//n�� �̵�Ƚ��
		
		for (int i=0; i<n; i++) {
			result =0;
			int arr[] = new int[20];
			st = new StringTokenizer(br.readLine());
			
			tc = Integer.parseInt(st.nextToken());
			
			//�迭 ���
			for (int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			//����
			for (int j=0; j<arr.length-1; j++) {
				for (int k=j+1; k<arr.length; k++) {
					if (arr[j]>arr[k]) {
						result++;
					}
				}
			}
			
			//��� ���
			System.out.printf("%d %d\n", tc, result);
		}
		
		
	}
}
