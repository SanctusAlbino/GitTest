package pack03_constructor;

public class Ex02_Korean {
	//필드
	String nation = "대한민국";
	String name, ssn; // 사람마다 다른 속성 (null, null)
	//조건: String형태로 name과 ssn이 null이 아닌 상태가 되게끔 만드는것
	
	
	public Ex02_Korean(String name, String ssn) {
		
		this.name = name;
		this.ssn = ssn;
	}
	
	
}
