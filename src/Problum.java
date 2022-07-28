import java.util.Scanner;

public class Problum {
	public static void main(String[] args) {
		//문제 1
		int count = 0;
		int row = 0;
		for (int i = 65; i < 91; i++) {
			if (row % 2 == 0) {
				char ch = (char) i;
				System.out.print(ch + "\t");
				count++;
			} else if (row % 2 != 0) {
				i += 32;
				char ch2 = (char) i;
				System.out.print(ch2 + "\t");
				count++;
				i -= 32;
			}
			if (count % 5 == 0) {
				System.out.println();
				row++;
			}
		}

		// 문제 2 bmi
		Scanner sc = new Scanner(System.in);

		System.out.println("키를 입력하세요 : ");
		double height = sc.nextDouble();

		System.out.println("몸무게를 입력하세요 : ");
		int weight = sc.nextInt();

	}

}
