
public class RandomDemo {
	public static void main(String[] args) {
		int rand = (int) (Math.random() * 10 + 1);
		System.out.println(rand);
		switch(rand) {
		case 1:
			System.out.println("Banans");
		break;
		case 2:
			System.out.println("Oranges");
		break;
		case 3:
			System.out.println("Peach");
		case 4:
			System.out.println("Apples");
		case 5:
			System.out.println("Plums");
		break;
		case 6:
			System.out.println("Pineapples");
		break;
		case 7:
			System.out.println("No message-igmore this case");
		break;
		default:
			System.out.println("Nuts");
		
		}
		
	}
	
}
