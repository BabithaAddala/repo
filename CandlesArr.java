package codility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class CandlesArr {
	
	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
		Arrays.sort(ar);
		int mid=ar.length/2;
		if(ar.length%2==0)
			return mid;
		else
			return mid+1;
		//for(int i=0;i<ar.length;i++)
		//System.out.println(ar[i]);
				
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[] ar={3,2,1,3,4,4};
		int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
        
        
        //date format 
        String time="07:05:45 PM";
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ss a"); 

        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        try {
        	String ss=date24Format.format(date12Format.parse(time));
			System.out.println(ss);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
