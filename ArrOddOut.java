package codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrOddOut {
	
	 
	public int solution(int[] A) {
        // write your code in Java SE 8
		int odd=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       
        for (int i=0;i<A.length;i++) {
        if(!(map.containsKey(A[i]))){
        	map.put(A[i], 1);
        }else{
        	map.put(A[i], map.get(A[i])+1);
        	        	
        }
        
        /*if(!(map.get(A[i])/2==0)){
        	
        	odd=A[i];
        }
        */
        }
        //Map.Entry<Integer, Integer> entry=
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        System.out.println(set);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        	
        	if(!(entry.getValue()%2==0)){
        		odd=entry.getKey();
        		
        	}else{
        		//System.out.println(entry.getValue());
        		//System.out.println("NO");
        	}
        		
        }
        
       // print(map,A);
        return odd;
    }
	
	void print(HashMap<Integer,Integer> map, int[] A){
		
			for(Map.Entry<Integer, Integer> entry: map.entrySet()){
				System.out.println(entry.getKey() + ": " + entry.getValue());
				
			}
		
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]={9,3,9,3,9,7,9,5,7,5,8};
		ArrOddOut od=new ArrOddOut();
		int n=od.solution(A);
		System.out.println("\n"+n);
		
	}

}
