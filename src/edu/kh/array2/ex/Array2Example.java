package edu.kh.array2.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Example {

	Scanner sc = new Scanner(System.in);
	
	/* 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개념 추가
	 * 
	 */
	
	public void ex1() {
		
		// 2차원 배열 선언
		int[][] arr; 
		// int 2차원 배열을 참조하는 참조변수 선언
		// 참조형 == 참조 변수 == 레퍼런스 변수 == 레퍼런스
		
		// 2차원 배열 할당
		// -> new 자료형[행크기][열크기]
		
		arr = new int[2][3];
		// heap 영역에 int 2차원 배열 2행 3열 공간을 할당
		
		// 2차원 배열 초기화
		// 1) 행, 열, 인덱스를 이용하여 직접 초기화
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		
		
		// 2) 2중 for문을 이용한 초기화
		
		int num = 10; // 배열 요소 초기화에 사용할 변수
		
		// * 배열 길이
		// -> 배열명.length 는 변수가 직접 참조하고 있는 배열의 길이를 반환
		
		System.out.println(arr.length); // 2 (행길이)
		// arr이 참조하고 있는 2차원 배열의 행의 길이
		
		System.out.println(arr[0].length); // 3 (열길이)
		// arr[0] 행이 참조하고 있는 1차원 배열의 열의 길이
		
		System.out.println(arr[1].length); // 3 (열길이)
		// arr[1] 행이 참조하고 있는 1차원 배열의 열의 길이
		
		for(int row = 0; row < arr.length; row++) { // 행 반복(0,1)
			
			for(int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = num;
				num += 10;
			}
			
		} 
		
			// Arrays.toString(배열명) : 참조하고 있는 1차원 배열 값을 문자열로 변환
			System.out.println("toString() : " + Arrays.toString(arr));
			
			// Arrays.deepToString(배열명)
			// - 참조하고 있는 배열의 데이터가 나오는 부분까지 파고 들어가서
			// 모든 값을 문자열로 반환
			System.out.println("deepToString() : " + Arrays.deepToString(arr));
		
		
	}
	
	
	public void ex2() {
		
		// 2차원 배열 선언과 동시에 초기화
		// 3행 3열짜리 정수형 2차원 배열 선언과 동시에
		// 1~9까지 초기화
		int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		// 행 별로 합 출력
		for(int row = 0; row < arr.length; row++) { // 행 반복
			int sum = 0;
			
			for(int col = 0; col < arr[row].length; col++) { // 열 반복
				
				sum += arr[row][col];
					// 		0	 0		--> 1
					//		0	 1		--> 2
					//		0	 2		--> 3
				// -------------------------------
					//		1	 0		--> 4
					//		1	 1		--> 5
					//		1	 2		--> 6
				// -------------------------------
					//		2	 0		--> 7
					//		2	 1		--> 8
					//		2	 2		-->	9
				
			}
			
			System.out.printf("%d행의 합 : %d\n", row, sum);
			
		}

		
		System.out.println("-------------------------------");
	
	
			// 열 별로 합출력
			// ex)
			// 0열의 합 : 12
			// 1열의 합 : 15
			// 2열의 합 : 18
			
			// 전체 합 출력
			// ex) 전체 합 : 45
		
		for(int col = 0; col < arr[0].length; col++) { // 열 반복
			int sum = 0;
			for(int row = 0; row < arr.length; row++) { // 행 반복
				
				sum += arr[row][col];
				// ----------------1턴
				//          0    0		--> 1
				//			1	 0		--> 4
				//			2	 0		--> 7
				// ----------------2턴
				//			0	 1		--> 2
				//			1	 1		--> 5
				//			2	 1		--> 8
				// ----------------3턴
				//			0	 2		--> 3
				//			1	 2		--> 6
				//			2	 2		--> 9
				
				
			}
			
			System.out.printf("%d열의 합 : %d\n", col, sum);
			
		}
		
		// 전체 합 출력
		// ex ) 전체 합 : 45
		int sum = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				sum += arr[row][col];
				
			}
			
		}
		
		System.out.println("전체합 : " + sum);
		
	}
	
	
	public void ex3() {
		
		// 가변 배열
		// - 2차원 배열 생성 시 마지막 배열 차수(열)를 지정하지 않고
		// 나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		
		char[][] arr = new char [4][];
					// char 2차원 배열 생성 시 행 부분만 생성
		
		arr[0] = new char[3]; // 0행에 3열짜리 1차원 배열을 생성하여 주소값 저장
		arr[1] = new char[4]; // 1행에 4열짜리 1차원 배열을 생성하여 주소값 저장
		arr[2] = new char[5]; // 2행에 5열짜리 1차원 배열을 생성하여 주소값 저장
		arr[3] = new char[2]; // 3행에 2열짜리 1차원 배열을 생성하여 주소값 저장
		
		char ch = 'a';
		
		for(int row = 0; row < arr.length; row++) { // 행
			
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = ch++;
				
			}
			
		}
		
		System.out.println("deepToString : " + Arrays.deepToString(arr));
		
		
	}
	
	
	public void Bingo() {
		
		int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		
		// 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
		for(int i = 0 ; i < SIZE ; i++) {
			for(int j = 0 ; j < SIZE ; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}
		
		// 배열에 저장된 값을 뒤섞는다.(shuffle)
		for(int i = 0 ; i < SIZE ; i++) {
			for(int j = 0 ; j < SIZE ; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i = 0 ; i < SIZE ; i++) {
				for(int j = 0 ; j < SIZE ; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0) > ", SIZE*SIZE);
			String tmp =sc.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환
			
			// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer:
			for(int i = 0 ; i < SIZE ; i++) {
				for(int j = 0 ; j < SIZE ; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2중 반복문을 벗어난다.
					}
				}
			}
			
		} while (num != 0);
		
		sc.close();
	}
	
	
	
	
	
}
