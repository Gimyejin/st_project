package com.care.yejin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Hash {
	private HashMap<String, Member> map;
	private Scanner input = new Scanner(System.in);

	public Hash() {
		map = new HashMap<String, Member>();
	}

	public void hash() {
		int num;
		while (true) {
			System.out.println("1.학생등록 2.학생수정 3.탈퇴 4.개인정보보기 5.모두보기 6.종료");
			num = input.nextInt();

			switch (num) {
			case 1:
				put();
				break;
			case 2:
				change();
				break;
			case 3:
				del();
				break;
			case 4:
				pritnOne();
				break;
			case 5:
				printAll();
				break;
			case 6:
				System.out.println("학생관리를 종료합니다");
				return;
			}
		}
	}

	public void del() {
		String stId;
		System.out.println("아이디를 입력해주세요");
		stId = input.next();
		if (map.containsKey(stId)) {
			Member member = map.get(stId);
			System.out.print("비밀번호을 입력하세요 >  ");
			String pwd = input.next();
			System.out.println(member.getPw());
			if (member.getPw().equals(pwd)) {
				map.remove(stId);
				System.out.println("탈퇴가 완료되었습니다\n");
			}else
				System.out.println("비밀번호가 틀렸습니다.\n");
		}
	}

	public void change() {
		String stId;
		System.out.println("아이디를 입력해주세요");
		stId = input.next();
		if (map.containsKey(stId)) {
			Member member = map.get(stId);
			System.out.println(member.getName() + "님의 정보를 수정합니다.");
			System.out.println("1.비밀번호 변경 2.주소 변경 3.전화번호 변경");
			int num = input.nextInt();
			switch (num) {
			case 1:// 비번
				System.out.println("변경할 비밀 번호를 입력하시오.");
				String pwd = input.next();
				member.setPw(pwd);
				changePrint("비밀번호");
				break;
			case 2:
				System.out.println("변경할 주소를 입력하시오.");
				String address = input.next();
				member.setPw(address);
				changePrint("주소");
				break;
			case 3:
				System.out.println("변경할 전화 번호를 입력하시오.");
				String phone = input.next();
				member.setPhNum(phone);
				changePrint("전화번호");
				break;
			}
		}
	}

	public void pritnOne() {
		String stId;
		System.out.println("확안하고자 하는 아이디 입력");
		stId = input.next();
		if (map.containsKey(stId)) {
			// 해쉬맵 값의 타입은 member임
			Member member = map.get(stId);
			System.out.println("이름: " + member.getName());
			System.out.println("아이디: " + member.getId());
			System.out.println("비밀번호: " + member.getPw());
			System.out.println("주소: " + member.getAddr());
			System.out.println("전화번호: " + member.getPhNum());
			System.out.println();
		} else
			System.out.println("찾는 아이디가 없습니다.");
	}

	public void printAll() {
		if (map.size() == 0) {
			System.out.println("등록된 내용이 없습니다.\n");
		} else {
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext()) {// 다음 값이 잇으면 진행됨
				Member member = map.get(it.next());// it.next()는 key값을 갖고 있음
				System.out.println("이름: " + member.getName());
				System.out.println("아이디: " + member.getId());
				System.out.println("비밀번호: " + member.getPw());
				System.out.println("주소: " + member.getAddr());
				System.out.println("전화번호: " + member.getPhNum());
				System.out.println("-------------------------------------");
			}
		}
	}

	public void put() {
		Member member = new Member();
		String name, id, pw, addr, phNum;

		System.out.print("이름 > ");
		name = input.next();
		if (map.size() != 0) {
			while (true) {
				System.out.print("아이디 > ");
				id = input.next();
				// 동일한 키가 있으면 반복
				if (map.containsKey(id)) {
					System.out.println("동일한 아이디가 있습니다.");
					continue;
				}
				break;
			}
		} else {
			System.out.print("아이디 > ");
			id = input.next();
		}
		System.out.print("비밀번호 > ");
		pw = input.next();
		System.out.print("주소 > ");
		addr = input.next();
		System.out.print("전화번호 > ");
		phNum = input.next();

		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setAddr(addr);
		member.setPhNum(phNum);
		// id를 key로 삼아 member내용을 저장.
		map.put(id, member);
	}

	public void changePrint(String name) {

		System.out.println(name + "이(가) 변경되었습니다");

	}
}
