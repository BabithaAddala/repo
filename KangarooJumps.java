package codility;

public class KangarooJumps {
	
	String solution(int[] A){
		int sum1=A[0],sum2=A[2];
		boolean flag=false;
		
		while(sum1!=sum2){
			
			sum1+=A[1];
			sum2+=A[3];
			//System.out.println(sum1+" "+sum2);
			flag=true;
			
			if((sum1>10000) || (sum2>10000)){
				flag=false;
				break;
			}
			
			
		}
		if(flag)
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KangarooJumps k=new KangarooJumps();
		int[] A={0,3,3,2};
		System.out.println(k.solution(A));

	}

}
