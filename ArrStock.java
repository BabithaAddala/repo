package codility;

public class ArrStock {

	public int solution(int[] A){
		float profit=0;
		if((A.length==0) || (A.length==1))
			return 0;
		for(int i=0;i<A.length-1;i++){
			for(int j=i+1;j<A.length;j++){
				
				if(profit<(A[j]-A[i]))
				
					profit=A[j]-A[i];
				
			}
		}
		
		
		
		return (int)profit;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrStock a=new ArrStock();
		int[] A={23171,21011,21123,21366,21013,21367};
		System.out.println(a.solution(A));

	}

}
