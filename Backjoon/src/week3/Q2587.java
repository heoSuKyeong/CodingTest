package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Q2587 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int[] num = new int[5];
		int sum =0;
		
		for (int i=0; i<num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		Arrays.sort(num);
		
		System.out.println(sum / num.length);
		System.out.println(num[num.length / 2]);
		*/
		int len = 5;
		ArrayList<Integer> num = new ArrayList<Integer>();
		int sum=0;
		
		for (int i=0; i<len; i++) {
			num.add(Integer.parseInt(br.readLine()));
			sum += num.get(i);
		}
		num.sort((o1, o2)-> o1-o2);
		
		System.out.println(sum / len);
		System.out.println(num.get(len/2));
	}
}
