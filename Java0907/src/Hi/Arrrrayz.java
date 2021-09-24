package Hi;

import java.util.Arrays;

public class Arrrrayz {

	public static void main(String[] args) {
		//배열의 모든 인덱스에 1~100사이의 랜덤값 저장
	/*	
     int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
				
		System.out.println(Arrays.toString(arr));
		*/
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요
		
		/*int sum = 0;
		for(int i=0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		System.out.println(" sum: "+sum+" avg: "+avg);
		*/
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요
		
		/*
		 * int min = arr[0];
		 * int max = arr[0];
		 * 
		 * for(int i=0; i<arr.length;i++) {
		 *  if(min>arr[i]) { 
		 *  min = arr[i];
		 * }if(arr[i]>max) { 
		 *  max = arr[i]; 
		 * } 
		 * }
		 * System.out.println("최소값 : "+ min +" 최대값 : "+ max);
		 * 
		 * 
		 * for(int i = 0; i < shuffle.length * 10; i++){ 
		 * int random = (int)(Math.random() * shuffle.length);
		 */
			  
			  //랜덤하게 뽑아서 0번째 배열과 바꾸기
			  
				/*
				 * int shuffle[] = new int[10]; for(int i = 0; i < shuffle.length; i++) {
				 * shuffle[i] = (int)(Math.random()*100)+1; }
				 * System.out.println(Arrays.toString(shuffle));
				 * 
				 * 
				 * for(int i = 0; i < shuffle.length; i++) { int
				 * random=(int)(Math.random()*shuffle.length);
				 * 
				 * int temp = shuffle[0]; shuffle[0] = shuffle[random]; shuffle[random] = temp;
				 * } System.out.println(Arrays.toString(shuffle));
				 */
			  
		
		//1~10 사이의 랜덤값을 500번 생성하고, (1부터 10각각 숫자가 생성된 횟수를 출력
		
		int random[] = new int[10];
		int score[] = {1,2,3,4,5,6,7,8,9,10};
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int num7 = 0;
		int num8 = 0;
		int num9 = 0;
		int num10 = 0;
		
		for(int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random()*10)+1;
			
			if(score[0]==random[i]) {
				num1++;
			}else if(score[1]==random[i]) {
				num2++;
			}else if(score[2]==random[i]) {
				num3++;
			}else if(score[3]==random[i]) {
				num4++;
			}else if(score[4]==random[i]) {
				num5++;
			}else if(score[5]==random[i]) {
				num6++;
			}else if(score[6]==random[i]) {
				num7++;
			}else if(score[7]==random[i]) {
				num8++;
			}else if(score[8]==random[i]) {
				num9++;
			}else {
				num10++;
			}
	
			
		}
		System.out.println(Arrays.toString(random));
		
		System.out.println("1의갯수: "+num1);
		System.out.println("2의갯수: "+num2);
		System.out.println("3의갯수: "+num3);
		System.out.println("4의갯수: "+num4);
		System.out.println("5의갯수: "+num5);
		System.out.println("6의갯수: "+num6);
		System.out.println("7의갯수: "+num7);
		System.out.println("8의갯수: "+num8);
		System.out.println("9의갯수: "+num9);
		System.out.println("10의갯수: "+num10);
		
		
	}

}
