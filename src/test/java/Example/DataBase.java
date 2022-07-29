package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {

    List<User> userList = new ArrayList<>();

    public static List<User> getUsersList() {

        User first = new User(20, "Kate", 55, true, "student");
        User second = new User(33, "Yuliya", 62, true, "AQA");
        User third = new User(50, "Sergiy", 102, false, "driver");
        User fourth = new User(55, "Misha", 57, true, "builder");
        User fifth = new User(30, "Roman", 86, true, "military");
        User sixth = new User(26, "Iryna", 55, true, "Phd");
        User seventh = new User(44, "Natalka", 60, false, "teacher");
        User eighth = new User(23, "Vlad", 78, false, "students");
        User ninth = new User(35, "Illia", 90, true, "trainer");
        User tenth = new User(35, "Vadym", 80, true, "coach");
        User eleven = new User(22, "Lina", 45, true, "AQA");
        User twelve = new User(33, "Andi", 70, false, "musician");
        User thirteen = new User(10, "Sofy", 33, false, "children");
        User fourteen = new User(6, "Aryna", 22, false, "children");
        User fifteen = new User(11, "Artur", 25, true, "student");

        List<User> userList = Arrays.asList(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleven, twelve, thirteen, fourteen, fifteen);

        return userList;
    }

    public List<User> printAviable(List<User> userList, UsersCheck usersCheck) {
        List<User> users = new ArrayList<>();
        for (User user : userList) {
            if (usersCheck.checkAviable(user)) {
                users.add(user);
            }
        }
        return users;
    }
}
