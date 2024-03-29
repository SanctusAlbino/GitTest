package pack01_lf;

public class Ex04_ifIf {
	public static void main(String[] args) {
		// 블럭킹의 기본 개념 :{<-메모리에 올림} <-메모리에서 내림
		// 자바프로그램은 메모리를 효율적으로 쓰기위해서 메모리에 올리고 내리는 과정이 존재함.
		// 블럭킹(지역)은 계속해서 중첩이 가능하다.
		
		//제어문이 3개이상 중첩이 되는 경우에는 내가 코드를 맞게 짜는지 의심해볼 필요가 있음.
		int score = 10;
		//if문을 중첩시켜서 score가 짝수이면 짝수를 출력하고
		//score가 10이면 10이라는 문자열을 출력하고
		//11보다 작으면 11보다 작음 이라는 문자열을 출력하게 코딩해보기
		
		//스파게티 코드 : 코드를 이상하게 꼬아서 짜놓음(적발시 많이 혼날 가능성 있음)

		if (score%2==0) {
			System.out.println("짝수");
			if (score==10) {
				System.out.println("10");
				if (score<11) {
					System.out.println("11보다 작음");
				}
			}
		} else {
			System.out.println("홀수");
		}
	}
}
