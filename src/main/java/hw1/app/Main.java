package hw1.app;

import hw1.models.Admin;
import hw1.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vova", "Sinyak", 12, "qwert@yes.ua", "123ewf");
        User user2 = new User("Vova", "Drom", 51, "321@yes.ua", "zxsdfgtyuiop56789");
        Admin admin = new Admin("AdWorkedName", "AdWorkerSurname", 15, "qwerty@cvb.com", "123456");
        Admin admin2 = new Admin("AdWorkedName33", "AdWorkerSurname44", 77, "qwerty+234@cvb.com", "password123");

        UserService userService = new UserService();
        userService.writeUserData(user);

        userService.checkUserData(user);
        userService.checkUserData(user2);

        AdminService adminService = new AdminService();

        adminService.writeUserData(user);
        adminService.writeUserData(admin);

        adminService.writeUserData(admin2);
        adminService.checkUserData(admin);

    }
}
© 2021 GitHub, Inc.