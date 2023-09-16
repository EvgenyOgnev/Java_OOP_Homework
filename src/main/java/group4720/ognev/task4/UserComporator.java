package group4720.ognev.task4;

import java.util.Comparator;

public class UserComporator<T extends User> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        int i = o1.getSurname().compareTo(o2.getSurname());
        if (i == 0) {
            i = o1.getName().compareTo(o2.getName());
            if (i == 0) {
                i = Integer.compare(o1.getAge(), o2.getAge());
            }
        }
        return i;
    }
}
