package codility;

import java.util.LinkedList;

public class ArrFish {
	
	public int solution(int[] A,int[] B){
		int count=0;
		LinkedList<Integer> st=new LinkedList<Integer>();
		for(int i=0;i<(A.length-1);i++){
			if(B[i]==1){
				if((A[i]>A[i+1]) && (B[i]!=B[i+1])){
					A[i+1]=A[i];
					B[i+1]=B[i];
					st.push(A[i]);
				}
				
			}else{
				count++;
			}
			
		}
		
		
		return A.length-(st.size()+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={4,3,2,1,5};
		int[] B={0,1,0,0,0};
		ArrFish f=new  ArrFish();
		System.out.println(f.solution(A,B));

	}

}
