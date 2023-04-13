package baseballCodeTest;

import java.util.Scanner;

class BaseballGameCode {
	
	public static void main(String[] args) {
		int correctCount = 0; //맞은 횟수
		int totalCount = 0; //전체 게임 횟수
		double averageCount=0; //정답까지 평균 횟수
		boolean contGame = true;
		Scanner scanner = new Scanner(System.in);
		
		while(contGame) {
			
			
			boolean inGame = true;
			  String randomNum1 = String.valueOf((int)(Math.random() * 10));
	            String randomNum2 = String.valueOf((int)(Math.random() * 10));
	            while (randomNum1.equals(randomNum2)) {
	                randomNum2 = String.valueOf((int)(Math.random() * 10));
	            }
	            String randomNum3 = String.valueOf((int)(Math.random() * 10));
	            while (randomNum3.equals(randomNum2) || randomNum3.equals(randomNum1)) {
	                randomNum3 = String.valueOf((int)(Math.random() * 10));
	            }
	            String randomNum4 = String.valueOf((int)(Math.random() * 10));
	            while (randomNum4.equals(randomNum1) || randomNum4.equals(randomNum2) || randomNum4.equals(randomNum3)) {
	                randomNum4 = String.valueOf((int)(Math.random() * 10));
	            }
			
				
			
			
	            int thisGameCount=0;
			while(inGame) {
				int ball = 0;
				int out = 0;
				int strike = 0;
			System.out.println("야구게임 시작! 첫번째 숫자를 입력해주세요.");
			String insertedNum1 = scanner.nextLine();
			System.out.println("두번째 숫자를 입력해주세요.");
			String insertedNum2 = scanner.nextLine();
			System.out.println("세번째 숫자를 입력해주세요.");
			String insertedNum3 = scanner.nextLine();
			System.out.println("네번째 숫자를 입력해주세요.");
			String insertedNum4 = scanner.nextLine();
			
			String listOfNums[] = {insertedNum1,insertedNum2,insertedNum3,insertedNum4};
			String originalNums[] = {randomNum1,randomNum2,randomNum3,randomNum4};
			for (int i = 0; i < listOfNums.length; i++) {
				System.out.println("Number" + i +" is " + listOfNums[i]);
			}
			for (int i = 0; i < originalNums.length; i++) {
				System.out.println("originalNums" + i +" is " + originalNums[i]);
			}
			
			for (int i = 0; i < listOfNums.length; i++) {
				boolean isOut = true;
				for (int j = 0; j < originalNums.length; j++) {
					if(i==j&&listOfNums[i].equals(originalNums[j])) {
						strike++;
						isOut=false;
					}else if(listOfNums[i].equals(originalNums[j])) {
						ball++;
						isOut=false;
					}
					
				}
				if(isOut){
					
					out++;
				}
				
			}
			
			System.out.println("Strike: " + strike + " Ball : " + ball + " out : " + out);
			
			totalCount++;
			thisGameCount++;
			if(strike==listOfNums.length) {
				boolean setAnswer = true;
				correctCount++;
				
				System.out.println("축하드립니다 이겼습니다! 숫자 맞추는데 걸린 횟수는 : " + thisGameCount);
				
				while(setAnswer) {
				System.out.println("다시 하시겠습니까? Y/N을 입력해주세요.");
				String answer = scanner.nextLine();
				if(answer .equals("Y")||answer .equals("y")) {
					inGame=false;
					setAnswer =false;
				}else if(answer .equals("N")||answer .equals("n")) {
					contGame=false;
					setAnswer =false;
					inGame=false;
					double a = ((double) totalCount/correctCount)*100;					
					averageCount = Math.round(a)/100.0;
					System.out.println("수고하셨습니다. 게임 총 횟수는 : " + 
					totalCount +", 맞추는데 걸리는 평균 횟수는 : " + averageCount + " 입니다.");
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				}
			}
			
		}
		}
		}
		
	
	

}