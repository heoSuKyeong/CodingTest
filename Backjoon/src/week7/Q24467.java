package week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q24467 {
//�� ����
	/*
	 * 0�� ������ �޸�, 1�� ������ �ո��� ��Ÿ����. �޸��� �ϳ��� ��� ���� �� ĭ ������Ų��. : ��(3) �޸��� ���� ��� ���� �� ĭ
	 * ������Ų��. : ��(2) �޸��� ���� ��� ���� �� ĭ ������Ų��. : �� (1) ��� �޸��� ��� ���� �� ĭ ������Ų ��, ���� �߰���
	 * ������. : �� (0) ��� �ո��� ��� ���� �ټ� ĭ ������Ų ��, ���� �߰��� ������. : �� (4) ������ ������ ��η� �� ������
	 * ���� ������ ������ �Ʒ��� ������ �� �� ĭ �� �������� ������ �� �ִ�. ������ �Է��� ��, ��, �� �� �ϳ��� �־�����.
	 * 
	 * ��, �� ������ ǥ�õ� ��ġ�� ���� ���̸� ��������� ª�� ��� �����Ѵ�. �� ��ġ�� ������ �ʴ´ٸ� ��������� �� ��� ���� �Ѵ�. ��
	 * �� ��ġ : 5,8,10,15
	 * 
	 * 
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] values = { 21, 0 };

		int count = 0;

		for (int i = 0; i < 10; i++) {

			long a = br.readLine().chars().filter(c -> c == '0').count();

			test(values, a);

			count++;

			while (a == 0 || a == 4) {
				a = br.readLine().chars().filter(c -> c == '0').count();

				test(values, a);

				count++;

				if (count > 49) {
					break;
				}

			}

			if (count > 49) {
				break;
			}

		}

		if (values[0] <= 0) {
			bw.write("WIN");
		} else {
			bw.write("LOSE");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	static void test(int[] values, long a) {

		values[0] = a == 1 ? values[0] - 1
				: a == 2 ? values[0] - 2 : a == 3 ? values[0] - 3 : a == 4 ? values[0] - 4 : values[0] - 5;

		if (values[1] == 0) {
			if (values[0] == 16) {
				values[0] = 12;
				values[1]++;
			} else if (values[0] == 11) {
				values[0] = 7;
				values[1]++;
			}

		} else if (values[1] == 1) {
			if (values[0] == 9) {
				values[0] = 4;
				values[1]++;
			}
		}
	}

}