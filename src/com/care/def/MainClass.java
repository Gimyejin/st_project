package com.care.def;

import java.util.Scanner;

import com.care.yejin.Yejin;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("[학생 관리]");
			System.out.println("1.김예진 2.이나영 3.구건회 4.김하용\n>>>>");;
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
