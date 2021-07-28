package day04_If;

import java.util.Scanner;

public class Ex05_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("문자열 입력 : ");
		str = sc.next();
		switch(str) {
			case "안녕" : 
				System.out.println("안녕을 입력");
				break;
			case "그래" :
				System.out.println("그래를 입력");
				break;
		}
	}
}
