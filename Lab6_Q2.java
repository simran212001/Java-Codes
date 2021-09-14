import java.util.Random;

class ThreadClass implements Runnable{
private int[] random;

    public ThreadClass(int[] a){
        random=a;
    }
    int neg(int[] random){
        int nega=0;
        for(int i=0;i<10000;i++) {
            if (random[i] < 0)
                nega++;
        }
        return nega;
    }

    int posiEven(int[] random){
        int posEven=0;
        for(int i=0;i<10000;i++) {
            if (random[i] > 0){
                if(random[i]%2==0)
                    posEven++;
            }
        }
        return posEven;
    }

    int posiOdd(int[] random){
        int posOdd=0;
        for(int i=0;i<10000;i++) {
            if (random[i] > 0){
                if(random[i]%2!=0)
                    posOdd++;
            }
        }
        return posOdd;
    }
    @Override
    public void run() {
 System.out.println("negative, positive odd, positive even "+neg(random)+" "+posiOdd(random)+" "+posiEven(random));
    }
}




public class Lab6_Q2 {
    public static void main(String[] args) {
        int[] random = new int[10000];
        Random r = new Random();
        for(int i=0;i<10000;i++){
            random[i]=r.nextInt(201)-100;
        }
        int neg=0,posEven=0,posOdd=0;
        long startTime1 = System.nanoTime();
        for(int i=0;i<10000;i++){
            if(random[i]<0)
                neg++;
            else{
                if(random[i]%2==0)
                    posEven++;
                else
                    posOdd++;
            }
        }
        long endTime1 = System.nanoTime();
        System.out.println("negative, positive odd, positive even "+neg+" "+posOdd+" "+posEven);
        System.out.println("Time taken without using multiple threads: "+(endTime1-startTime1)+" ns");

        ThreadClass threadClass = new ThreadClass(random);
        Thread t1 = new Thread(threadClass);
        long startTime2 = System.nanoTime();
            t1.start();
        long endTime2 = System.nanoTime();

        System.out.println("Time taken  using multiple threads: "+(endTime2-startTime2)+" ns");
    }
}