package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Nazar", "Ponomarenko", (byte) 23);
        userService.saveUser("Name2", "LastName2", (byte) 20);
        userService.saveUser("Name3", "LastName3", (byte) 25);
        userService.saveUser("Name4", "LastName4", (byte) 30);
        userService.removeUserById(3);

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
