package codility;

public class ArrSliceThree {
	
	public int solution(int[] A) {
		if(A ==null || A.length<3){
		return 0;
		}
		int[] k1 = new int[A.length+1];
		int[] k2 = new int[A.length+1];

		int max =0;
		k1[0] = 0;
		k1[1] = 0;
		for(int i =2; i <A.length;i++){
		k1[i]= Math.max(k1[i-1]+A[i-1],0);
		//System.out.println("k1 "+i+"****"+k1[i]);
		}
		k2[A.length] = 0;
		k2[A.length-2] = 0;
		for(int i =A.length-3; i >=1;i--){
		k2[i]= Math.max(k2[i+1]+A[i+1],0);
		 //System.out.println("k2 "+i+"---"+k2[i]);
		}

		for(int i =1; i<A.length-1;i++){
		max = Math.max(k1[i]+k2[i], max);
		}
		return max;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrSliceThree a=new ArrSliceThree();
		int[] A = { 3,2,6,-1,4,5,-1,2 };
		System.out.println(a.solution(A));

	}

}
