package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {
//ü����
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		int result = Integer.MAX_VALUE;		//���(�ּ� ���簢�� ����)
		int count = 0;						//������ ���簢�� ����
		for (int i=0; i <= n-8; i++) {		//ü������ 8ĭ�̹Ƿ� 8ĭ�� ����� �˻�
			for (int j=0; j <= m-8; j++) {
				
				count = boardCheck(i, j, arr);		//����� �� �˻�
				result = Math.min(result, count);	//����� �� �߿��� �ּ� ���� ����� �����Ѵ�.
			}
		}
		
		System.out.println(result);
	}

	private static int boardCheck(int startRow, int startCol, String[] arr) {
		String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
		int whiteCol =0;
		
		for (int i=0; i<8; i++) {
			int row = startRow + i;			//����ڰ� �Է��� �������� ���� row
			for (int j=0; j<8; j++) {
				int col = startCol + j;		//����ڰ� �Է��� �������� ���� col
				
				if (arr[row].charAt(col) != orgBoard[row%2].charAt(j)) {
					whiteCol++;
				}
			}
		}
		
		//W�� ������ �����ǰ� B�� ������ ������ �߿��� ���� ������ ����
		return Math.min(whiteCol, 64-whiteCol);
	}
}
