import entity.Task;
import entity.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        User user = new User(1L, "Pawel", "pass");

        Task task = new Task(user.getId(), 1L, "Nowe zadanie", "Opis zadania", new Date(),false );

        System.out.println(user.toString());
        System.out.println(task.toString());
    }
}
