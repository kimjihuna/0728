import java.util.Iterator;

public class ForDemo {
	public static void main(String[] args) {

		// 1 ~20 3의 배수
//		for (int su = 1; su <= 20; su++) {
//			if(su%3 == 0)
//				System.out.print(su + "\t");
//		}
//		

		// 20부터 80까지 숫자를 출력하되, 7의 배수를 출력하되 한줄에 5개씩만 출력
		int j = 0;
		for (int i = 20; i <= 180; i++) {
			if (i % 7 == 0) {
				System.out.print(i+"\t");
				j++;
			}
			
		    if (j == 5) {
				System.out.println();
				j = 0;
		    }
		}
	}

}
// 1 ~20 3의 배수