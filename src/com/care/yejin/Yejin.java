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
	ArrayList<Member> list;

	public void display() {
		System.out.println("1.ArrayList\t2.HashMap");
		num = input.nextInt();
		switch (num) {
		case 1:
			array();
			break;
		case 2:
			Hash gohashmap = new Hash();
			break;
		}
	}

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	Member member = new Member();
	int num;
	String name, id, pw, addr, phNum = "";

	public Yejin() {
		list = new ArrayList<Member>();
	}

	public void array() {
		Member member = new Member();
		while (true) {
			System.out.println("1.학생등록 2.학생수정 3.탈퇴 4.개인정보보기 5.모두보기 6.종료");
			num = input.nextInt();

			switch (num) {
			case 1:
				register();// 등록메소드
				break;
			case 2:// 회원정보 수정
				System.out.println("아이디를 입력해주세요");
				String shearchId = input.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getId().equals(shearchId)) {
						System.out.println(list.get(i).getName() + "님의 정보를 수정합니다.");
						System.out.println("1.비밀번호 변경 2.주소 변경 3.전화번호 변경");
						num = input.nextInt();
						switch (num) {//
						case 1:// 비번
							System.out.println("변경할 비밀 번호를 입력하시오.");
							String pwd = input.next();
							list.get(i).setPw(pwd);
							changePrint("비밀번호");
							break;
						case 2:
							System.out.println("변경할 주소를 입력하시오.");
							String address = input.next();
							list.get(i).setPw(address);
							changePrint("주소");
							break;
						case 3:
							System.out.println("변경할 전화 번호를 입력하시오.");
							String phone = input.next();
							list.get(i).setPw(phone);
							changePrint("전화번호");
							break;
						}
					}
				}

				break;
			case 3:// 3.회원탈퇴
				int check =serachId();
				if (check != -1) {
					System.out.print("비밀번호을 입력하세요 >  ");
					String pwd = input.next();
					if (list.get(check).getPw().equals(pwd)) {
						list.remove(check);
						System.out.println("탈퇴가 완료되었습니다\n");
					} else
						System.out.println("비밀번호가 틀렸습니다.\n");
				}
				break;
			case 4: // 1인 정보
				memberView();
				break;
			case 5:// 5.모든정보보기

				if (list.isEmpty())
					System.out.println("등록된 내용이 없습니다.\n");
				else {
					allList();
				}
				break;
			case 6:
				System.out.println("학생관리를 종료합니다");
				return;
			}

		}

	}

	public int serachId() {
		System.out.print("아이디를 입력해주세요 > ");
		String findId = input.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(findId)) {
				return i;
			}
		}
		System.out.println("없는 아이디입니다.");
		return -1;
	}

	public void memberView() {
		String stId;
		System.out.println("확안하고자 하는 아이디 입력");
		stId = input.next();
		int i;
		for (i = 0; i < list.size(); i++) {
			if (stId.endsWith(list.get(i).getId())) {
				System.out.println("이름: " + list.get(i).getName());
				System.out.println("아이디: " + list.get(i).getId());
				System.out.println("비밀번호: " + list.get(i).getPw());
				System.out.println("주소: " + list.get(i).getAddr());
				System.out.println("전화번호: " + list.get(i).getPhNum());
				System.out.println("-------------------------------------");
				break;
			}
		}
		if (i == list.size())
			System.out.println("찾는 아이디가 없습니다.");
	}

	public void register() {
		System.out.print("이름 > ");
		name = input.next();
		while (true) {
			System.out.print("아이디 > ");
			id = input.next();
			if (list.size() != 0) {
				int i;
				for (i = 0; i < list.size(); i++) {
					if (list.get(i).getId().equals(id)) {
						System.out.println("이미 존재하는 아이디입니다.");
						break;
					}
				}
				// 동일한 아이디가 없다면 i는
				if (i != list.size()) {// 아이디가 존재할경우 다시 입력받게 하자
					continue;// 다시 반복됨
				}
			}
			break;
		}
		System.out.print("비밀번호 > ");
		pw = input.next();
		System.out.print("주소 > ");
		addr = input.next();
		System.out.print("전화번호 > ");
		phNum = input.next();

		Member member = new Member();
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setAddr(addr);
		member.setPhNum(phNum);
		list.add(member);// member변수의 주소가 list에 담김
		System.out.println("저장완료");
	}

	public void allList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("이름: " + list.get(i).getName());
			System.out.println("아이디: " + list.get(i).getId());
			System.out.println("비밀번호: " + list.get(i).getPw());
			System.out.println("주소: " + list.get(i).getAddr());
			System.out.println("전화번호: " + list.get(i).getPhNum());
			System.out.println("-------------------------------------");
		}
	}

	public void changePrint(String name) {

		System.out.println(name + "이(가) 변경되었습니다");

	}

}
