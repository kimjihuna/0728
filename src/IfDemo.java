import java.util.Iterator;
import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
//		int jumsu=59;
//		if(jumsu>=60) {
//			System.out.println("축하합니다");
//		}else {
//			System.out.println("떨ㅇ졌습니다");
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신은 어느 계절을 좋아하나요? : ");
//		String season = sc.nextLine();
//		if (season.equals("spring")) { // season이 알고 있는 번지의 값이 spring와 일치하나요?
//			System.out.println("진달래, 개나리");
//		} else if (season.equals("summer")) { // season이 알고 있는 번지의 값이 summer와 일치하나요?
//			System.out.println("장미, 아카시아");
//		} else if (season.equals("fall")) { // season이 알고 있는 번지의 값이 fall와 일치하나요?
//			System.out.println("코스모스, 백합");
//		} else if (season.equals("winter")) {
//			System.out.println("동백, 매화");
//		} else {
//			System.out.println("그런 계절은 없습니다.");
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("년을 입력하세요");
//		int year = sc.nextInt();
//		System.out.print("월을 입력하세요");
//		int month = sc.nextInt();

//		if (month == 1 || month == 5 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) {
//			System.out.println("마직막 일은 31 입니다");
//		} else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) && month == 2) {
//			System.out.println("마지막 일은 29 입니다");
//		} else {
//			System.out.println("마지막 일은 30 입니다");
//		}

		// 강사님
//		if (month == 2) {
//			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) { // 윤년이라면
//				System.out.println("마지막 일은 29 입니다");
//			} else {
//				System.out.println("마지막 일은 28 입니다");
//			}
//		} else if (month != 2) { // 2월이아니라면
//			if (month == 1 || month == 5 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) {
//				System.out.println("마직막 일은 31 입니다");
//			} else {
//				System.out.println("마지막 일은 30 입니다");
//			}
//		}

		Scanner sc = new Scanner(System.in);

		System.out.print("출생년도를 입력하세요: ");
		int year = sc.nextInt();
		System.out.print(2022 - year + 1 + "살이고, ");

		if (year % 12 == 0)
			System.out.println("원숭이띠입니다.");
		if (year % 12 == 1)
			System.out.println("닭띠입니다.");
		if (year % 12 == 2)
			System.out.println("개띠입니다.");
		if (year % 12 == 3)
			System.out.println("돼지띠입니다.");
		if (year % 12 == 4)
			System.out.println("쥐띠입니다.");
		if (year % 12 == 5)
			System.out.println("소띠입니다.");
		if (year % 12 == 6)
			System.out.println("호랑이띠입니다.");
		if (year % 12 == 7)
			System.out.println("토끼띠입니다.");
		if (year % 12 == 8)
			System.out.println("용띠입니다.");
		if (year % 12 == 9)
			System.out.println("뱀띠입니다.");
		if (year % 12 == 10)
			System.out.println("말띠입니다.");
		if (year % 12 == 11)
			System.out.println("양띠입니다.");

	}
}