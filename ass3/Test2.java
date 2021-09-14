import java.util.*;  

class Question {
	static int fibo(int n){
		 if (n <= 1) 
       return n; 
    return fibo(n-1) + fibo(n-2); 
	}
}
public class Test2
{
	public static void main (String[] args) 
	{
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter one number- ");  
		int n = sc.nextInt();  
   
        Question q = new Question();
        System.out.print("nth fibonacci number is: ");
       System.out.println(q.fibo(n));
	}
}