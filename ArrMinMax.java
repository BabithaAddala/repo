package codility;


//check again
public class ArrMinMax {
	 public int solution(int K, int M, int[] A) {
	        // write your code in Java SE 8
		 int max=0,min=0;
		 
		 for(int i=0;i<A.length;i++){
			 max+=A[i];
			// System.out.print("MAXX:: "+max);
			 min=Math.max(min, A[i]);
			 //System.out.println();
			 //System.out.print("MINN::"+min);
		 } 
			 int res=max;
			 while(min<=max){
				 
				 int mid=(min+max)/2;
				// System.out.println("MIDD::"+mid);
				 if(divide(mid,K-1,A)){
					 max=mid-1;
					// System.out.println("MAXX::: "+max);
					 res=mid;
					 //System.out.println("RESSS::: "+res);
					 
				 }else{
					 min=mid+1;
				 }
				 
			 }
			 return res;
		 }
		 
		 public boolean divide(int mid,int K,int[] A){
			 int sum=0;
			 for(int i=0;i<A.length;i++){
				 sum+=A[i];
				 //System.out.print("SUM:::	 "+sum+" ");
				 if(sum>mid){
					 sum=A[i];
					// System.out.print("A{I}:::"+A[i]+" ");
					 K--;
				 }
				 if(K<0)
					 return false;
			 }
			 return true;
		 }
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrMinMax a=new ArrMinMax();
		int[] A={2,1,5,1,2,2,2};
		int K=3,M=5;
		System.out.println(a.solution(K,M,A));

	}

}
