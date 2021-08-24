package com.care.yejin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Yejin {
	/*
	 * 1. 회원등록 -> id, name, addr, phNum, 2. 회원정보보기 -> 수정 3. 회원 탈퇴 -> 아이디 비밀번호 입력후 탈퇴
	 * 됩니다. 4. 모든 회원 정보보기
	 */
	Scanner input = new Scanner(System.in);
	ArrayList<Member> list = new ArrayList<Member>();
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	Member member = new Member();
	int num;
	String name, id, pw, addr, phNum = "";

	public Yejin() {
		System.out.println("1.ArrayList\t2.HashMap");
		num = input.nextInt();
		switch (num) {
		case 1:
			array();
			break;
		case 2:
			hash();
			break;
		}
	}

	public void array() {
		Member member = new Member();
		while (true) {
			System.out.println("1.회원등록 2.회원수정 3.회원탈퇴 4.모든정보보기");
			num = input.nextInt();

			switch (num) {
			case 1:
				if (list.isEmpty()) {
					System.out.println("[회 원 가 입]");

					/*
					 * System.out.print("이름 > "); name = input.next();
					 */
					System.out.print("아이디 > ");
					id = input.next();
					System.out.print("비밀번호 > ");
					pw = input.next();
					System.out.print("주소 > ");
					addr = input.next();
					System.out.print("전화번호 > ");
					phNum = input.next();

					member.setName("김예진");
					member.setId(id);
					member.setPw(pw);
					member.setAddr(addr);
					member.setPhNum(phNum);

					list.add(member);

				} else {
					if (member.getId().equals(id)) {
						System.out.println("사용할 수 없는 아이디입니다.");
					}
				}

				break;
			case 2:// 회원정보 수정
				System.out.println(member.getName()+ "님의 정보를 수정합니다.");
				System.out.println("1.비밀번호 변경 2.주소 변경 3.전화번호 변경");
				num = input.nextInt();
				switch (num) {//
				case 1:// 비번
					System.out.println("변경할 비밀 번호를 입력하시오.");
					String pwd = input.next();
					member.setPw(pwd);
					changePrint("비밀번호");
					break;
				case 2:
					System.out.println("변경할 주소를 입력하시오.");
					String address = input.next();
					member.setAddr(address);
					changePrint("주소");
					break;
				case 3:
					System.out.println("변경할 전화 번호를 입력하시오.");
					String phone = input.next();
					member.setPhNum(phone);
					changePrint("전화번호");
					break;
				}
				break;
			case 3:// 3.회원탈퇴
				System.out.print("비밀번호: ");
				String pwd = input.next();
				if (member.getPw().equals(pwd)) {
					list.clear();
					System.out.println("탈퇴가 완료되었습니다\n");
				}else System.out.println("비밀번호가 틀렸습니다.\n");
				break;
			case 4:// 4.모든정보보기
				if (list.isEmpty())
					System.out.println("등록된 내용이 없습니다.\n");
				else {
					for (int i = 0; i < list.size(); i++) {
						Member mem = list.get(i);
						System.out.println("이름: " + mem.getName());
						System.out.println("아이디: " + mem.getId());
						System.out.println("비밀번호: " + mem.getPw());
						System.out.println("주소: " + mem.getAddr());
						System.out.println("전화번호: " + mem.getPhNum());
						System.out.println();
					}
				}
				break;
			}

		}

	}
//==========================================================================//
	public void hash() {
		Member member = new Member();
		while (true) {
			System.out.println("1.회원등록 2.회원수정 3.회원탈퇴 4.모든정보보기");
			num = input.nextInt();

			switch (num) {
			case 1:
				if (list.isEmpty()) {
					System.out.println("[회 원 가 입]");

					/*
					 * System.out.print("이름 > "); name = input.next();
					 */
					System.out.print("아이디 > ");
					id = input.next();
					System.out.print("비밀번호 > ");
					pw = input.next();
					System.out.print("주소 > ");
					addr = input.next();
					System.out.print("전화번호 > ");
					phNum = input.next();

					member.setName("김예진"); 	map.put(0, "김예진");
					member.setId(id);			map.put(1, id);
					member.setPw(pw);			map.put(2, pw);
					member.setAddr(addr);		map.put(3, addr);
					member.setPhNum(phNum);		map.put(4, phNum);
				} else {
						if (member.getId().equals(id)) {
						System.out.println("사용할 수 없는 아이디입니다.");
						}
					}break;
			case 2:// 회원정보 수정
				System.out.println(member.getName() + "님의 정보를 수정합니다.");
				System.out.println("1.비밀번호 변경 2.주소 변경 3.전화번호 변경");
				num = input.nextInt();
				switch (num) {//
				case 1:// 비번
					System.out.println("변경할 비밀 번호를 입력하시오.");
					String pwd = input.next();
					map.put(2,pwd);
					changePrint("비밀번호");
					break;
				case 2:
					System.out.println("변경할 주소를 입력하시오.");
					String address = input.next();
					map.put(3,address);
					changePrint("주소");
					break;
				case 3:
					System.out.println("변경할 전화 번호를 입력하시오.");
					String phone = input.next();
					map.put(4,phone);
					changePrint("전화번호");
					break;
				}
				break;
			case 3:// 3.회원탈퇴
				System.out.print("비밀번호: ");
				String pwd = input.next();
				if (member.getPw().equals(pwd)) {
					map.clear();
					System.out.println("탈퇴가 완료되었습니다\n");
				}else System.out.println("비밀번호가 틀렸습니다.\n");
				break;
			case 4:// 4.모든정보보기
				if (map.isEmpty())
					System.out.println("등록된 내용이 없습니다.\n");
				else {
				
						
						System.out.println("이름: " + map.get(0));
						System.out.println("아이디: " + map.get(1));
						System.out.println("비밀번호: " + map.get(2));
						System.out.println("주소: " + map.get(3));
						System.out.println("전화번호: " +map.get(4));
						System.out.println();
					
				}
				break;
				}
			}
		}
	public void changePrint(String name) {
		System.out.println(name + "이(가) 변경되었습니다");

	}

}
