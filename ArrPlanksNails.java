package codility;

public class ArrPlanksNails {

	public int solution(int[] A, int[] B, int[] C) {
		// write your code in Java SE 8
        int empties = 0;

        for(int i = 0; i < C.length; i ++){

            for(int j = 0; j < A.length; j ++){

                if(A[j] != 0){

                    if(C[i] >= A[j] && C[i] <= B[j]){
                        A[j] = B[j] = 0;
                        empties ++;
                    }
                   
                }

                if(empties == A.length){

                    return i + 1;

                }
            }
        }

        return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrPlanksNails a = new ArrPlanksNails();
		int[] A = { 1, 4, 5, 8 };
		int[] B = { 4, 5, 9, 10 };
		int[] C = { 4, 6, 7, 2, 5, 10 };
		System.out.println(a.solution(A, B, C));

	}

}
