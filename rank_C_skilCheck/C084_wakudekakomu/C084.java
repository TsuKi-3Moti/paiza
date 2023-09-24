package rank_C_skilCheck.C084_wakudekakomu;

import java.util.*;
public class C084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();
        
        StringBuilder frame = new StringBuilder();
        
        // 上下の枠の作成
        for (int i = 0; i < word.length() + 2; i++) {
            frame.append("+");
        }
        
        // 出力
        System.out.println(frame);
        System.out.println("+" + word + "+");
        System.out.println(frame);
        
    }
}