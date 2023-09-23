package rank_C_mondai.class_primer.Make;

import java.util.*;

public class Make {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
    
        for (int i = 0; i < count; i++) {
            
            String nickname = sc.next();
            String old = sc.next();
            String birth = sc.next();
            String state = sc.next();
            
            User user = new User(nickname, old, birth, state);

            user.printData();
        }
        sc.close();
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

    public void printData() {
        System.out.println("User{"                       );
        System.out.println("nickname : " + this.nickname );
        System.out.println("old : "      + this.old      );
        System.out.println("birth : "    + this.birth    );
        System.out.println("state : "    + this.state    );
        System.out.println("}"                           );
    }
}
