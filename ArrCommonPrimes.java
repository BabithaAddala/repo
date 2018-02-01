package codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrCommonPrimes {
	
	public int solution(int[] A,int[] B){
		List<HashMap> list= new ArrayList<HashMap>();
		HashMap<Integer,Integer> mapA=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mapB=new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<A.length;i++){
			mapA=primes(A[i], i);
			mapB=primes(B[i], i);
			list.add(mapA);
			list.add(mapB);
			

			/*Set<Integer> set1=mapA.keySet();
			Set<Integer> set2=mapB.keySet();
			for(Integer ii:set1){
				System.out.print(ii+" ");
			}
			System.out.println("A["+i+"]"+A[i]);
			
			for(Integer ii:set2){
				System.out.print(ii+" ");
			}
			System.out.println("B["+i+"]"+B[i]);*/
			
			if(mapA.equals(mapB)){
				count++;
			}
			
		}
		
		//System.out.println(count+"count");
		
		return count;
	}
	
	public HashMap<Integer, Integer> primes(int n,int index){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int flag=1,temp=1;
		while(n%2==0){
			n/=2;
			flag=0;
		}
		if (flag==0)
			map.put(2, index);
		for(int i=3;i<=Math.sqrt(n);i+=2){
			while(n%i==0){
				temp=0;
				
				n/=i;
			}
			if(temp==0){
				map.put(i, index);
			}
		}
		if(n>2){
			map.put(n, index);
		}
				
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrCommonPrimes a=new ArrCommonPrimes();
		int[] A={15,10,30};
		int[] B={75,10,6};
		System.out.println(a.solution(A,B));

	}

}
