package codility;


public class ArrCountNonDivisible {

	public int[] solution(int[] A) {
		// write your code in Java SE 8
		int j = 1;
		int[] count=new int[A.length];
		for (int i = 0; i < A.length; i++) {
				while (j<A.length) {
					if(A[i] % A[j] == 0){
						j++;
					}
					else{
					count[i]++; 
					
					j++;
					}
				}
				j=0;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrCountNonDivisible a = new ArrCountNonDivisible();
		int[] A = {3,1,2,3,4,6};
		int[] R=a.solution(A);
		for(int i=0;i<R.length;i++){
			System.out.print(R[i]+" ");
			
		}

	}

}
