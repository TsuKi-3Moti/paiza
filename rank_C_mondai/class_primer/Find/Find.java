package rank_C_mondai.class_primer.Find;

import java.util.*;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        User[] users = new User[count];

        for (int i = 0; i < count; i++) {
            
            String nickname = sc.next();
            String old = sc.next();
            String birth = sc.next();
            String state = sc.next();
            
            users[i] = new User(nickname, old, birth, state);
        }

        String str = sc.next();
        sc.close();

        for (User user: users) {
            if (str.equals(user.getOld())){
                System.out.println(user.getNickName());
            }
        }
    }
}

class User {
    private String nickname;
    private String old;
    private String birth;
    private String state;
    
    User (String nickname, String old, String birth, String state) {
        this.nickname = nickname;
        this.old = old;
        this.birth = birth;
        this.state = state;
    }

    public String getOld() {
        return this.old;
    }

    public String getNickName() {
        return this.nickname;
    }
}