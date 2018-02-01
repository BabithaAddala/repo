package codility;

import java.util.HashMap;
//incomplete
public class ArrSemiPrimes {

	public int[] solution(int N, int[] P, int[] Q) {
		// write your code in Java SE 8
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int j = 0,k=2;
		// System.out.println(Q[0]);
		for (int i = 0; i < P.length; i++) {
			System.out.println(P[j] + " " + Q[j]);
			while (P[j] <= Q[j]) {
				map.put(P[j], i);
				System.out.print(" " + P[j]);
				
				P[j]++;
			}
			j++;
			System.out.println();

		}
		System.out.println((Math.ceil(Math.sqrt(10))));
		
		return null;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] P = { 1, 4, 16 };
		int[] Q = { 26, 10, 20 };
		int N = 26;
		ArrSemiPrimes a = new ArrSemiPrimes();
		a.solution(N, P, Q);

	}

}
