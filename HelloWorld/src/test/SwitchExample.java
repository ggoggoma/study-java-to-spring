package test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 생일을 영어로 알려드립니다 ^___^");
		System.out.print("이름을 입력하세요 : ");
		System.out.println();
		String name = sc.nextLine();
		System.out.println("당신이 태어난 월을 입력하세요 : ");
		int num = sc.nextInt();
		
		String month = "";
		
		switch(num) {
			case 1: month ="Janunary";
				break;
			case 2: month ="February";
				break;
			case 3: month ="March";
				break;
			case 4: month ="April";
				break;
			case 5: month ="May";
				break;
			case 6: month ="June";
				break;
			case 7: month ="July";
				break;
			case 8: month ="August";
				break;
			case 9: month ="September";
				break;
			case 10: month ="October";
				break;
			case 11: month ="November";
				break;
			case 12: month ="December";
				break;
			default: month= "일치하는 달이 없습니다.";
				break;
			
		}
		System.out.printf("%s님 당신이 태어난 달은 영어로 %s 입니다", name, month);
	}	
	
}
