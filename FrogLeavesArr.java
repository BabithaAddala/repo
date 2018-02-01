package codility;

import java.util.HashMap;

public class FrogLeavesArr {
	
	public int frog(int[] A,int X){
		int max=X+1;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		if(A.length>=max){
		for(int i=0;i<A.length;i++){
			if(!map.containsKey(A[i])){
				map.put(A[i], 1);
			}else{
				if((A[i]==max)){
					return max;
				}else{
				map.put(A[i], map.get(A[i])+1);
				}
			}
			
		}
		if(!map.containsKey(max-1)){
			return -1;
		}
		}else{
			return 0;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,6,2,4,7,1,3,5};
		FrogLeavesArr fr=new FrogLeavesArr();
		int p=fr.frog(A,4);
		System.out.println(p);

	}

}
