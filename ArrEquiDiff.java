package codility;

public class ArrEquiDiff {

	public int solution(int[] A) {
		long leftsum=0,rightsum = 0;
		long min=0;
		/*int j=0,min=A[0];
		long sum=0;
		for(int i=0;i<A.length;i++){
			if(j<A.length){
			j=i+1;
			leftsum+=A[i];
			leftsum=Math.abs(leftsum);
			//System.out.println(leftsum+":::leftsum");
			rightsum=0;
			for(int k=j;k<A.length;k++){
				
				rightsum+=A[k];
				//System.out.println("rightsum:::"+rightsum);
			}
			rightsum=Math.abs(rightsum);
			sum=Math.abs(rightsum-leftsum);
			//System.out.println("SUM::::"+sum);
			//System.out.println("min:::"+min);
			if(sum<min){
				min=(int)sum;
				min=Math.abs(min);
			}
			}
			
		}

		return min;*/
		leftsum=A[0];
		for(int i=1;i<A.length;i++){
			
			rightsum+=A[i];
		}
		min=Math.abs(leftsum-rightsum);
		for(int i=1;i<A.length;i++){
			
			leftsum+=A[i];
			rightsum-=A[i];
			if(Math.abs(leftsum-rightsum)<min){
				min=Math.abs(leftsum-rightsum);
			}
		}
		
		return (int)min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrEquiDiff eq = new ArrEquiDiff();
		int[] A = { 3, 1, 2, 4, 2,6,2,-1 };
		int s=eq.solution(A);
		System.out.println(s);
	}

}
