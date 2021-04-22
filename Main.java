package Bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 객체를 생성하는 공간
		Bank bank1 = new Bank(); // >> 스캐너 기능과 동일
		
		//1. money에 50000원 넣기
//		bank1.money = 10000000; >> 캡슐화가 필요한 이유. 기존정보에 입력하여 수정가능해버림 > private
		bank1.deposit(50000); 
		
		
		//2. money에 30000원 뺴기
		bank1.withdraw(30000);
		
		//3. 내 잔액을 보여주기
		System.out.println(bank1.showmoney());
	}

}
