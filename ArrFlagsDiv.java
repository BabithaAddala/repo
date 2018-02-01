package codility;

import java.util.ArrayList;

public class ArrFlagsDiv {
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
		 int flags=0;
		 if(A.length<3)
				return 0;
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			int[] b=new int[A.length];
			int j=0;
			for(int i=1;i<A.length-1;i++){
				
				if((A[i-1]<A[i]) && (A[i]>A[i+1])){
					
					b[j]=i;
					flags++;
					//System.out.println(b[j]);
					j++;
				}
				
			}
			if(flags!=0){
			//System.out.println(flags);
			for(int i=0;i<flags;i++){
				int k=1;
				while(k<=flags){
					
					if((b[k]-b[i])>=flags){
						if(!list.contains(b[k]))
						list.add(b[k]);
						else
							break;
					}
					k++;
				}
				
			}
			}
			else
				return 0;
		 
		 return list.size()+1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrFlagsDiv a =new ArrFlagsDiv();
		int[] A={1,5,6};
		//a.solution(A);
		System.out.println(a.solution(A));
	}

}
