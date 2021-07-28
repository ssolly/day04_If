package day04_If;

import java.util.Scanner;

public class Ex06_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		
//		while(true) { //무한루프
//			System.out.println("test");
//		}
		
		while(true) {
			System.out.print("이름 입력 : ");
			name=sc.next();
			System.out.println("당신의 이름은 " + name + " 이군요");
		}
		
		
		
		
	}
}
