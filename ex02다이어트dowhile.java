package day03;

import java.util.Scanner;

public class ex02다이어트dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		//현재 몸무게 출력 후 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		//목표몸무게 출력 후 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		//--반복문시작
		//몇주차 감량 몸무게 출력 후 입력받기
		do{
			//한번은 무조건 실행되야하는 부분
			//반복작업을 실행할 부분
			System.out.print(cnt + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			now = now - minus; //now -= minus; (복합대입연산자)
			cnt++;
		}while(now > goal); //while은 트루일때만 진행하기에 현재무게 > 목표무게 // if 라면 반대
		
		System.out.println(now +" kg 달성 축하합니다");
		
		//목표치 달성했을때 축하합니다 메세지 제공하기

	}

}
