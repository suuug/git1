package Hi;

import java.util.Arrays;

public class Dooongdodo {

	public static void main(String[] args) {
		// 석차구하기
		 int[]arr = new int [10];
			
			for(int i =0; i < arr.length; i++){
				arr[i]=(int)(Math.random()*100)+1;
			}
			System.out.println(Arrays.toString(arr)); //랜덤 값으로 정렬
		    
		    int rank[] = new int[arr.length];
		    for(int i = 0; i < rank.length; i++) {
		    	rank[i]=1;
		    }
		    
		    for(int i = 0; i < arr.length; i++) {
		    	for(int j = 0; j < arr.length; j++) {
		    		if(arr[i]<arr[j]) {
		    			rank[i]++;
		    		}
		    	}
		    }
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+":"+rank[i]+"등");
			}
			
			
	}

}
