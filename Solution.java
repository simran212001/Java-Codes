import java.util.*;
import java.util.Scanner;

class myCalculator{
    long power(int n, int p) throws Exception{
        if(n<0 || p<0)  throw new Exception("n and p should be non-negative");
        if(n==0 && p==0) throw new Exception("n and p should not be zero");
        return (long)Math.pow(n,p);
    }
}

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        myCalculator M = new myCalculator();
        try{
            System.out.println(M.power(n,p));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}