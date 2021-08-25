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
			System.out.println("1.�л���� 2.�л����� 3.Ż�� 4.������������ 5.��κ��� 6.����");
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
				System.out.println("�л������� �����մϴ�");
				return;
			}
		}
	}

	public void del() {
		String stId;
		System.out.println("���̵� �Է����ּ���");
		stId = input.next();
		if (map.containsKey(stId)) {
			Member member = map.get(stId);
			System.out.print("��й�ȣ�� �Է��ϼ��� >  ");
			String pwd = input.next();
			System.out.println(member.getPw());
			if (member.getPw().equals(pwd)) {
				map.remove(stId);
				System.out.println("Ż�� �Ϸ�Ǿ����ϴ�\n");
			}else
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
		}
	}

	public void change() {
		String stId;
		System.out.println("���̵� �Է����ּ���");
		stId = input.next();
		if (map.containsKey(stId)) {
			Member member = map.get(stId);
			System.out.println(member.getName() + "���� ������ �����մϴ�.");
			System.out.println("1.��й�ȣ ���� 2.�ּ� ���� 3.��ȭ��ȣ ����");
			int num = input.nextInt();
			switch (num) {
			case 1:// ���
				System.out.println("������ ��� ��ȣ�� �Է��Ͻÿ�.");
				String pwd = input.next();
				member.setPw(pwd);
				changePrint("��й�ȣ");
				break;
			case 2:
				System.out.println("������ �ּҸ� �Է��Ͻÿ�.");
				String address = input.next();
				member.setPw(address);
				changePrint("�ּ�");
				break;
			case 3:
				System.out.println("������ ��ȭ ��ȣ�� �Է��Ͻÿ�.");
				String phone = input.next();
				member.setPhNum(phone);
				changePrint("��ȭ��ȣ");
				break;
			}
		}
	}

	public void pritnOne() {
		String stId;
		System.out.println("Ȯ���ϰ��� �ϴ� ���̵� �Է�");
		stId = input.next();
		if (map.containsKey(stId)) {
			// �ؽ��� ���� Ÿ���� member��
			Member member = map.get(stId);
			System.out.println("�̸�: " + member.getName());
			System.out.println("���̵�: " + member.getId());
			System.out.println("��й�ȣ: " + member.getPw());
			System.out.println("�ּ�: " + member.getAddr());
			System.out.println("��ȭ��ȣ: " + member.getPhNum());
			System.out.println();
		} else
			System.out.println("ã�� ���̵� �����ϴ�.");
	}

	public void printAll() {
		if (map.size() == 0) {
			System.out.println("��ϵ� ������ �����ϴ�.\n");
		} else {
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext()) {// ���� ���� ������ �����
				Member member = map.get(it.next());// it.next()�� key���� ���� ����
				System.out.println("�̸�: " + member.getName());
				System.out.println("���̵�: " + member.getId());
				System.out.println("��й�ȣ: " + member.getPw());
				System.out.println("�ּ�: " + member.getAddr());
				System.out.println("��ȭ��ȣ: " + member.getPhNum());
				System.out.println("-------------------------------------");
			}
		}
	}

	public void put() {
		Member member = new Member();
		String name, id, pw, addr, phNum;

		System.out.print("�̸� > ");
		name = input.next();
		if (map.size() != 0) {
			while (true) {
				System.out.print("���̵� > ");
				id = input.next();
				// ������ Ű�� ������ �ݺ�
				if (map.containsKey(id)) {
					System.out.println("������ ���̵� �ֽ��ϴ�.");
					continue;
				}
				break;
			}
		} else {
			System.out.print("���̵� > ");
			id = input.next();
		}
		System.out.print("��й�ȣ > ");
		pw = input.next();
		System.out.print("�ּ� > ");
		addr = input.next();
		System.out.print("��ȭ��ȣ > ");
		phNum = input.next();

		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setAddr(addr);
		member.setPhNum(phNum);
		// id�� key�� ��� member������ ����.
		map.put(id, member);
	}

	public void changePrint(String name) {

		System.out.println(name + "��(��) ����Ǿ����ϴ�");

	}
}
