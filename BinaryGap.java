package codility;


public class BinaryGap {
	public int binary(int num){
		
		//String s=Integer.toBinaryString(num);
		String s="10001100000000001000000000001";
		// System.out.println(s);
		 int count=0,flag=0;
		 char[] c=s.toCharArray();
		int f=s.indexOf("1");
		int l=s.lastIndexOf("1");
		//System.out.println("FFF:::"+f+"LLL::::"+l);
		String[] ss=s.split("1");
		int maxLength=0;
		for(String st:ss){
			if(st.length()>maxLength){
				maxLength=st.length();
			}
		}
		//System.out.println("MAx Length::"+maxLength);
		for(int i=f+1;i<l;i++){
			
			if(c[i]!='1'){
				if(c[i]=='0'){
					count++;
					if(count>flag)
						flag=count;
					//System.out.print("count:::"+count);
				}
			}else{
				count=0;
				//count++;
				//System.out.print("Flag:::"+flag);
			}
		}
		if(flag==maxLength)
			return maxLength;
		/*else if(count>maxLength){
			count=count-maxLength;
			return count;
		}*/
		else if(flag<maxLength)
			return flag;
		else
			return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=46;
		BinaryGap b=new BinaryGap();
		int l=b.binary(num);
		System.out.println("length:::"+l);
		
	}

}
