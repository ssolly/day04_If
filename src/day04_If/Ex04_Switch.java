package day04_If;

import java.util.Scanner;

public class Ex04_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.print("수 입력 : ");
		select=sc.nextInt();
		
		switch(select) {
			case 1 : System.out.println("1.입력값 : " + select);
			break;		//break이 없으면 밑의 사항도 출력된다, switch문을 빠져나올 때 사용
			case 2 : System.out.println("2.입력값 : " + select);
			break;
			case 3 : System.out.println("3.입력값 : " + select);
			break;
			default : System.out.println("1,2,3을 제외한 다른 값 입력");
		
		}
	}
}
