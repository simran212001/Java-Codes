import java.util.Arrays;
import java.util.Scanner;

public class LAB9_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String s = scanner.nextLine();
            String[] words = s.split(" ");
            String[] newWords = new String[words.length];

            for(int i=0;i<words.length;i++){
                String x = words[i];
                newWords[i]=words[words.length-1-i];
                newWords[words.length-1-i] = x;
            }
            for(String word:newWords){
                System.out.print(word +" ");
            }
        }
    }
}