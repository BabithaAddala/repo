package codility;

public class ArrRotation {
	
	public int[] solution(int[] A,int k){
		int j=0;
		int[] b=new int[A.length];
		if((A.length>0)){
			if(A.length==1){
				return A;
			}else{
			k=k%(A.length);
			
			if((k<A.length)){
				for(int i=0;i<A.length;i++){
					j=i+k;
					if((i+k)<A.length){
						b[j]=A[i];
					}else if(j==A.length){
						j=j-A.length;
						b[j]=A[i];
						
					}else{
						j=j-A.length;
						//System.out.println("JJJ"+j);
						b[j]=A[i];
					}
					
				}
				return b;
				}
				else if(k==A.length)
				return A;
				else{
					
					return b;
					
				}
			}
		}
		else
			return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={};
		ArrRotation arr=new ArrRotation();
		int[] b=arr.solution(A,3);
		for(int i=0;i<A.length;i++){
			
			System.out.print("  " +b[i]);
		}
		
	}

}
