package codility;

import java.util.HashMap;
import java.util.Map;

//not 100% codility!

public class ArrLeader {
	
	public int solution(int[] A) {
		int count1=0,count2=0;
        // write your code in Java SE 8
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int index=0;
		int[] b=new int[A.length];
		int j=0,leader=A[0],max=1;
		for(int i=0;i<A.length;i++){
			if(!map.containsKey(A[i])){
				map.put(A[i], 1);
			}else{
				map.put(A[i], map.get(A[i])+1); 
				b[j]=A[i];
				if(max<map.get(A[i])){
					max=map.get(A[i]);
					
					if(i>(A.length/2))
						leader=A[i];
					
				}
			}
			
		}
		
			
		for(int i=0;i<A.length;i++){
			
			if((i<(A.length/2))&&(A[i]==leader)){
						count1++;
						index=i;
						//System.out.println("count11:::"+count1);
				
			}
			if(i>=(A.length/2)&&(A[i]==leader)){
				count2++;
				//System.out.println("count22:::"+count2);
			}
			
			if(count1==count2){
				return index;
			}
		}
			
		
		return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrLeader a=new ArrLeader();
		int[] A={4,3,4,4,4,4,4,2};
		System.out.println(a.solution(A));
		

	}

}
