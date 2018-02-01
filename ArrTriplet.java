package codility;

import java.util.Arrays;

public class ArrTriplet {
	public int solution(int[] A){
		
		if(A.length<3){
			return 0;
		}
		if(A.length==3)
			return A[0]*A[1]*A[2];
		Arrays.sort(A);
		//for(int i:A)
			//System.out.println(i);
		int b=0;
		if((A[0]<0) && (A[1]<0)){
				if((A[0]*A[1]) > (A[A.length-2]*A[A.length-3])){
				b= A[A.length-1]*A[A.length-2]*A[A.length-3];
				return b;
				
			}
			
				else{
					b= A[0]*A[1]*A[A.length-1];;
			}
		}
		if(A[A.length-2]>0 && A[A.length-3]>0){
			b= A[A.length-1]*A[A.length-2]*A[A.length-3];
			
			return b;
		}
		if(A[A.length-2]<0 && A[A.length-3]<0){
			
b= A[A.length-1]*A[A.length-2]*A[A.length-3];
			
			return b;
		}
		if(A[A.length-1]<0){
			b=A[A.length-1]*A[A.length-2]*A[A.length-3];
			return b;
		}
		
		return b;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={-3,1,-2,2,5,6};
		ArrTriplet a=new ArrTriplet();
		System.out.println(a.solution(A));

	}

}
