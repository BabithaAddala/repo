package codility;


public class ArrMissElement {
	/*public int solution(int[] A) {
		int miss = 0;
		int n=A.length-1;
		if (A.length > 1) {
			Arrays.sort(A);

			for (int i = 0; i < A.length - 1; i++) {

				if (A[i + 1] != (A[i] + 1)) {
					miss = A[i] + 1;
				}else if(A[0]>1){
					miss=A[0]-1;
				}else
					miss=A[n]+1;
			}
		} else if(A.length==1){
			
			if(A[0]>1)
				miss=A[0]-1;
			else
				miss=A[0]+1;
		}else
			return 1;

		return miss;
		
}*/
		//For numbers from 1 to N
		 public int solution(int[] A) {

		        long N = A.length + 1;
		        long total = N * (N + 1) / 2;
		        for (int i : A) {

		            total -= i;
		        }

		        return (int)total;
		    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrMissElement m = new ArrMissElement();
		int A[] = {1,2,4,5};
		int miss = m.solution(A);
		System.out.println("miss num  " + miss);

	}

}
