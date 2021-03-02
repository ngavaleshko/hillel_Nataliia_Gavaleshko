package hw2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        InitializationData data = new InitializationData();

        Information information = data.initialize();

        List<Byte> bytes = new ArrayList<>();
        for (byte i = 0; i < 30; i++) {
            bytes.add(i);
        }
        System.out.println(wildCards(bytes, information, data));
        System.out.println("Set size: " + information.getEmails().size());
        System.out.println("List size: " + information.getNicknames().size());
        System.out.println("Map size:" + information.getDb().size());
    }

    public static Information wildCards(List<? extends Number> lists, Information information, InitializationData data) {

        for (int i = 0; i < lists.size(); i++) {
            if (!information.getEmails().contains(lists.get(i) + "@mail.com")) {
                information.getNicknames().add(data.nicknames.get(i));
                information.getEmails().add("user" + lists.get(i) + "@mail.com");
                information.getDb().put("user" + lists.get(i) + "@mail.com", "user" + lists.get(i));
            }
        }
        return information;
    }
}