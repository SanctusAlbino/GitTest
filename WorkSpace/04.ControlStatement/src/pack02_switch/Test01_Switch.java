package pack02_switch;

public class Test01_Switch {
	public static void main(String[] args) {
		int score = 98;
		switch (score/10) {
			case 10:
				System.out.println("A");
				break;
			case 9: 
				System.out.println("A");
				break;
			case 8: 
				System.out.println("B");
				break;
			case 7: 
				System.out.println("C");
				break;
			case 6: 
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
		}
	}
}
