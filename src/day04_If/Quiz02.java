package day04_If;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 날짜를 입력 받아 1일이면 '월', 2일이면 '화' ... 7일이면 '일', 8일이면 '월'..
		 숫자에 맞춰 요일을 출력하시오
		*/
		int day;
		System.out.print("날짜 입력 : ");
		day=sc.nextInt();
		
		switch(day%7) {
		case 0 :
			System.out.println("일");
		case 1 : 
			System.out.println("월");
			break;
		case 2 :
			System.out.println("화");
			break;
		case 3 :
			System.out.println("수");
			break;
		case 4 :
			System.out.println("목");
			break;
		case 5 :
			System.out.println("금");
		case 6 :
			System.out.println("토");
			break;
		}
		
		/*
		 우리집, 회사 등록 후 보기
		 */
		int num;
		String home=null,company = null;
		
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.print(">>> ");
			num=sc.nextInt();
			
			switch(num) {
			case 1 :
				System.out.print("우리집 : ");
				home=sc.next();
				break;
			case 2 :
				System.out.print("회사 : ");
				company=sc.next();
				break;
			case 3 :
				System.out.println("우리집 : " + home);
				System.out.println("회사 : " + company);
				break;
			}
		}
		
	}
}
