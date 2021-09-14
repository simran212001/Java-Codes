import java.util.*;  

class Question {
	int sum(int x, int y){
		return x+y;
	}
	static int mul(int x, int y){
		return x*y;
	}
}
public class Test
{
	public static void main (String[] args) 
	{
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter value of x ");  
		int x= sc.nextInt();  
        System.out.print("Enter value of y ");  
        int y= sc.nextInt(); 
        Question q = new Question();
        int sum = q.sum(x,y);
        System.out.println("sum is: "+sum);
        int mul = q.mul(x,y);
        System.out.println("mul. is: "+mul);
	}
}