package codility;

public class FindPrimes {
	
	public void primes(int n){
		int flag=1,temp=1;
		while(n%2==0){
			n/=2;
			flag=0;
		}
		if (flag==0)
			System.out.println("2");
		for(int i=3;i<=Math.sqrt(n);i+=2){
			//System.out.println(Math.sqrt(n));
			while(n%i==0){
				
				temp=0;
				
				n/=i;
			}
			if(temp==0)
				System.out.println(i);
		}
		if(n>2)
			System.out.println(n);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		FindPrimes f=new FindPrimes();
		f.primes(n);

	}

}
