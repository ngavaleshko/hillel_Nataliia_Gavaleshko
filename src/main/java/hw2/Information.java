package hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {

    private List nicknames;
    private Set emails;
    private Map db;

    public Information(ArrayList<String> nicknames, HashSet<String> emails) {
        this.nicknames = nicknames;
        this.emails = emails;
        db = new HashMap<String, String>();
        generateDb(nicknames, emails);

        System.out.println(sizeChecker());
    }

    private String sizeChecker() {
        return this.nicknames.size()==this.emails.size()&&this.nicknames.size()==this.db.size()? "The List, Map and Set size are equals": "Size not equals";

    }

    private void generateDb(ArrayList<String> nicknames, HashSet<String> emails) {
        for (Iterator<String> it = emails.iterator(); it.hasNext(); ) {
            String email = it.next();
            for (int i = 0; i < nicknames.size(); i++) {
                String nickname = nicknames.get(i);
                if (email.substring(0, 5).equals(nickname)) {
                    System.out.println("number " + i + " email " + email + " --- " + nickname);
                    db.put(nickname, email);
                    break;
                }
            }
        }
        System.out.println("Map size: " + db.size());
    }

    public List getNicknames() {
        return nicknames;
    }

    public Set getEmails() {
        return emails;
    }

    public Map getDb() {
        return db;
    }

    @Override
    public String toString() {
        return "Information{" +
                "db=" + db +
                '}';
    }
}