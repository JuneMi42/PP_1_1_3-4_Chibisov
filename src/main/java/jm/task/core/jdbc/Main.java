package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoJDBCImpl();

      userDao.createUsersTable();

        userDao.saveUser("Name1", "LastName1", (byte) 15);
        userDao.saveUser("Name2", "LastName2", (byte) 20);
        userDao.saveUser("Name3", "LastName3", (byte) 25);
        userDao.saveUser("Name4", "LastName4", (byte) 30);
        userDao.removeUserById(3);

        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
