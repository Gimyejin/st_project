package com.care.yejin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Yejin {
	/*
	 * 1. ȸ����� -> id, name, addr, phNum, 2. ȸ���������� -> ���� 3. ȸ�� Ż�� -> ���̵� ��й�ȣ �Է��� Ż��
	 * �˴ϴ�. 4. ��� ȸ�� ��������
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
			System.out.println("1.�л���� 2.�л����� 3.Ż�� 4.������������ 5.��κ��� 6.����");
			num = input.nextInt();

			switch (num) {
			case 1:
				register();// ��ϸ޼ҵ�
				break;
			case 2:// ȸ������ ����
				System.out.println("���̵� �Է����ּ���");
				String shearchId = input.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getId().equals(shearchId)) {
						System.out.println(list.get(i).getName() + "���� ������ �����մϴ�.");
						System.out.println("1.��й�ȣ ���� 2.�ּ� ���� 3.��ȭ��ȣ ����");
						num = input.nextInt();
						switch (num) {//
						case 1:// ���
							System.out.println("������ ��� ��ȣ�� �Է��Ͻÿ�.");
							String pwd = input.next();
							list.get(i).setPw(pwd);
							changePrint("��й�ȣ");
							break;
						case 2:
							System.out.println("������ �ּҸ� �Է��Ͻÿ�.");
							String address = input.next();
							list.get(i).setPw(address);
							changePrint("�ּ�");
							break;
						case 3:
							System.out.println("������ ��ȭ ��ȣ�� �Է��Ͻÿ�.");
							String phone = input.next();
							list.get(i).setPw(phone);
							changePrint("��ȭ��ȣ");
							break;
						}
					}
				}

				break;
			case 3:// 3.ȸ��Ż��
				int check =serachId();
				if (check != -1) {
					System.out.print("��й�ȣ�� �Է��ϼ��� >  ");
					String pwd = input.next();
					if (list.get(check).getPw().equals(pwd)) {
						list.remove(check);
						System.out.println("Ż�� �Ϸ�Ǿ����ϴ�\n");
					} else
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
				}
				break;
			case 4: // 1�� ����
				memberView();
				break;
			case 5:// 5.�����������

				if (list.isEmpty())
					System.out.println("��ϵ� ������ �����ϴ�.\n");
				else {
					allList();
				}
				break;
			case 6:
				System.out.println("�л������� �����մϴ�");
				return;
			}

		}

	}

	public int serachId() {
		System.out.print("���̵� �Է����ּ��� > ");
		String findId = input.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(findId)) {
				return i;
			}
		}
		System.out.println("���� ���̵��Դϴ�.");
		return -1;
	}

	public void memberView() {
		String stId;
		System.out.println("Ȯ���ϰ��� �ϴ� ���̵� �Է�");
		stId = input.next();
		int i;
		for (i = 0; i < list.size(); i++) {
			if (stId.endsWith(list.get(i).getId())) {
				System.out.println("�̸�: " + list.get(i).getName());
				System.out.println("���̵�: " + list.get(i).getId());
				System.out.println("��й�ȣ: " + list.get(i).getPw());
				System.out.println("�ּ�: " + list.get(i).getAddr());
				System.out.println("��ȭ��ȣ: " + list.get(i).getPhNum());
				System.out.println("-------------------------------------");
				break;
			}
		}
		if (i == list.size())
			System.out.println("ã�� ���̵� �����ϴ�.");
	}

	public void register() {
		System.out.print("�̸� > ");
		name = input.next();
		while (true) {
			System.out.print("���̵� > ");
			id = input.next();
			if (list.size() != 0) {
				int i;
				for (i = 0; i < list.size(); i++) {
					if (list.get(i).getId().equals(id)) {
						System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
						break;
					}
				}
				// ������ ���̵� ���ٸ� i��
				if (i != list.size()) {// ���̵� �����Ұ�� �ٽ� �Է¹ް� ����
					continue;// �ٽ� �ݺ���
				}
			}
			break;
		}
		System.out.print("��й�ȣ > ");
		pw = input.next();
		System.out.print("�ּ� > ");
		addr = input.next();
		System.out.print("��ȭ��ȣ > ");
		phNum = input.next();

		Member member = new Member();
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setAddr(addr);
		member.setPhNum(phNum);
		list.add(member);// member������ �ּҰ� list�� ���
		System.out.println("����Ϸ�");
	}

	public void allList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("�̸�: " + list.get(i).getName());
			System.out.println("���̵�: " + list.get(i).getId());
			System.out.println("��й�ȣ: " + list.get(i).getPw());
			System.out.println("�ּ�: " + list.get(i).getAddr());
			System.out.println("��ȭ��ȣ: " + list.get(i).getPhNum());
			System.out.println("-------------------------------------");
		}
	}

	public void changePrint(String name) {

		System.out.println(name + "��(��) ����Ǿ����ϴ�");

	}

}
