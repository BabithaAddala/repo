package codility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrLeaderOcc {
	
	public int solution(int[] A){
		if(A.length==0)
			return -1;
		if(A.length==1)
			return 0;
		int max=0,index=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<A.length;i++){
			set.add(A[i]);
			if(!map.containsKey(A[i])){
				map.put(A[i], 1);
			}else{
				map.put(A[i], map.get(A[i])+1);
				if(max<A[i]){
					max=A[i];
					index=i;
				}
				
			}
		}
		
		
		if(max==0)
			return -1;
		else{
			if(map.get(max)>(A.length/2)){
				
			return index;
			}
			
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={3,4,1,2,3,-1,3,3};
		ArrLeaderOcc a=new ArrLeaderOcc();
		System.out.println(a.solution(A));
		
	}

}
