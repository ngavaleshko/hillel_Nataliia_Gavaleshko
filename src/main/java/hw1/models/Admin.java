package hw1.models;

public class Admin extends Human {

    public Admin(String name, String surname, int age, String email, String password) {
        super(name, surname, age, email, password, "ADMIN");
    }
}