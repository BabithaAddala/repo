package codility;

public class FrogJump {
	
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		//int count=0;
        long count=0;
       /* if(D<(X+Y)){
        	for(int i=X;i<=Y;i=i+D){
        		//jumps=jumps+D;
        		count++;
        	}
        }else if(X==0){
        	return 0;
        }
        else{  
                return 1;
        }*/
		
		 if(X==0){
	        	return 0;
	        }
		 else if(D>(X+Y)){
			 return 1;
		 }
		 else
			 {
				 count= (Y-X)/D + ((Y-X)%D==0 ? 0:1); 
				 
				 //count=count+1;
			 }
		
        return (int)count;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrogJump f=new FrogJump();
		int c=f.solution(10, 85, 30);
		System.out.println(c);

	}

}
