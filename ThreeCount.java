package codility;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ThreeCount {
	    
	  public void solution(int[] a,int n){
		  double[] res=new double[3];
		 DecimalFormat df = new DecimalFormat("#.#####");
	        int c1=0,c2=0,c3=0;
	        
	        for(int i=0;i<n;i++){
	            if(a[i]>0){
	                c1++;
	            }else if(a[i]==0){
	                c2++;
	            }else{
	                c3++;
	            }
	        }
	            res[0]=(float) c1/n;
	            res[1]=(float)c2/n;
	        res[2]=(float)c3/n;
	        
	        System.out.println(df.format(res[0]));
	        System.out.println(df.format(res[2]));
	        System.out.println(df.format(res[1]));
	        
	        
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = 6;
	        //int arr[] = new int[n];
	       /* for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }*/
	        int[] arr={-4,9,0,-3,2,1};
	        ThreeCount t=new ThreeCount();
	        //double[] d= t.solution(arr, n);
	      t.solution(arr, n);
	      
	    }
	}


