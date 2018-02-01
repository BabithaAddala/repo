package codility;

import java.util.Scanner;


//not working..!!!
public class CoinsChange {

	public long getWays(long n, long[] c) {
		// Complete this function
		long count=0;
		int j=1;
		if ((n == 0) || (c.length == 0))
			return 0;
		for (int i = 0; i < c.length; i++) {

			while(j<c.length){
				System.out.println(c[i]+"   "+c[j]);
				if(c[i]+c[j]==n){
					count++;
					System.out.println(count+"::count");
				}
				long d=n%c[i];
				if(d+c[j]==n){
					System.out.println(count+"_+++++++++::count");
					count++;
				}
				
				j++;
					
			}
			
			if((c[i]==n)||(c[i]==1))
				count++;
			if((c[i]<n)&&(c[i]>1)){
				if(n%c[i]==0)
					count++;
				
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 4;
		int m = 3;
		// long[] c = new long[m];
		long[] c = { 1, 2, 3 };
		// Print the number of ways of making change for 'n' units using coins
		// having the values given by 'c'
		CoinsChange cc=new CoinsChange();
		long ways=cc.getWays(n, c);
		System.out.println(ways+"???");
	}

}
