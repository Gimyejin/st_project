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
			System.out.println("1.학생등록 2.등록확인");
			num = sc.nextInt();
			switch(num) {
			case 1: System.out.println("등록");
					register();
					break;
			case 2: System.out.println("등록확인");
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
				System.out.println("이름: "+ss.getName());
				System.out.println("나이: "+ss.getAge());
				System.out.println("주소: "+ss.getAddr());
				System.out.println("---------------------");
			}
		}
		else
			System.out.println("저장 데이터 없음");
	}
	public void register() {
		StInfo2HashMapDTO s =new StInfo2HashMapDTO();
		String name, addr;
		int age;
		
		if(map.size() != 0) {
			while(true) {
				System.out.println("이름입력");
				name = sc.next();
				if(map.containsKey(name)) {
					System.out.println("이미 등록된 이름입니다");
					continue;
				}
				break;
			}
		}else {
			System.out.println("이름입력");
			name = sc.next();
			System.out.println("나이입력");
			age = sc.nextInt();
			System.out.println("주소입력");
			addr = sc.next();
			
			s.setAddr(addr); s.setName(name); s.setAge(age);
			map.put(name, s);
			
			System.out.println("저장완료");
		}
		
	}

}
