package codility;

public class Chocolates {

	public int solution(int N, int M) {
		// write your code in Java SE 8
		int count = 1;
		int j = 0;
		if (N == M) {
			return 1;
		}

		while ((j + M) % N != 0) {
			j += M;
			count++;
			// System.out.println(j);
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chocolates c = new Chocolates();
		int N = 10, M = 4;
		// c.solution(N, M);
		System.out.println(c.solution(N, M));
	}

}
