package codility;

public class ArrSliceSum {

	void print(int[] A) {
		int[] b = new int[A.length];
		for (int i = 1; i < A.length; i++) {

			b[i] = Math.max(A[i], A[i - 1]);
			System.out.println(b[i]);
		}
	}

	public int solution(int[] A) {

		if (A.length == 1)
			return A[0];
		if (A.length == 2)
			return A[0] + A[1];
		float sum = A[0], max = 0;
		;

		for (int i = 0; i < A.length; i++) {
			sum = A[i];
			for (int j = (i + 1); j < A.length; j++) {
				do {
					sum += A[j];
				} while (i > j);

				// System.out.println("SSUMM:::"+sum+ "i" +i+"j" +j);

				if (max < sum) {
					max = sum;
				}
				// System.out.println("MAXX SUMMM::"+max);
			}
		}

		return (int) max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrSliceSum a = new ArrSliceSum();
		int[] A = { 3,2,6,-1,4,5,-1,2 };
		// System.out.println(a.solution(A));
		a.print(A);

	}

}
