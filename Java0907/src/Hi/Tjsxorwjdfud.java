package Hi;

import java.util.Arrays;

public class Tjsxorwjdfud {

	public static void main(String[] args) {
		// ��������: ���� ���� ���ڸ� ã�Ƽ� ������ ������ ���
//        i,j
//        0,1  0,2  0,3  0,4  0,5  0,6  0,7  0,8  0,9
//	      1,2  1,3  1,4  1,5  1,6  1,7  1,8  1,9
//	      2,3  2,4  2,5  2,6  2,7  2,8  2,9
//	      3,4  3,5  3,6  3,7  3,8  3,9
//	      4,5  4,6  4,7  4,8  4,9
//	      5,6  5,7  5,8  5,9
//	      6,7  6,8  6,9
//	      7,8  7,9
//	      8,9
		
		    int[]arr = new int [10];
			
		    //���� �迭 ����
			for(int i =0; i < arr.length; i++){
				arr[i]=(int)(Math.random()*100)+1;
			}
			System.out.println(Arrays.toString(arr));
			
			//��������
			for(int i = 0; i < arr.length; i++) {
				int min = i;
			   for(int j = i + 1; j < arr.length; j++) {
				   if(arr[min]>arr[j]) {
					   min = j;
					   
				}
			}
			   int temp = arr[min];
			   arr[min] = arr[i];
			   arr[i] = temp; 
		}      
		      
		   System.out.println(Arrays.toString(arr));
		   
		   //���� ����
		   for(int j = 1; j < arr.length; j++) {
			   for(int i = 0; i < arr.length-j; i++) {
				   if(arr[i]>arr[i+1]) {
					   int temp = arr[i];
					   arr[i] = arr[i+1];
					   arr[i+1] = temp;
				   }
			   }
		   }
		  
		   System.out.println(Arrays.toString(arr)); 
		   
		   //���� ����
//		     *j,i
//			 *0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  8,9 //�ѹٲ� ���� ���� �ڸ��� �ȹٲٸ� ���� ����
//			 *0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  //ù�ڸ��� i �� �ƴ϶� j ��
//			 *0,1  1,2  2,3  3,4  4,5  5,6  6,7  
//			 *0,1  1,2  2,3  3,4  4,5  5,6 
//			 *0,1  1,2  2,3  3,4  4,5 
//			 *0,1  1,2  2,3  3,4  
//			 *0,1  1,2  2,3  
//			 *0,1  1,2 
//			 *0,1 
//			
		   for(int i = 1; i < arr.length; i++) {
			   boolean flag = false; 
			   for(int j = 0; j < arr.length-i; j++) { 
				   if(arr[j]>arr[j+1]) {
					   int temp = arr[j];
					   arr[j] = arr[j+1];
					   arr[j+1] = temp;   
					   flag = true; // �տ� �ִ� ���� �ڿ� �ִ� ������ Ŭ ���
				   }
			   }
			   if(flag == false) { // �տ� �ִ� ���� �ڿ� �ִ� ������ ū ��찡 ���� ��� �����ͼ�
				   break;   // ����
			   }
		   }
		   System.out.println(Arrays.toString(arr)); 
		     
		    
			}

	}

