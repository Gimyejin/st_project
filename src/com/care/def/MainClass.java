package com.care.def;

import java.util.Scanner;

<<<<<<< HEAD

=======
import com.care.StInfo2.StInfo2HashMap;
>>>>>>> leenayoung
import com.care.StInfo2.StInfo2_Main;
import com.care.yejin.Yejin;


public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		StInfo2_Main st2 = new StInfo2_Main();
		//StInfo2HashMap map = new StInfo2HashMap();
		while(true) {
			System.out.println("[�л� ����]");
			System.out.println("1.�迹�� 2.�̳��� 3.����ȸ 4.���Ͽ�\n>>>>");;
			num = input.nextInt();
			switch(num) {
<<<<<<< HEAD
			case 1:
				Yejin y = new Yejin();
				break;
			case 2: st2.StInfo2display(); break;
=======
			case 1:break;
			case 2: st2.StInfo2display();
					//map.mapDisplay();
					break;
>>>>>>> leenayoung
			case 3:break;
			case 4:break;
			}
		}
	}

}
