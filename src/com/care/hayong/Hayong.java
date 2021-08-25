package com.care.hayong;

import java.util.ArrayList;
import java.util.Scanner;


public class Hayong {
	String name, id, pw, addr, phNum;
	Scanner scan = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<String>();
	Info in = new Info();
	
	public void view() {
		System.out.println(in.getName()+"님의 마이페이지입니다");
		System.out.println("1.정보입력 2.정보수정 3.정보삭제 4.정보확인");
		int x= scan.nextInt();
		switch(x) {
		case 1:
			System.out.println("아이디 입력: ");
			if(in.getId()!=null) {System.out.println("이미 등록함"); 
			break;
			}
			id = scan.next(); in.setId(id);
			System.out.println("비번 입력: ");
			pw = scan.next(); arr.add(0, pw);
			System.out.println("주소 입력: ");
			addr = scan.next(); arr.add(1, addr);
			System.out.println("번호 입력: ");
			phNum = scan.next(); arr.add(2, phNum);
			System.out.println("입력 완료"); break;	
		case 2:
			System.out.println("아이디 입력: ");
			id = scan.next();
			if(in.getId().equals(id)) {
				System.out.println("비번 입력: ");
				pw = scan.next(); arr.add(0, pw);
				System.out.println("주소 입력: ");
				addr = scan.next(); arr.add(1, addr);
				System.out.println("번호 입력: ");
				phNum = scan.next(); arr.add(2, phNum);
				System.out.println("입력 완료"); break;	
			} else {
				System.out.println("아이디가 없습니다");
			}	break;	
		case 3:
			System.out.println("아이디 입력:");
			id = scan.next();
			System.out.println("비번 입력: ");
			pw = scan.next();
			if(in.getId().equals(id)&&arr.get(0).equals(pw)) {
				in.setId(null); arr.clear();
			}
		case 4:
			System.out.println("아이디 입력:");
			id = scan.next();
			System.out.println("비번 입력: ");
			pw = scan.next();
			if(in.getId().equals(id)&&arr.get(0).equals(pw)) {
				for(int i=0;i<arr.size();i++) {
					Info io = new Info();
				}
				
				
			}
		}
	}
}
