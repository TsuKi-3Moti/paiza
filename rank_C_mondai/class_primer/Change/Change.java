package rank_C_mondai.class_primer.Change;

import java.util.*;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        int update = sc.nextInt();

        User[] users = new User[count];

        for (int i = 0; i < count; i++) {
            
            String name = sc.next();
            String old = sc.next();
            String birth = sc.next();
            String state = sc.next();
            
            users[i] = new User(name, old, birth, state);
        }

        // 名前の更新
        for (int i = 0; i < update; i++) {
            int id = sc.nextInt();
            String newName = sc.next();
            users[id - 1].changeName(newName); //idは1からなので、-1する
        }

        sc.close();

        for (User user : users) {
            user.printData(user);
        }

    }
}

class User {
    private String name;
    private String old;
    private String birth;
    private String state;
    
    User (String name, String old, String birth, String state) {
        this.name = name;
        this.old = old;
        this.birth = birth;
        this.state = state;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void printData(User user) {
        // 配列を作ってjoinする方がよいのかどうか
        System.out.println(
            this.name +
            " " +
            this.old +
            " " +
            this.birth +
            " " +
            this.state
        );
    }
}
