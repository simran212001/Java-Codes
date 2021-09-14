import java.math.BigInteger;
 
public class Q1 {
    public static void main(String args[]){
        int a = 40 , b = 20;
        System.out.println(factorial(a).divide(factorial(b).multiply(factorial(a - b))));
    }
    public static BigInteger factorial( int n1 )
    {
        BigInteger a = BigInteger.ONE;
        for (int i = 1; i <= n1; i ++) {
            a = a.multiply(BigInteger.valueOf(i));          
        }
        return a;
    }
 
}