package codility;

public class Divisible {

	public int divide(int A,int B,int K) {
		/*long count=0;
		if((A==0)||(B==0)||(K==1)){
			count=0;
			return (int) count;
		}else if((B==1)||(K==1)){
			count=1;
			return (int) count;
		}else 
			
		for(int i=A;i<=B;i++){
			if(i%K==0){
				count++;
			}
		}
			
		
		return (int)count;*/
		
		if((A==0)||(B==0)||(K==1)){
			return 0;
		}else if((B==1)||(K==1)){
			return 1;
		}else 
		
		if(B < K) {
			return 0;
		}
		
		int num1 = A / K;
		if(A % K != 0) {
			num1++;
		}
		
		int num2 = B / K;
		
		return num2 - num1 + 1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible d = new Divisible();
		int A = 6, B = 12, K = 4;

		int p = d.divide(A, B, K);
		System.out.println(p);
	}

}
