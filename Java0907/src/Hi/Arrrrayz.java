package Hi;

import java.util.Arrays;

public class Arrrrayz {

	public static void main(String[] args) {
		//�迭�� ��� �ε����� 1~100������ ������ ����
	/*	
     int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
				
		System.out.println(Arrays.toString(arr));
		*/
		//�迭�� ����� ��� ���� �հ�� ����� ������ּ���
		
		/*int sum = 0;
		for(int i=0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		System.out.println(" sum: "+sum+" avg: "+avg);
		*/
		//�迭�� ����� ���� �� �ּҰ��� �ִ밪�� ������ּ���
		
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
		 * System.out.println("�ּҰ� : "+ min +" �ִ밪 : "+ max);
		 * 
		 * 
		 * for(int i = 0; i < shuffle.length * 10; i++){ 
		 * int random = (int)(Math.random() * shuffle.length);
		 */
			  
			  //�����ϰ� �̾Ƽ� 0��° �迭�� �ٲٱ�
			  
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
			  
		
		//1~10 ������ �������� 500�� �����ϰ�, (1���� 10���� ���ڰ� ������ Ƚ���� ���
		
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
		
		System.out.println("1�ǰ���: "+num1);
		System.out.println("2�ǰ���: "+num2);
		System.out.println("3�ǰ���: "+num3);
		System.out.println("4�ǰ���: "+num4);
		System.out.println("5�ǰ���: "+num5);
		System.out.println("6�ǰ���: "+num6);
		System.out.println("7�ǰ���: "+num7);
		System.out.println("8�ǰ���: "+num8);
		System.out.println("9�ǰ���: "+num9);
		System.out.println("10�ǰ���: "+num10);
		
		
	}

}
