package codility;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FibFrogJumps {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		List<Integer> list=new LinkedList<Integer>();
		int count=0;
		int f1=0;
		int f2=1;
		int f3=f1+f2;
		list.add(f1);
		list.add(f2);
		list.add(f3);
		for(int i=3;f3<10000;i++){
			f1=f2;
			f2=f3;
			f3=f1+f2;
			list.add(f3);
			System.out.print(" "+f3);
		}
		int len=0;
		for(int i=0;i<A.length;i++){
			
			if(A[i]==1){
				//System.out.println(len+1);
				if(list.contains(len+1)){
					len=0;
					count++;
				//	System.out.println(len+" count::"+count);
				}else
					len++;
				
			}else{
				len++;
				if((i==A.length-1)&&(list.contains(len+1))){
					count++;
				}
				
			}
		}
		if(count>0)
		return count;
		else
			return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibFrogJumps f=new FibFrogJumps();
		int[] A={0,0,0,1,1,0,1,0,0,0,0};
		System.out.println(f.solution(A));
	}

}
