package hw2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class InitializationData {
    ArrayList<String> nicknames = new ArrayList<>();
    HashSet<String> email = new HashSet<>();


    public Information initialize() {
        generateNicknames(30, 5);
        generateEmail();
        return new Information(nicknames, email);
    }

    /**
     * This method prevent duplications in while statement
     */
    public void generateNicknames(int maxGeneratedNicknames, int nicknameLength) {
        for (int i = 0; i < maxGeneratedNicknames; ++i) {
            String nickname;
            do {
                nickname = returnNickname(nicknameLength);
            } while (nicknames.contains(nickname));
            nicknames.add(nickname);
        }

        for (int i = 0; i < nicknames.size(); i++) {
            System.out.println(nicknames.get(i));
        }
    }

    private String returnNickname(int nameSize) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'y', 'o', 'f', 'u', 'z'};
        char[] name = new char[nameSize];
        for (int i = 0; i < nameSize; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1);
            name[i] = chars[randomNum];
        }
        return new String(name);
    }

    public void generateEmail() {
        for (String temp : nicknames) {
            email.add(temp + "@gmail.com");
        }
        System.out.println("Nick size "+nicknames.size());
        System.out.println("Email size "+email.size());
        for (String x : email) {
            System.out.println(x);
        }
    }
}