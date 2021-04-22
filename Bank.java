package Bank;

public class Bank {
	// 1. 필드(속성)
	private int money; //캡슐화(정보은닉)
	
	
	// 2. 메소드(기능)
	// 메소드명 : deposit / 매개변수 : 정수형 1개 / 리턴타입 X
	
	// 메소드명 : withdraw / 매개변수 : 정수형 1개 / 리턴타입 X
	
	// 메소드명 : showmoney / 매개변수 : X / 리턴타입 정수형
	
	public void deposit(int money){
		this.money += money; // this.money > 전역변수 money를 불러옴
//		System.out.println("원이 입금되었습니다");
	}
	
	public void withdraw(int money){
		this.money -= money;
//		System.out.println("원이 인출되었습니다");
	}
	
	public int showmoney(){
//		int result = deposit - withdraw
//		System.out.println("잔고는" + "" +"원 입니다.");
		return money;
	}
	
}
