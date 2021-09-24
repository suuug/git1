package Hi;

import java.util.Arrays;

public class Rjdjr {

	public static void main(String[] args) {
		// 1~10으로 이루어진 500개의 랜덤함수의 각각 발생 횟수
		
//		int[] count = new int[10];
//		for(int i = 0; i < count.length; i++) {
//			int random = (int)(Math.random()*10)+1;
//			count[random - 1]++;
//		}
//         for(int i = 0; i < count.length; i++) {
//        	 System.out.println(i+1+"의 발생 횟수는"+count[i]);
//         }
         
         // 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요
         
			/*
			 * int[] coin = {500,100,50,10}; int money = (int)(Math.random()*500)*10;
			 * System.out.println("거스름돈: "+ money);
			 * 
			 * for(int i = 0; i < coin.length; i++) { int count = money / coin[i]; money %=
			 * coin[i]; System.out.println(coin[i]+"원: "+count+"개"); }
			 */
		
//		1~5의 숫자가 발생된 횟수만큼 *을 사용해 그래프를 그려주세요
//		  1:***3 //일단 숫자부터 세야댐
//		  2:****4
//		  3:**2
//		  4:*****5
//		  5:******6
		
		int[] arr = new int [20];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int [] count = new int[5];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]-1]++;
		}
		for(int i = 0; i < count.length; i++) {
			System.out.print(i+1+":");
		for(int j = 0; j < count[i]; j++) {
			System.out.print("*");
		}
		System.out.println(" "+ count[i]);
	}
	}
}
