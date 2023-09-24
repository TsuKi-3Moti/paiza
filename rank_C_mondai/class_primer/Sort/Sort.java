package rank_C_mondai.class_primer.Sort;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        User[] users = new User[count];

        for (int i = 0; i < count; i++) {
            
            String nickname = sc.next();
            int old = sc.nextInt();
            String birth = sc.next();
            String state = sc.next();
            
            users[i] = new User(nickname, old, birth, state);
        }
        sc.close();

        Arrays.sort(users, (a, b) -> a.getOld() - b.getOld()); // ラムダ式　(a,b)->a-b　なら昇順、(a,b)->b-aなら降順

        for (User user : users) {
            user.printData(user);
        }
    }
}

class User {
    private String nickname;
    private int old;
    private String birth;
    private String state;
    
    User (String nickname, int old, String birth, String state) {
        this.nickname = nickname;
        this.old = old;
        this.birth = birth;
        this.state = state;
    }

    public int getOld() {
        return this.old;
    }

    public void printData(User user) {
        // 配列を作ってjoinする方がよいのかどうか
        System.out.println(
            this.nickname +
            " " +
            this.old +
            " " +
            this.birth +
            " " +
            this.state
        );
    }
}
