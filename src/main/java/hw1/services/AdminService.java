package hw1.services;

import hw1.models.Human;

import java.io.FileWriter;
import java.io.IOException;

public class AdminService implements Service {

    @Override
    public void writeUserData(Human human) {
        try (FileWriter writer  = new FileWriter("src/main/resources/output.txt",true)){
            writer.write(human.toString());
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}