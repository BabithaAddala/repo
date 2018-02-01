package codility;

public class ArrMinAbsVal {
	public int solution(int[] A) {
		int min=Math.abs(A[0]+A[0]);
		/*for(int i=0;i<A.length;i++){
			for(int j=0;j<=i;j++){
				if(Math.abs(A[i]+A[j])<min){
					min=Math.abs(A[i]+A[j]);
				}
				
			}
		}*/
		

		return min;
    }

	public static void main(String[] args) {
		ArrMinAbsVal a=new ArrMinAbsVal();
		int[] A={-8,4,5,-10,3};
		System.out.println(a.solution(A));
		

	}

}
