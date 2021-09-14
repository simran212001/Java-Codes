import java.util.Scanner;

class NegativeAmtException extends Exception{
    private  int amount;
    public NegativeAmtException(int amount){
        this.amount = amount;
    }
}

public class Lab7_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int amount = scanner.nextInt();
            if(amount<0) {
                throw new NegativeAmtException(amount);
            }
            System.out.println("Amount entered is "+ amount);
        }catch (NegativeAmtException e){
            System.out.println("You cannot Enter negative values");
            System.out.println("Amount thus has been set to 0");
        }
    }
}