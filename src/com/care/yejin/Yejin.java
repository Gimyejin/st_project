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
			hash();
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
			System.out.println("1.�л���� 2.�л����� 3.Ż�� 4.���������� 5.��κ��� 6.����");
			num = input.nextInt();

			switch (num) {
			case 1:
				register();// ��ϸ޼ҵ�
				break;
			case 2:// ȸ������ ����
				System.out.println(member.getName() + "���� ������ �����մϴ�.");
				System.out.println("1.��й�ȣ ���� 2.�ּ� ���� 3.��ȭ��ȣ ����");
				num = input.nextInt();
				switch (num) {//
				case 1:// ���
					System.out.println("������ ��� ��ȣ�� �Է��Ͻÿ�.");
					String pwd = input.next();
					member.setPw(pwd);
					changePrint("��й�ȣ");
					break;
				case 2:
					System.out.println("������ �ּҸ� �Է��Ͻÿ�.");
					String address = input.next();
					member.setAddr(address);
					changePrint("�ּ�");
					break;
				case 3:
					System.out.println("������ ��ȭ ��ȣ�� �Է��Ͻÿ�.");
					String phone = input.next();
					member.setPhNum(phone);
					changePrint("��ȭ��ȣ");
					break;
				}
				break;
			case 3:// 3.ȸ��Ż��
				System.out.print("��й�ȣ: ");
				String pwd = input.next();
				if (member.getPw().equals(pwd)) {
					list.clear();
					System.out.println("Ż�� �Ϸ�Ǿ����ϴ�\n");
				} else
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
				break;
			case 4: // 1�� ����
				break;
			case 5:// 5.�����������
				if (list.isEmpty())
					System.out.println("��ϵ� ������ �����ϴ�.\n");
				else {
					for (int i = 0; i < list.size(); i++) {
						Member mem = list.get(i);
						System.out.println("�̸�: " + mem.getName());
						System.out.println("���̵�: " + mem.getId());
						System.out.println("��й�ȣ: " + mem.getPw());
						System.out.println("�ּ�: " + mem.getAddr());
						System.out.println("��ȭ��ȣ: " + mem.getPhNum());
						System.out.println();
					}
				}
				break;
			case 6:
				System.out.println("�л������� �����մϴ�");
				return;
			}

		}

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
				//������ ���̵� ���ٸ� i�� 
				if(i !=list.size()) {//���̵� �����Ұ�� �ٽ� �Է¹ް� ����
					continue;//�ٽ� �ݺ���
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

//==========================================================================//
	public void hash() {
		Member member = new Member();
		while (true) {
			System.out.println("1.ȸ����� 2.ȸ������ 3.ȸ��Ż�� 4.�����������");
			num = input.nextInt();

			switch (num) {
			case 1:
				if (list.isEmpty()) {
					System.out.println("[ȸ �� �� ��]");

					/*
					 * System.out.print("�̸� > "); name = input.next();
					 */
					System.out.print("���̵� > ");
					id = input.next();
					System.out.print("��й�ȣ > ");
					pw = input.next();
					System.out.print("�ּ� > ");
					addr = input.next();
					System.out.print("��ȭ��ȣ > ");
					phNum = input.next();

					member.setName("�迹��");
					map.put(0, "�迹��");
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
						System.out.println("����� �� ���� ���̵��Դϴ�.");
					}
				}
				break;
			case 2:// ȸ������ ����
				System.out.println(member.getName() + "���� ������ �����մϴ�.");
				System.out.println("1.��й�ȣ ���� 2.�ּ� ���� 3.��ȭ��ȣ ����");
				num = input.nextInt();
				switch (num) {//
				case 1:// ���
					System.out.println("������ ��� ��ȣ�� �Է��Ͻÿ�.");
					String pwd = input.next();
					map.put(2, pwd);
					changePrint("��й�ȣ");
					break;
				case 2:
					System.out.println("������ �ּҸ� �Է��Ͻÿ�.");
					String address = input.next();
					map.put(3, address);
					changePrint("�ּ�");
					break;
				case 3:
					System.out.println("������ ��ȭ ��ȣ�� �Է��Ͻÿ�.");
					String phone = input.next();
					map.put(4, phone);
					changePrint("��ȭ��ȣ");
					break;
				}
				break;
			case 3:// 3.ȸ��Ż��
				System.out.print("��й�ȣ: ");
				String pwd = input.next();
				if (member.getPw().equals(pwd)) {
					map.clear();
					System.out.println("Ż�� �Ϸ�Ǿ����ϴ�\n");
				} else
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
				break;
			case 4:// 4.�����������
				if (map.isEmpty())
					System.out.println("��ϵ� ������ �����ϴ�.\n");
				else {

					System.out.println("�̸�: " + map.get(0));
					System.out.println("���̵�: " + map.get(1));
					System.out.println("��й�ȣ: " + map.get(2));
					System.out.println("�ּ�: " + map.get(3));
					System.out.println("��ȭ��ȣ: " + map.get(4));
					System.out.println();

				}
				break;
			}
		}
	}

	public void changePrint(String name) {
		System.out.println(name + "��(��) ����Ǿ����ϴ�");

	}

}
