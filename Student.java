package Student;

public class Student {
	//설계도를 작성하는 공간
	
	//이름 , 나이, 학번 생성상하는 순간 데이터를 채워주는 생성자 만들기
	//생성자(constructor)
	// 1.메소드
	// 2.클래스와 생성자(메소드) 이름이 동일해야한다.
	// 3. 리턴타입을 지정하지 않는다. void 조차 작성하지 않는다.
	public Student(String name, int age, String number) {
		this.name = name;
		this.age = age;              // >> this로 필드값에 해당 부분 저장
		this.number = number;
	
	}
	public Student(String name, String number) {
		this.name = name;
		this.number = number;
		
	}
	//1. 필드 > 무조건 프라이빗설정하기
	private String name; //= "이름";
	private String number; //= "학번";
	private int age; //=나이
	private int scoreJava; //JAva점수
	private int scoreWeb; // web점수
	private int scoreAndroid; // Android점수
	
	//alt, shift s -> getter setter 에서 자동완성가능
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
			
			
	//2. 메소드
//	//1) 이름을 리턴해주는 getName 메소드
//	public String getName() {
//		return name;
//	}
//	//2) 학번을 리턴해주는 getNumber 메소드
//	public String getNumber() {
//		return number;
//	}
//	//3) 나이를 리턴해주는 getAge 메소드
//	public int getAge() {
//		return age;
//	}
//	//4) 자바점수를 리턴해주는 getScoreJava
//	public int getScoreJava() {
//		return scoreJava;
//	}
//	//5) 웹점수를 리턴해주는 getScoreWeb
//	public int getScoreWeb() {
//		return scoreWeb;
//	}	
//	//6) 안드로이드점수를 리턴해주는 getScoreAndroid
//	public int getScoreAndroid() {
//		return scoreAndroid;
//	}
//	//7) 자바점수를 받아와서 위에 있는 scoreJava 필드를 채워주는 setScoreJava
//	public void setScoreJava(int scoreJava) {
//		this.scoreJava = scoreJava;
//	}
//	//8) 웹점수를 받아와서 위에 있는 scoreWeb 필드를 채워주는 setScoreWeb
//	
//	//9) 안드점수를 받아와서 위에 있는 scoreAndroid 필드를 채워주는 setScoreAndroid 
	
}
