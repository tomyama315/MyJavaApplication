package Action;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import DTO.InchargeScheduleDTO;
import DTO.PersonDTO;

public class MakeFlameAction {
	static List<InchargeScheduleDTO> seatList = new ArrayList<>();
	static List<PersonDTO> personList = new ArrayList<>();

	public MakeFlameAction(List<PersonDTO> list) {
		for (PersonDTO person : list) {
			personList.add(person);
		}
	}

	public void makeflame() {
		for (int i = 1; i < 9; i++) {
			InchargeScheduleDTO seat = new InchargeScheduleDTO();
			seat.setIdentifyNum(i);
			seatList.add(seat);
		}

		System.out.println("8:00-9:00/8:30-9:30");
		Collections.shuffle(personList);
		int count1 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count1 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 8, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 8, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson1().getName()
					+ "  ShiftStart:" + seat.getPerson1().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson1().getLastStrInChar() + (seat.getPerson1().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson1().getTeacher().getName() : ""));
			if (count1 % 2 == 0) {
				System.out.println();
			}
			count1++;
		}
		MakeFlameAction.WhoisIdle(1);

		System.out.println("9:00-10:00/9:30-10:30");
		Collections.shuffle(personList);
		int count2 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count2 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 9, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 9, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson2().getName()
					+ "  ShiftStart:" + seat.getPerson2().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson2().getLastStrInChar() + (seat.getPerson2().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson2().getTeacher().getName() : ""));
			if (count2 % 2 == 0) {
				System.out.println();
			}
			count2++;
		}
		MakeFlameAction.WhoisIdle(2);

		System.out.println("10:00-11:00/10:30-11:30");
		Collections.shuffle(personList);
		int count3 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count3 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 10, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 10, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson3().getName()
					+ "  ShiftStart:" + seat.getPerson3().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson3().getLastStrInChar() + (seat.getPerson3().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson3().getTeacher().getName() : ""));
			if (count3 % 2 == 0) {
				System.out.println();
			}
			count3++;
		}
		MakeFlameAction.WhoisIdle(3);

		System.out.println("11:00-12:00/11:30-12:30");
		Collections.shuffle(personList);
		int count4 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count4 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 11, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 11, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson4().getName()
					+ "  ShiftStart:" + seat.getPerson4().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson4().getLastStrInChar() + (seat.getPerson4().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson4().getTeacher().getName() : ""));
			if (count4 % 2 == 0) {
				System.out.println();
			}
			count4++;
		}
		MakeFlameAction.WhoisIdle(4);

		System.out.println("12:00-13:00/12:30-13:30");
		Collections.shuffle(personList);
		int count5 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count5 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 12, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 12, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson5().getName()
					+ "  ShiftStart:" + seat.getPerson5().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson5().getLastStrInChar() + (seat.getPerson5().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson5().getTeacher().getName() : ""));
			if (count5 % 2 == 0) {
				System.out.println();
			}
			count5++;
		}
		MakeFlameAction.WhoisIdle(5);

		System.out.println("13:00-14:00/13:30-14:30");
		Collections.shuffle(personList);
		int count6 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count6 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 13, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 13, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson6().getName()
					+ "  ShiftStart:" + seat.getPerson6().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson6().getLastStrInChar() + (seat.getPerson6().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson6().getTeacher().getName() : ""));
			if (count6 % 2 == 0) {
				System.out.println();
			}
			count6++;
		}
		MakeFlameAction.WhoisIdle(6);

		System.out.println("14:00-15:00/14:30-15:30");
		Collections.shuffle(personList);
		int count7 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count7 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 14, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 14, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson7().getName()
					+ "  ShiftStart:" + seat.getPerson7().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson7().getLastStrInChar() + (seat.getPerson7().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson7().getTeacher().getName() : ""));
			if (count7 % 2 == 0) {
				System.out.println();
			}
			count7++;
		}
		MakeFlameAction.WhoisIdle(7);

		System.out.println("15:00-16:00/15:30-16:30");
		Collections.shuffle(personList);
		int count8 = 1;
		for (InchargeScheduleDTO seat : seatList) {
			if (count8 % 2 == 0) {
				MakeFlameAction.AssignPerson(seat, 15, 0);
			} else {
				MakeFlameAction.AssignPerson(seat, 15, 30);
			}
			System.out.println("SeatNumber:" + seat.getIdentifyNum() + "  InCharge:" + seat.getPerson8().getName()
					+ "  ShiftStart:" + seat.getPerson8().getLastStrInChar().minusHours(1) + "  ShiftEnd:"
					+ seat.getPerson8().getLastStrInChar() + (seat.getPerson8().getNeedHelp() == 1
							? "  Teacher:" + seat.getPerson8().getTeacher().getName() : ""));
			if (count8 % 2 == 0) {
				System.out.println();
			}
			count8++;
		}
		MakeFlameAction.WhoisIdle(8);

		for (PersonDTO person : personList) {
			System.out.println("名前:" + person.getName());
			System.out.println("最終シフト:" + person.getLastStrInChar());
			if (person.getLastStrInChar().isBefore(LocalTime.of(15, 31))
					&& !person.getLastStrInChar().equals(LocalTime.of(0, 0))) {
				person.setAlreadyDone();
			}
			System.out.println("一時間休憩を何回したか:" + person.getAlreadyDone());
			System.out.print("入ったシフト:");
			for (int i : person.getHistory()) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println("教務担当者:" + (person.getNeedHelp() == 1 ? person.getTeacher().getName() : "No Need"));
			System.out.println();
		}
	}

	public static void AssignPerson(InchargeScheduleDTO seat, int startHour, int startMinute)
			throws IndexOutOfBoundsException {
		List<PersonDTO> tempList = new CopyOnWriteArrayList<>();
		
		//30分間インターバルが存在しない場合
		tempList = personList.stream() 
				.filter(s -> s.getLastStrInChar()
						.isBefore(LocalTime.of((startMinute - 31 == -31 ? (startHour - 1) : startHour),
								(startMinute - 31 == -31 ? 31 : 1))))
				.filter(s -> !s.getHistory().contains(seat.getIdentifyNum()))
				.filter(s -> !s.getHistory().contains(seat.getIdentifyNum() % 2 == 0 ? seat.getIdentifyNum() - 1
						: seat.getIdentifyNum() + 1))
				.collect(Collectors.toList());

		Collections.sort(tempList, new SortRule());


		// もし入れる人がいない場合、ペア席重複禁止ルールのみ解除
		if (tempList.size() == 0) {
			for (PersonDTO person : personList) {
				if (person.getHistory().contains(
						seat.getIdentifyNum() % 2 == 0 ? seat.getIdentifyNum() - 1 : seat.getIdentifyNum() + 1)
						&& person.getLastStrInChar()
								.isBefore(LocalTime.of((startMinute - 31 == -31 ? (startHour - 1) : startHour),
										(startMinute - 31 == -31 ? 31 : 1)))) {
					tempList.add(person);
				}
			}

			//ルールに従いソートを行う
			Collections.sort(tempList, new AssignIntervalForNotAssignedRule());

			//シフトに4回以上入っている且一度も一時間休憩をとっていない場合リストから削除
			tempList.removeIf(s -> s.getHistory().size() >= 4 && s.getAlreadyDone() == 0);
		}
		try {
			for (PersonDTO person : personList) {
				if (person.getName().equals(
						startMinute == 0 ? tempList.get(0).getName() : tempList.get(tempList.size() - 1).getName())) { //ソートされた結果、リストの先頭に存在するPsersonObjectから登録
					person.getHistory().add(seat.getIdentifyNum()); // 当該シフトに入った履歴を残す
					if (person.getLastStrInChar().isBefore(LocalTime.of((startHour - 1), (startMinute + 1))) //最後にシフトに入ってから1時間立っている場合カウント
							&& !person.getLastStrInChar().equals(LocalTime.of(0, 0))) {
						person.setAlreadyDone();
					}
					if (person.getNeedHelp() == 1) { //訓練生の場合、その教官にシフトに入った履歴と時間を登録
						person.getTeacher().getHistory().add(seat.getIdentifyNum());
						person.getTeacher().setLastStrInChar(LocalTime.of((startHour + 1), startMinute));

					}
					person.setLastStrInChar(LocalTime.of((startHour + 1), startMinute)); // 最後にシフトに入った時間を更新登録

					// 席にPersonObjectを登録する
					switch (startHour) {
					case 8:
						seat.setPerson1(person);
						break;
					case 9:
						seat.setPerson2(person);
						break;
					case 10:
						seat.setPerson3(person);
						break;
					case 11:
						seat.setPerson4(person);
						break;
					case 12:
						seat.setPerson5(person);
						break;
					case 13:
						seat.setPerson6(person);
						break;
					case 14:
						seat.setPerson7(person);
						break;
					case 15:
						seat.setPerson8(person);
						break;
					}
				}
			}
		} catch (IndexOutOfBoundsException e) {
			throw e;
		}
	}

	//当該シフトに入っていないPersonをリスト化
	public static void WhoisIdle(int identifer) {
		List<PersonDTO> idleList = new CopyOnWriteArrayList<>();
		idleList.addAll(personList);
		System.out.println("IdleList");
		for (InchargeScheduleDTO seat : seatList) {
			for (PersonDTO busyPerson : idleList) {
				switch (identifer) {
				case 1:
					if (seat.getPerson1().getName().equals(busyPerson.getName())) { //seatObjectに登録されているpersonの名前とpersonListのpersonの名前を走査してリストから削除
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false); //訓練生がシフトに入った場合その教官もIdleLisetから削除
					break;
				case 2:
					if (seat.getPerson2().getName().equals(busyPerson.getName())) {
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false);
					break;
				case 3:
					if (seat.getPerson3().getName().equals(busyPerson.getName())) {
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false);
					break;
				case 4:
					if (seat.getPerson4().getName().equals(busyPerson.getName())) {
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false);
					break;
				case 5:
					if (seat.getPerson5().getName().equals(busyPerson.getName())) {
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false);
					break;
				case 6:
					if (seat.getPerson6().getName().equals(busyPerson.getName())) {
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false);
					break;
				case 7:
					if (seat.getPerson7().getName().equals(busyPerson.getName())) {
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false);
					break;
				case 8:
					if (seat.getPerson8().getName().equals(busyPerson.getName())) {
						idleList.remove(busyPerson);
					}
					idleList.removeIf(s ->busyPerson.getNeedHelp()==1?busyPerson.getTeacher().getName().equals(s.getName()):false);
					break;
				}
			}
		}
		for (PersonDTO idlePerson : idleList) {
			System.out.println(idlePerson.getName() + "is idle.");
		}
		System.out.println();
	}
}

// 待機時間が長いPersonに優先的に割当を行うルール
class SortRule implements Comparator<PersonDTO> {
	public int compare(PersonDTO p1, PersonDTO p2) {
		return p1.getLastStrInChar().compareTo(p2.getLastStrInChar());
	}
}

//入っているシフト数が少ないPersonがListの先頭に並ぶルール
class AssignIntervalForNotAssignedRule implements Comparator<PersonDTO> {
	public int compare(PersonDTO p1, PersonDTO p2) {
		return (p1.getHistory().size() - p2.getHistory().size());
	}
}
