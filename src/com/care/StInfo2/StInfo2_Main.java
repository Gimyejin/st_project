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
			System.out.println("1.학생등록 2.등록확인");
			int num = input.nextInt();
			switch(num) {
			case 1: 
				StInfo2 s = new StInfo2();
				if(arr.size()!=0) {
					while(true) {
						System.out.println("이름 입력");
						name = input.next();
						if(arr.contains(name)) {
							System.out.println("이미 등록된 이름입니다");
							continue;	
						}
						break;
					}
				}else {
					System.out.println("이름 입력");
					name = input.next();
				}
					System.out.println("나이 입력");
					age = input.nextInt();
					System.out.println("주소 입력");
					addr = input.next();
					
					s.setAge(age); s.setName(name); s.setAddr(addr);
					
					arr.add(s);
					System.out.println("등록 되었습니다");
					break;
				
			case 2:
				for(int i=0; i < arr.size(); i++) {
					StInfo2 ss= arr.get(i);
					System.out.println("이름 : "+ss.getName());
					System.out.println("나이 : "+ss.getAge());
					System.out.println("주소 : "+ss.getAddr());
					System.out.println("--------------------");
				}
				break;
				
			}
		}
	
	}
	

}
