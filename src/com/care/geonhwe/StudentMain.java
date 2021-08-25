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
			case 3:
				for(int j=1; j<6; j++) {
					System.out.println(j+"번째 학생이름|성별|나이|주소");
					name = sc.next();
					gender = sc.next();
					age = sc.nextInt();
					addr = sc.next();
					
				map.put(new hash(age, gender, addr), name);
				}
				System.out.println("찾고 싶은 학생의 이름을 입력");
				Scanner sc2 = new Scanner(System.in);
				String getName = sc2.next();
				String has = map.get(getName);
				
				System.out.println(getName + "님의 정보");
			}
				
			}
		}
	}




