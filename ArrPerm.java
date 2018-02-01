package codility;

import java.util.Arrays;

public class ArrPerm {

	public int perm(int[] A){
		int visited=0;
		
		if((A.length==1)){
			visited= 0;
		}
		
		Arrays.sort(A);
		for(int i=0;i<A.length-1;i++){
			//System.out.print(A[i]);
			if(A[i+1]==A[i]+1){
				visited=1;
			}else{
				visited= (A[i+1]-1);
				break;
			}
		}
		return visited;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={5,1,4,2};
		ArrPerm a=new ArrPerm();
		int p=a.perm(A);
		System.out.println(p);

	}

}
