package group4720.ognev.task4;

import java.util.List;

public interface UserService<T extends User> {
    List<T> getAll();
    void create(T o);

    void remove(T o);

}
