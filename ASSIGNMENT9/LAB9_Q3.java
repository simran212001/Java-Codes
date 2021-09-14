import java.util.Scanner;

public class LAB9_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q=scanner.nextInt();
        scanner.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQSTUVWXYZ";
        while(q-->0)
        {
            String s = scanner.next();
            String t = scanner.next();
            int ans = -1;
            boolean flag = false;
            for(int i = 0; i < s.length(); i ++)
            {
                int diff = (t.charAt(i) - s.charAt(i) + 26) % 26;
                if(ans == -1)
                    ans = diff;
                if(diff == ans)
                    continue;
                else
                {
                    flag = true;
                    break;
                }
            }
            if(flag)
                System.out.println(-1);
            else
                System.out.println(ans);
        }
      
    }
}