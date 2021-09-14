import java.util.Random;
import java.util.Stack;

class MyStack implements Runnable{
    private Stack<Integer> stack;
    public MyStack(Stack st){
        this.stack = st;
    }
Random rand = new Random();

    void push(int x){
        if(stack.capacity()==20)
            System.out.println("Cannot push. Limit reached");
        else
        stack.push(rand.nextInt(100));
    }
    void pop(){
        if(stack.isEmpty())
            System.out.println("Nothing to pop");
        else
            stack.pop();
    }
    @Override
    public void run() {
        int times=30;
        while(times-->0) {
            int temp = rand.nextInt(2);
            if (temp == 1) {
                int y = rand.nextInt(101);
                push(y);
                try {
                    Thread.sleep(rand.nextInt(1000));
                    System.out.println("PUSH " + y + " " + "- Waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                pop();
                try {
                    Thread.sleep(rand.nextInt(1000));
                    System.out.println("POP - Waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Lab6_Q1 {
    public static void main(String[] args) throws InterruptedException {
        Stack<Integer> stack = new Stack<>();
        MyStack myStack = new MyStack(stack);
        Thread t1 = new Thread(myStack);
        long startTime = System.nanoTime();
        t1.start();
        Thread.sleep(17000);
        long endTime = System.nanoTime();
        System.out.println("Time of execution: "+(endTime-startTime)+" ns" +"with 30 random pop push commands");
    }
}