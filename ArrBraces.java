package codility;
import java.util.LinkedList;

public class ArrBraces {
	
	 public int solution(String S) {
LinkedList<Character> stack = new LinkedList<Character>();
         for(int i=0;i<S.length();i++) {
             char c = S.charAt(i);
             
             if(c == '{' || c == '[' || c == '(') {
                 stack.push(c);
             } else {
                 if(stack.isEmpty()) {
                     return 0;
                 }
                 
                 char corresponding = stack.pop();
                 
                 if(c == ')' && corresponding != '(') {
                     return 0;
                 }
                 
                 if(c == ']' && corresponding != '[') {
                     return 0;
                 }
 
                 if(c == '}' && corresponding != '{') {
                     return 0;
                 }
 
             }
         }
         
         return stack.isEmpty() ? 1 : 0;
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{[()()}";
		ArrBraces a=new ArrBraces();
		System.out.println(a.solution(s));
		
	}

}
