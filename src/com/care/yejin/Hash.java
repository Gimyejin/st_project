package com.care.yejin;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {
	Scanner input = new Scanner(System.in);
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	Member member = new Member();
	int num;
	String name, id, pw, addr, phNum = "";

	public void hash() {
		Member member = new Member();
		while (true) {
			System.out.println("1.학생등록 2.학생수정 3.탈퇴 4.개인정보보기 5.모두보기 6.종료");
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
					map.put(0, "김예진");
					member.setId(id);
					map.put(1, id);
					member.setPw(pw);
					map.put(2, pw);
					member.setAddr(addr);
					map.put(3, addr);
					member.setPhNum(phNum);
					map.put(4, phNum);
				} else {
					if (member.getId().equals(id)) {
						System.out.println("사용할 수 없는 아이디입니다.");
					}
				}
				break;
			case 2:// 회원정보 수정
				System.out.println(member.getName() + "님의 정보를 수정합니다.");
				System.out.println("1.비밀번호 변경 2.주소 변경 3.전화번호 변경");
				num = input.nextInt();
				switch (num) {//
				case 1:// 비번
					System.out.println("변경할 비밀 번호를 입력하시오.");
					String pwd = input.next();
					map.put(2, pwd);
					changePrint("비밀번호");
					break;
				case 2:
					System.out.println("변경할 주소를 입력하시오.");
					String address = input.next();
					map.put(3, address);
					changePrint("주소");
					break;
				case 3:
					System.out.println("변경할 전화 번호를 입력하시오.");
					String phone = input.next();
					map.put(4, phone);
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
				} else
					System.out.println("비밀번호가 틀렸습니다.\n");
				break;
			case 4: // 1인 정보
				memberView();
				break;
			case 5:// 4.모든정보보기
				if (map.isEmpty())
					System.out.println("등록된 내용이 없습니다.\n");
				else {

					System.out.println("이름: " + map.get(0));
					System.out.println("아이디: " + map.get(1));
					System.out.println("비밀번호: " + map.get(2));
					System.out.println("주소: " + map.get(3));
					System.out.println("전화번호: " + map.get(4));
					System.out.println();

				}
				break;
			case 6:
				System.out.println("학생관리를 종료합니다");
				return;
			}
		}
	}

	public void memberView() {
		
	}

	public void changePrint(String name) {
		System.out.println(name + "이(가) 변경되었습니다");

	}
}
