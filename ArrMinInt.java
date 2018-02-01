package codility;

import java.util.Arrays;

public class ArrMinInt {
	
	public int minInt(int[] A){
		int min=1;
		if((A.length==1)&&(A[0]!=0)){
			if(A[0]>1){
				min=A[0]-1;
			}else
			min= A[0]+1;
		}
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if(A[i]==min){
				min++;
			}
		}
		
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2};
		ArrMinInt a=new ArrMinInt();
		int p=a.minInt(A);
		System.out.println(p);

	}

}
