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
			System.out.println("1.회원정보 입력 2.회원정보 확인 3.회원정보 수정");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				Student st = new Student();
				System.out.println("이름 입력");
				name = sc.next();
				System.out.println("성별 입력");
				gender = sc.next();
				System.out.println("나이 입력");
				age = sc.nextInt();
				System.out.println("주소 입력");
				addr = sc.next();
				
				st.setName(name); st.setGender(gender);
				st.setAge(age); st.setAddr(addr);
				
				stu.add(st);				
				System.out.println("등록되었습니다.");
				break;
			case 2:
				for(int i=0; i<stu.size(); i++) {
					Student s = stu.get(i);
					System.out.println(" 회원정보 확인란 ");
					System.out.println("이름 : "+s.getName());
					System.out.println("성별 : "+s.getGender());
					System.out.println("나이 : "+s.getAge());
					System.out.println("주소 : "+s.getAddr());
					System.out.println("---------------------");
					break; }
			}
		}
	}
}



