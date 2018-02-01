package codility;

import java.util.HashSet;

public class Codility2 {
	int count=0;
	public int solution(int N) {
		// write your code in Java SE 8
		
		HashSet<String> set = new HashSet<String>();
		String str = Integer.toString(N);
		int l = 0;
		int r = str.length() - 1;
		count=permute(str, l, r, set);

		return count;
	}

	public String swap(String a, int i, int j) {
		char temp;
		
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public int permute(String str, int l, int r, HashSet<String> set) {
		char[] c=new char[str.length()];
		if (l == r) {
			if (set.contains(str) == false) {
				c=str.toCharArray();
				if(c[0]!='0'){
				set.add(str);
				System.out.println(str);
				count++;
				}
			}
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, set);
				str = swap(str, l, i);
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Codility2 c = new Codility2();
		int N = 1231;
		System.out.println(c.solution(N));

	}

}
