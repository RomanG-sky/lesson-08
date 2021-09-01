package lgs.lviv.ua;

import java.util.Scanner;

public class App_Days {

	public static void main(String[] args) {

		Mons[] arraymis = Mons.values();
		Seasons[] arraysiz = Seasons.values();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Ќатисн≥ть 1 щоб ввести м≥с€ць : ");
			System.out.println("Ќатисн≥ть 2 щоб ввести пору року : ");
			System.out.println("Ќатисн≥ть 3 щоб ввести к≥льк≥сть дн≥в : ");
			System.out.println("Ќатисн≥ть 4 щоб ввести к≥льк≥сть дн≥в ≥ в≥добразити менш≥ : ");
			System.out.println("Ќатисн≥ть 5 щоб ввести к≥льк≥сть дн≥в ≥ в≥добразити б≥льш≥ : ");
			System.out.println("Ќатисн≥ть 6 щоб ввести пору року : ");
			System.out.println("Ќатисн≥ть 7 щоб ввести пору року : ");
			System.out.println("Ќатисн≥ть 8 щоб вивести м≥с€ц≥ з парною к≥льк≥стю дн≥в : ");
			System.out.println("Ќатисн≥ть 9 щоб вивести м≥с€ц≥ з не парною к≥льк≥стю дн≥в : ");
			System.out.println("Ќатисн≥ть 10 щоб ввести м≥с€ць : ");
			switch (scan.next()) {

			case "1": {
				System.out.println("¬вед≥ть м≥с€ць : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.name().equals(monssc)) {
						System.out.println("¬ведений ¬ами м≥с€ць ≥снуЇ");
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("¬ведений ¬ами м≥с€ць на планет≥ «емл€ ше не ≥снуЇ");
				}
			}
				break;
			case "2": {
				System.out.println("¬вед≥ть пору року : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getSeason().name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("¬ведена ¬ами пора року " + seasonsc + " маЇ так≥ м≥с€ц≥ : ");
					for (Mons m2 : arraymis) {
						if (m2.getSeason().name().toString().equalsIgnoreCase(seasonsc)) {
							System.out.println(m2);
						}
						if (!flag) {
							System.out.println("¬ведена ¬ами пора року на планет≥ «емл€ ше не ≥снуЇ");
						}
						break;

					}
				}
			}
			case "3": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥ : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("¬ведена к≥льк≥сть дн≥в " + daysc + " присутн€ в таких м≥с€ц€х: ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() == daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					System.out.println("ћ≥с€ц€ ≥з " + daysc + " к≥льк≥стю дн≥в не ≥снуЇ");
				}
				break;
			}
			case "4": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥ : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("ћ≥с€ц≥ ≥з меншою к≥льк≥стю дн≥в : ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() < daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					System.out.println("ћ≥с€ц€ ≥з меншою к≥льк≥стю дн≥в н≥ж" + daysc + " не ≥снуЇ");
				}
				break;
			}
			case "5": {
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥ : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("ћ≥с€ц≥ ≥з б≥льшою к≥льк≥стю дн≥в : ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() > daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					System.out.println("ћ≥с€ц€ ≥з б≥льшою к≥льк≥стю дн≥в н≥ж" + daysc + " не ≥снуЇ");
				}
				break;
			}
			case "6": {
				System.out.println("¬вед≥ть пору року : ");
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
						System.out.println("Ќаступна пора року : " + arraysiz[i]);
					} else {
						System.out.println("Ќаступна пора року : " + arraysiz[i + 1]);
					}
					if (!flag) {
						System.out.println("¬ведена ¬ами пора року на планет≥ «емл€ ше не ≥снуЇ");
					}
					break;
				}
			}
			case "7": {
				System.out.println("¬вед≥ть пору року : ");
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
						System.out.println("ѕопередн€ пора року : " + arraysiz[i]);
					} else {
						System.out.println("ѕопередн€ пора року : " + arraysiz[i - 1]);
					}
					if (!flag) {
						System.out.println("¬ведена ¬ами пора року на планет≥ «емл€ ше не ≥снуЇ");
					}
					break;
				}
			}
			case "8": {
				for (Mons m : arraymis) {
					if (m.getDay() % 2 == 0) {
						System.out.println("ѕарн≥ м≥с€ц≥ : " + m);
					}
				}

				break;
			}
			case "9": {
				for (Mons m : arraymis) {
					if (m.getDay() % 2 != 0) {
						System.out.println("Ќе парн≥ м≥с€ц≥ : 9" + m);
					}
				}

				break;
			}
			case "10": {
				System.out.println("¬вед≥ть м≥с€ць : ");
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
						System.out.println("¬казаний ¬ами м≥с€ць " + monssc + "парний");
					} else {
						System.out.println("¬казаний ¬ами м≥с€ць " + monssc + " не парний");
					}
				}
				if (!flag) {

					System.out.println("¬ведений ¬ами м≥с€ць на планет≥ «емл€ ше не ≥снуЇ");
				}

				break;
			}
			}
		}
	}
}
