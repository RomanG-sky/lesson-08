package lgs.lviv.ua;

import java.util.Scanner;

public class App_Days {

	public static void main(String[] args) {

		Mons[] arraymis = Mons.values();
		Seasons[] arraysiz = Seasons.values();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("�������� 1 ��� ������ ����� : ");
			System.out.println("�������� 2 ��� ������ ���� ���� : ");
			System.out.println("�������� 3 ��� ������ ������� ��� : ");
			System.out.println("�������� 4 ��� ������ ������� ��� � ���������� ����� : ");
			System.out.println("�������� 5 ��� ������ ������� ��� � ���������� ����� : ");
			System.out.println("�������� 6 ��� ������ ���� ���� : ");
			System.out.println("�������� 7 ��� ������ ���� ���� : ");
			System.out.println("�������� 8 ��� ������� ����� � ������ ������� ��� : ");
			System.out.println("�������� 9 ��� ������� ����� � �� ������ ������� ��� : ");
			System.out.println("�������� 10 ��� ������ ����� : ");
			switch (scan.next()) {

			case "1": {
				System.out.println("������ ����� : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.name().equals(monssc)) {
						System.out.println("�������� ���� ����� ����");
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�������� ���� ����� �� ������ ����� �� �� ����");
				}
			}
				break;
			case "2": {
				System.out.println("������ ���� ���� : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getSeason().name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("������� ���� ���� ���� " + seasonsc + " �� ��� ����� : ");
					for (Mons m2 : arraymis) {
						if (m2.getSeason().name().toString().equalsIgnoreCase(seasonsc)) {
							System.out.println(m2);
						}
						if (!flag) {
							System.out.println("������� ���� ���� ���� �� ������ ����� �� �� ����");
						}
						break;

					}
				}
			}
			case "3": {
				System.out.println("������ ������� ��� � ����� : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("������� ������� ��� " + daysc + " �������� � ����� ������: ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() == daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					System.out.println("̳���� �� " + daysc + " ������� ��� �� ����");
				}
				break;
			}
			case "4": {
				System.out.println("������ ������� ��� � ����� : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("̳���� �� ������ ������� ��� : ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() < daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					System.out.println("̳���� �� ������ ������� ��� ��" + daysc + " �� ����");
				}
				break;
			}
			case "5": {
				System.out.println("������ ������� ��� � ����� : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("̳���� �� ������ ������� ��� : ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() > daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					System.out.println("̳���� �� ������ ������� ��� ��" + daysc + " �� ����");
				}
				break;
			}
			case "6": {
				System.out.println("������ ���� ���� : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : arraysiz) {
					if (s.name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {

					Seasons s2 = Seasons.valueOf(seasonsc);
					int i = s2.ordinal();

					if (i == (arraysiz.length - 1)) {
						i = 0;
						System.out.println("�������� ���� ���� : " + arraysiz[i]);
					} else {
						System.out.println("�������� ���� ���� : " + arraysiz[i + 1]);
					}
					if (!flag) {
						System.out.println("������� ���� ���� ���� �� ������ ����� �� �� ����");
					}
					break;
				}
			}
			case "7": {
				System.out.println("������ ���� ���� : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : arraysiz) {
					if (s.name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {

					Seasons s2 = Seasons.valueOf(seasonsc);
					int i = s2.ordinal();

					if (i == 0) {
						i = (arraysiz.length - 1);
						System.out.println("��������� ���� ���� : " + arraysiz[i]);
					} else {
						System.out.println("��������� ���� ���� : " + arraysiz[i - 1]);
					}
					if (!flag) {
						System.out.println("������� ���� ���� ���� �� ������ ����� �� �� ����");
					}
					break;
				}
			}
			case "8": {
				for (Mons m : arraymis) {
					if (m.getDay() % 2 == 0) {
						System.out.println("���� ����� : " + m);
					}
				}

				break;
			}
			case "9": {
				for (Mons m : arraymis) {
					if (m.getDay() % 2 != 0) {
						System.out.println("�� ���� ����� : 9" + m);
					}
				}

				break;
			}
			case "10": {
				System.out.println("������ ����� : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.name().equals(monssc)) {
						flag = true;
					}
				}
				if (flag) {

					Mons m2 = Mons.valueOf(monssc);

					if (m2.getDay() % 2 == 0) {
						System.out.println("�������� ���� ����� " + monssc + "������");
					} else {
						System.out.println("�������� ���� ����� " + monssc + " �� ������");
					}
				}
				if (!flag) {

					System.out.println("�������� ���� ����� �� ������ ����� �� �� ����");
				}

				break;
			}
			}
		}
	}
}
