package codility;

public class ArrSlice {
	
	public int minSlice(int[] a,int n){
		float min=(a[0]+a[1])/2;
		float avg=0;
		int index=0;
				for(int i=0;i<n-1;i++){
					for(int j=i+1;j<n;j++){
						
						avg=avg(i,j,a);
						if(avg<min){
							min=avg;
							System.out.println("min:::"+min);
							index=i;
							//System.out.println("index::iffff"+index);
							
						}
							else if(avg==min){
								if(i<index){
									index=i;
									//System.out.println("index::"+index);
								}
							}
						 
					}
				}
				
		
		return index;
	}
	
	public float avg(int i,int j,int[] b){
		int n=(j-i)+1,min=0;
		float avg=0;
		for(int k=i;k<=j;k++){
			
			min+=b[k];
		}
		avg=min/n;
		//System.out.println("AVGG:::"+i+" & "+j+":::"+avg);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={4,2,2,5,1,5,8};
		ArrSlice a=new ArrSlice();
		int n=A.length;
		int p=a.minSlice(A,n);
		System.out.println(p);

	}

}
