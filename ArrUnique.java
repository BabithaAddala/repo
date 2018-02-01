package codility;

import java.util.Arrays;

public class ArrUnique {
	
	public int solution(int[] A){
		/*HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	       int[] b=new int[A.length];
        for (int i=0;i<A.length;i++) {
        if(!(map.containsKey(A[i]))){
        	map.put(i, A[i]);
        	
        }else{
        }
	}
        return map.size();*/
		Arrays.sort(A);
		int dup=0;
		for(int i=0;i<A.length-1;i++){
			if(A[i]==A[i+1])
				dup++;
			
		}
		
		return A.length-dup;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2,1,3,3};
		ArrUnique a=new ArrUnique();
		System.out.println(a.solution(A));

	}

}
