package codility;


public class RecPerm {
	public int solution(int n){
		int b=n;
		float p=0;
		for(int i=0;i<n;i++){
			
			if(b*(i+1)==n){
				p=2*((i+1)+b);
			}
			
			if(n%(i+1)==0){
				b=(i+1);
			}
			
		}
		
		return (int)p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=30;
		RecPerm a=new RecPerm();
		System.out.println(a.solution(N));

	}

}
