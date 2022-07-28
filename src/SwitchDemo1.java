import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신은 어느 계절을 좋아하나요? : ");
		String season = sc.nextLine();

//		String flowers = (season.equals("spring)) ? "진달래, 개나리" : (season.equals("summer))?"장미, 아카시아": (season.equals("fall))?"코스모스, 백합": (season.equals("winter))?"동백, 매화";

		if (season.equals("spring")) { // season이 알고 있는 번지의 값이 spring와 일치하나요?
			System.out.println("진달래, 개나리");
		} else if (season.equals("summer")) { // season이 알고 있는 번지의 값이 summer와 일치하나요?
			System.out.println("장미, 아카시아");
		} else if (season.equals("fall")) { // season이 알고 있는 번지의 값이 fall와 일치하나요?
			System.out.println("코스모스, 백합");
		} else if (season.equals("winter")) {
			System.out.println("동백, 매화");
		} else {
			System.out.println("그런 계절은 없습니다.");
		}

		switch (season) {
		case "sprint":
			System.out.println("진달래, 개나리");
			break;
		case "summer":
			System.out.println("장미, 아카시아");
			break;
		case "fall":
			System.out.println("코스모스, 백합");
			break;
		case "winter":
			System.out.println("동백, 매화");
			break;
		default:
			System.out.println("그런 계절은 없습니다.");
		}

	}
}
