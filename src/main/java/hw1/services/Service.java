package hw1.services;

import hw1.models.Human;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public interface Service {

    void writeUserData(Human human);

    default boolean checkUserData(Human human) {
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/users.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                if (human.getEmail().equalsIgnoreCase(line)) {
                    System.out.println("Was found " + human.getRole() + " and his email is " + human.getEmail());
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Role "+ human.getRole()+"  is not found for "+ human.getEmail());
        return false;
    }
}