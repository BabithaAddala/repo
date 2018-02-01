package codility;

public class Staircase {
	
	static void solution(int num ){
		
		for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
                System.out.print(i<num-j?" ":"#");
            }
            System.out.println("");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		solution(6);
	}

}
