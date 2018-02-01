package codility;
import java.util.Scanner;

public class ThreeComp {
    static int[] res=new int[2];
    //static int c=1;
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
    	if((a0>b0))
            res[0]+=1;
        else if(a0<b0)
            res[1]+=1;
        if((a1>b1))
            res[0]+=1;
        else if(a1<b1)
            res[1]+=1;
            if((a2>b2))
                res[0]+=1;
        else if(a2<b2)
            res[1]+=1;
            
        return res;
           
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();*/
        int[] result = solve(5,6,7,3,6,10);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}



