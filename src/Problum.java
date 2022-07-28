import java.util.Scanner;

public class Problum {
	public static void main(String[] args) {
		// 문제 1
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

		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		double height2 = height / 100;
		System.out.print("몸무게를 입력하세요 : ");
		double weight = sc.nextInt();

		double BMI = weight / Math.pow(height2, 2);
//		System.out.println("BMI : "+BMI);

		if (BMI >= 35) {
			System.out.println("고도비만");
		} else if (BMI <= 34.9 && BMI >= 30) {
			System.out.println("중도비만");
		} else if (BMI <= 29.9 && BMI >= 25) {
			System.out.println("경도비만");
		} else if (BMI <= 24.9 && BMI >= 23) {
			System.out.println("과체중");
		} else if (BMI <= 22.9 && BMI >= 18.5) {
			System.out.println("정상");
		} else if (BMI < 18.5) {
			System.out.println("중도비만");
		}

	}

}
