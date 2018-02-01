package codility;

import java.util.ArrayList;

//partial working
public class ArrPeaksDiv {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length<3)
			return 0;
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<A.length-1;i++){
			
			if((A[i-1]<A[i]) && (A[i]>A[i+1])){
				
				list.add(i);
				//System.out.println(i);
			}
			
		}
		
		return list.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrPeaksDiv a=new ArrPeaksDiv();
		int[] A={1,2,3,4,3,4,1,2,3,4,6,2};
		System.out.println(a.solution(A));

	}

}
