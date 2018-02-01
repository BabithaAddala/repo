package codility;
import java.util.*;

public class ArrBuilBlocks {
	 
	    public int solution(int[] H) {
	        int cuts = 0;
	        Stack st = new Stack();

	        for (int h : H) {
	            while (!st.isEmpty() && ((int) st.peek()) > h) {
	                st.pop();
	            }
	            if (st.isEmpty() || ((int) st.peek()) < h) {
	                st.push(h);
	                cuts++;
	            }
	        }

	        return cuts;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrBuilBlocks arr=new ArrBuilBlocks();
		int[] H={8,8,5,7,9,8,7,4,8};
		System.out.println(arr.solution(H));

	}

}
