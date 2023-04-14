package pack02_field;

public class Ex01_CarMain {
	public static void main(String[] args) { //메인 붙으면 main메소드 만들기
		//Ex01_Car라는 클래스를 변수처럼 만들어보기 
		
		//내부에 있는 내용을 출력해보기
		Ex01_Car myCar= new Ex01_Car(); //인스턴스화: 객체를 메모리에 올려서 사용하게 만드는것
										// + 내부에 있는 모든 멤버가 메모리에 올라가는것
		System.out.println("제조사:" + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색상:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeed);
		System.out.println("현재속도:" + myCar.speed);
		
		System.out.println("사용자가 화면에 앞으로 가기를 눌렀다.");
		myCar.speed = 30;
		System.out.println(myCar.speed+"가 앞으로 달리기 시작");
	}
}
