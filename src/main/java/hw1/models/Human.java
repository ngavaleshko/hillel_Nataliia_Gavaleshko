package hw1.models;

public class  Human {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String password;
    private String role;


    public Human(String name, String surname, int age, String email, String password, String role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return  "---------------------" +
                "\nname='" + name + '\'' +
                ", \nsurname='" + surname + '\'' +
                ", \nage=" + age +
                ", \nemail='" + email + '\'' +
                ", \npassword='" + password + '\'' +
                ", \nrole='" + role + '\'' +
                '\n';
    }
}