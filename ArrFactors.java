package codility;

import java.util.HashSet;
import java.util.Set;

public class ArrFactors {
	
	public int solution(int N) {
        // write your code in Javsa SE 8
		Set<Integer> set=new HashSet<Integer>();
		if(N==0)
			return 0;
		if(N==1)
			return 1;
		if(N==2)
			return 2;
		for(int i=2;i<=(N/2 +1);i++){
			if(N%i == 0){
				set.add(i);
				//count++;
			}
			
		}
		
		return set.size()+2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrFactors a=new ArrFactors();
		System.out.println(a.solution(16));

	}

}
