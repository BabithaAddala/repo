package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SampleTest {

	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	HashSet<Integer> pset = new HashSet<>();
	HashSet<Integer> nset = new HashSet<>();

	public int solution(int[] A) {
		int flag = 0, temp = 0,in;
		//Arrays.toString(A);
		
		for (int i = 0; i < A.length-1; i++) {
			temp=0;
			if(A[i]==1){
				break;
			}else
				temp=1;
		}
		if(temp==1){
			System.out.println("dkjfkjr");
			return 1;
		}

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > 0) {
				if (A[i] + 1 == A[i + 1]) {
					flag = 1;
				} else {
					flag = 0;
					//System.out.println("hellooo");
					return A[i] + 1;
				}
			}
		}
		if (flag == 1)
			return A[A.length - 1] + 1;

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleTest s = new SampleTest();
		int[] A = { 1,-1, 2,3, 4,5,-2 };
		System.out.println(s.solution(A));
	}

}
