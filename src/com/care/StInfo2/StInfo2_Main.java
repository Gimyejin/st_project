package com.care.StInfo2;

import java.util.ArrayList;
import java.util.Scanner;


public class StInfo2_Main {
	public void StInfo2display() {

		Scanner input = new Scanner(System.in);
		ArrayList<StInfo2> arr = new ArrayList<StInfo2>();
		String name, addr;
		int age;

		while(true) {
			System.out.println("1.�л���� 2.���Ȯ��");
			int num = input.nextInt();
			switch(num) {
			case 1: 
				StInfo2 s = new StInfo2();
				if(arr.size()!=0) {
					while(true) {
						System.out.println("�̸� �Է�");
						name = input.next();
						if(arr.contains(name)) {
							System.out.println("�̹� ��ϵ� �̸��Դϴ�");
							continue;	
						}
						break;
					}
				}else {
					System.out.println("�̸� �Է�");
					name = input.next();
				}
					System.out.println("���� �Է�");
					age = input.nextInt();
					System.out.println("�ּ� �Է�");
					addr = input.next();
					
					s.setAge(age); s.setName(name); s.setAddr(addr);
					
					arr.add(s);
					System.out.println("��� �Ǿ����ϴ�");
					break;
				
			case 2:
				for(int i=0; i < arr.size(); i++) {
					StInfo2 ss= arr.get(i);
					System.out.println("�̸� : "+ss.getName());
					System.out.println("���� : "+ss.getAge());
					System.out.println("�ּ� : "+ss.getAddr());
					System.out.println("--------------------");
				}
				break;
				
			}
		}
	
	}
	

}
