package codility;

public class ArrDoubSlice {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int[] fromLeft = new int[A.length];
        int[] fromRight = new int[A.length];
        int max = 0;
        for (int i = 2; i < A.length; i++) {
            fromLeft[i] = Math.max(0, fromLeft[i-1] + A[i-1]);
            System.out.println("LEFT Array::: "+ fromLeft[i]);
        } 
        for (int i = A.length - 3; i >= 0; i--) {
            fromRight[i] = Math.max(0, fromRight[i+1] + A[i+1]);
            System.out.println("Rightt Array::: "+ fromRight[i]+"iii"+i);
        }
        for (int i = 1; i < A.length - 1; i++) {
            max = Math.max(max, fromLeft[i] + fromRight[i]);
        } 
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrDoubSlice a=new ArrDoubSlice();
		int[] A={3,2,6,-1,4,5,-1,2};
		System.out.println(a.solution(A));

	}

}
