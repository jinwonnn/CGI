package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03플레이리스트만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); // << 노래를 담아줄 리스트

		while (true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료 = 입력하시오 >> ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("========현재 재생 목록========");
				if (arr.size() == 0) {
					// 노래가 없을때
					System.out.println("재생 목록이 없습니다!");
				} else {
					// 노래가 추가됐을 때
					for (int i = 0; i < arr.size(); i++) {
						System.out.println((i + 1) + "." + arr.get(i));

					}
				}
				System.out.println("========================");
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				int where = sc.nextInt();
				if (where == 1) {
					System.out.print("추가할 노래 입력 >> ");
					String newsong = sc.next();
					arr.add(newsong);
					System.out.println("추가가 완료되었습니다!");
				} else if (where == 2) {
					System.out.print("추가할 노래 입력 >> ");
					String newsong = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					int songwhere = sc.nextInt();
					arr.add(songwhere - 1, newsong);

				}

			} else if (num == 2) {
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				int removeNumber = sc.nextInt();
				if (removeNumber == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					int removeSong = sc.nextInt();
					arr.remove(removeSong - 1);
					for (int i = 0; i < arr.size(); i++) {
						System.out.println(arr.get(i) + " ");
					}
				
					System.out.println("노래가 삭제되었습니다.");

				} else if(arr.size() == 0) {
					
					System.out.println("재생 목록이 없습니다. ");
				
				} else {
					arr.removeAll(arr);
					System.out.println("재생 목록이 없습니다. ");
				}


			} else if (num == 3) {
				if(arr.size() > 0) {
					for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i) + " ");
					}
				}else if(arr.size() == 0) {               
					System.out.println("재생 목록이 없습니다. ");
				}
			} else if(num == 4) {
				System.out.print("프로그램이 종료되었습니다.");
				break;
			}
			
			}
		}
	}

