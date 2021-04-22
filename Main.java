package OOP;

public class Main {

	public static void main(String[] args) {
		// 객체 (Object)를 생성하는 공간
		// 설계도 (Class) 기반으로 객체를 메모리에 할당하는 공간 >> 클래스의 인스턴스화
		People hyung = new People();
		// new >> 레퍼런스변수(참조형변수)를 생성할 때 쓰는 키워드.
		
		System.out.println(hyung);
		// = String name = new String("456");
		// 레퍼런스변수는 주소값을 가지고 있다.
		// 접근방법 => .을 통해 접근한다

		System.out.println(hyung.age);
		System.out.println(hyung.name);
		// 필드가 채워지지 않은경우 기본형데이터(int)에는 0 , 참조형데이터(String)는 null
		
		// 이름 >> 정형
		hyung.name = "정형";
		// 나이 >> 20
		hyung.age = 20;
		// 키 >> 185
		hyung.height = 185.9;
		// 장기 >> 신장, 간, 폐
		hyung.organs = new String[3]; //배열은 항상 크기를 생성해야한다.
		hyung.organs[0] = "심장";
		hyung.organs[1] = "간";
		hyung.organs[2] = "폐";
		
		System.out.println(organs[1]);
		hyung.eat();
		hyung.sleep();
	}

}
