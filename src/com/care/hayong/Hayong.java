package com.care.hayong;

import java.util.ArrayList;
import java.util.Scanner;


public class Hayong {
	String name, id, pw, addr, phNum;
	Scanner scan = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<String>();
	Info in = new Info();
	
	public void view() {
		System.out.println(in.getName()+"���� �����������Դϴ�");
		System.out.println("1.�����Է� 2.�������� 3.�������� 4.����Ȯ��");
		int x= scan.nextInt();
		switch(x) {
		case 1:
			System.out.println("���̵� �Է�: ");
			if(in.getId()!=null) {System.out.println("�̹� �����"); 
			break;
			}
			id = scan.next(); in.setId(id);
			System.out.println("��� �Է�: ");
			pw = scan.next(); arr.add(0, pw);
			System.out.println("�ּ� �Է�: ");
			addr = scan.next(); arr.add(1, addr);
			System.out.println("��ȣ �Է�: ");
			phNum = scan.next(); arr.add(2, phNum);
			System.out.println("�Է� �Ϸ�"); break;	
		case 2:
			System.out.println("���̵� �Է�: ");
			id = scan.next();
			if(in.getId().equals(id)) {
				System.out.println("��� �Է�: ");
				pw = scan.next(); arr.add(0, pw);
				System.out.println("�ּ� �Է�: ");
				addr = scan.next(); arr.add(1, addr);
				System.out.println("��ȣ �Է�: ");
				phNum = scan.next(); arr.add(2, phNum);
				System.out.println("�Է� �Ϸ�"); break;	
			} else {
				System.out.println("���̵� �����ϴ�");
			}	break;	
		case 3:
			System.out.println("���̵� �Է�:");
			id = scan.next();
			System.out.println("��� �Է�: ");
			pw = scan.next();
			if(in.getId().equals(id)&&arr.get(0).equals(pw)) {
				in.setId(null); arr.clear();
			}
		case 4:
			System.out.println("���̵� �Է�:");
			id = scan.next();
			System.out.println("��� �Է�: ");
			pw = scan.next();
			if(in.getId().equals(id)&&arr.get(0).equals(pw)) {
				for(int i=0;i<arr.size();i++) {
					Info io = new Info();
				}
				
				
			}
		}
	}
}
