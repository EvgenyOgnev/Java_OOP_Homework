package group4720.ognev.task4;

import java.util.List;

public class TeacherView<T extends Teacher> implements UserView<T> {
    @Override
    public void sendOnConsole(List<T> users) {
        System.out.println("Список преподавателей:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(" " + (i+1) + ") " + users.get(i));
        }
        System.out.println("Всего преподавателей: " + users.size());

    }
}
