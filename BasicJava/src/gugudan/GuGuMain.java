package gugudan;

import java.util.Scanner;

public class GuGuMain {	
	public static void main(String[] args) {
		// JAVA는 프로그램 실행시 무조건 
		// Main 메서드부터 시작!!!
		
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// 2 x 5 = 10
		// 2 x 6 = 12
		// 2 x 7 = 14
		// 2 x 8 = 16
		// 2 x 9 = 18
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 9 = 27
		// 4 x 1 = 4
		// ...
		
		// 1. 사용자에게 단수를 입력받는 부분
		// 2. 구구단을 출력하는 부분
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수>>");
		int dansu = sc.nextInt(); // 단수 입력
		
		GuGuPrint ggp = new GuGuPrint();
		ggp.guGuDan(dansu);
		  
	}
}








