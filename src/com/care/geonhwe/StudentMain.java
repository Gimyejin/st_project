package com.care.geonhwe;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

class hash {
	int age = 0;
	String name, gender, addr;
	public hash(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.addr = addr;
	}
	String set() {
		return name+"|"+addr;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stu = new ArrayList<Student>();
		HashMap<hash,String> map = new HashMap<hash,String>();
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
			case 3:
				for(int j=1; j<6; j++) {
					System.out.println(j+"��° �л��̸�|����|����|�ּ�");
					name = sc.next();
					gender = sc.next();
					age = sc.nextInt();
					addr = sc.next();
					
				map.put(new hash(age, gender, addr), name);
				}
				System.out.println("ã�� ���� �л��� �̸��� �Է�");
				Scanner sc2 = new Scanner(System.in);
				String getName = sc2.next();
				String has = map.get(getName);
				
				System.out.println(getName + "���� ����");
			}
				
			}
		}
	}




