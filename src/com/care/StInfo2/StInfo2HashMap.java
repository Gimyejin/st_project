package com.care.StInfo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StInfo2HashMap {
	private HashMap<String, StInfo2HashMapDTO> map;
	private Scanner sc;
	public StInfo2HashMap() {
		sc = new Scanner(System.in);
		map = new HashMap<String, StInfo2HashMapDTO>();
	}
	public void mapDisplay() {
		int num;
		while(true) {
			System.out.println("1.�л���� 2.���Ȯ��");
			num = sc.nextInt();
			switch(num) {
			case 1: System.out.println("���");
					register();
					break;
			case 2: System.out.println("���Ȯ��");
					members();
					break;
			
			}
		}
	}
	public void members() {
		if(map.size() != 0) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				StInfo2HashMapDTO ss = map.get(it.next());
				System.out.println("�̸�: "+ss.getName());
				System.out.println("����: "+ss.getAge());
				System.out.println("�ּ�: "+ss.getAddr());
				System.out.println("---------------------");
			}
		}
		else
			System.out.println("���� ������ ����");
	}
	public void register() {
		StInfo2HashMapDTO s =new StInfo2HashMapDTO();
		String name, addr;
		int age;
		
		if(map.size() != 0) {
			while(true) {
				System.out.println("�̸��Է�");
				name = sc.next();
				if(map.containsKey(name)) {
					System.out.println("�̹� ��ϵ� �̸��Դϴ�");
					continue;
				}
				break;
			}
		}else {
			System.out.println("�̸��Է�");
			name = sc.next();
			System.out.println("�����Է�");
			age = sc.nextInt();
			System.out.println("�ּ��Է�");
			addr = sc.next();
			
			s.setAddr(addr); s.setName(name); s.setAge(age);
			map.put(name, s);
			
			System.out.println("����Ϸ�");
		}
		
	}

}
