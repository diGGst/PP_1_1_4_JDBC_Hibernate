package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.UtilHibernate;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Ella", "Rudolstadt", (byte) 28);
        userService.saveUser("Alexey", "Belomestnov", (byte) 35);
        userService.saveUser("Vyatcheslav", "Smiryagin", (byte) 26);
        userService.saveUser("Dmitry", "Haritonov", (byte) 30);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
