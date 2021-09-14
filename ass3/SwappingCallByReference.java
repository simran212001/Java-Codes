import java.util.*;

class Demo
{
   int n1, n2;
   Demo(int x, int y)
   {
      n1 = x;
      n2 = y;
   }
   void swapNumber(Demo obj)
   {
      int n;
      n = obj.n1;
      obj.n1 = obj.n2;
      obj.n2 = n;
   }
}
public class SwappingCallByReference 
{
   public static void main(String[] args) 
   {
   	  Scanner sc= new Scanner(System.in);    
      System.out.print("Enter first number ");  
      int x= sc.nextInt();  
      System.out.print("Enter second number ");  
      int y= sc.nextInt();  
      Demo obj = new Demo(x, y);
      System.out.println("Before swapping two numbers: ");
      System.out.println("Number1 = " + x + " Number2 = " + y);
      obj.swapNumber(obj);
      System.out.println("After swapping two numbers: ");
      System.out.println("Number1 = " + obj.n1 + " Number2 = " + obj.n2);
   }
}