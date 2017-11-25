package com.ylw.ele;

import java.util.Scanner;

public class Prize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] gift = { "huawei", "iphone", "oppo", "vivo" };
		Scanner in = new Scanner(System.in);
		int[] a = { 0, 0, 0, 0 };
		int flag = 0;
		
		int t;
		
		while (0 != in.nextInt() && flag != 4) {
			t = (int) (Math.random() * 4);
			if (a[t] == 0) {
				System.out.println(gift[t]);
				a[t] = 1;
				flag++;
				continue;
			}
			if (a[t] == 1) {
				while (a[t] == 1)
					t = (int) (Math.random() * 4);
				System.out.println(gift[t]);
				a[t] = 1;
				flag++;

			}

		}
		System.out.println("³é½±½áÊø");
		
	}

}
