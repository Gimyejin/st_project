package com.care.def;

import java.util.Scanner;

import com.care.yejin.Yejin;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("[�л� ����]");
			System.out.println("1.�迹�� 2.�̳��� 3.����ȸ 4.���Ͽ�\n>>>>");;
			num = input.nextInt();
			switch(num) {
			case 1:
				Yejin y = new Yejin();
				break;
			case 2:break;
			case 3:break;
			case 4:break;
			}
		}
	}

}
