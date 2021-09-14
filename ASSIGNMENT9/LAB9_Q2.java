import java.util.Scanner;

public class LAB9_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int[] cnt = new int[200];
            String str = scanner.next();
            for(int i =0 ; i < str.length() ; i ++){
                cnt[str.charAt(i)]++;
            }
            long  ans =0 ;
            ans += 2*Math.min(cnt['('],cnt[')']);
            ans += 2*Math.min(cnt['['],cnt[']']);
            ans += 2*Math.min(cnt['{'],cnt['}']);

            System.out.println(ans);
        }
        
    }
}