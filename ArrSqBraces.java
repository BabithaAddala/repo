package codility;

import java.util.LinkedList;

public class ArrSqBraces {
	
	 public int solution(String S) {
		 
		 LinkedList<Character> stack=new LinkedList<Character>();
		 for(int i=0;i<S.length();i++){
			 char c=S.charAt(i);
			 
			 if(c=='('){
				 stack.push(c);
			 }
			 else {	
                 if(stack.isEmpty()) {
                     return 0;
                 }
                 char c1=stack.pop();
                 if(c==')' &&!(c1=='(')){
                	 return 0;  
                 }
                 
			 }
			 
		 }
		 return stack.isEmpty()?1:0;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(()()()))";
		ArrSqBraces a=new ArrSqBraces();
		System.out.println(a.solution(s));

	}

}
