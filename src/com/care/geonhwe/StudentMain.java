package com.care.geonhwe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stu = new ArrayList<Student>();
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		String name, gender, addr;
		int age;
		
		while(true) {
			System.out.println("1.ȸ������ �Է� 2.ȸ������ Ȯ�� 3.ȸ������ ����");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				Student st = new Student();
				System.out.println("�̸� �Է�");
				name = sc.next();
				System.out.println("���� �Է�");
				gender = sc.next();
				System.out.println("���� �Է�");
				age = sc.nextInt();
				System.out.println("�ּ� �Է�");
				addr = sc.next();
				
				st.setName(name); st.setGender(gender);
				st.setAge(age); st.setAddr(addr);
				
				stu.add(st);				
				System.out.println("��ϵǾ����ϴ�.");
				break;
			case 2:
				for(int i=0; i<stu.size(); i++) {
					Student s = stu.get(i);
					System.out.println(" ȸ������ Ȯ�ζ� ");
					System.out.println("�̸� : "+s.getName());
					System.out.println("���� : "+s.getGender());
					System.out.println("���� : "+s.getAge());
					System.out.println("�ּ� : "+s.getAddr());
					System.out.println("---------------------");
					break; }
			}
		}
	}
}



