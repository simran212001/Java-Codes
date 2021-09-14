import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lab7_Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a,b,div=0;
        Scanner sc=new Scanner(System.in);
               
        try{  
            a=sc.nextInt();
            b=sc.nextInt(); 
            div = a/b;  
        }
        catch(ArithmeticException e){System.out.println(e);} 
        catch(InputMismatchException e){System.out.print("java.util.InputMismatchException");}
    
        
        if(div>0)
        System.out.println(div);
    }
}