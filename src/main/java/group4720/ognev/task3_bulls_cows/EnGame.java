package group4720.ognev.task3_bulls_cows;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {

            list.add(Character.toString((char) i));
        }
        return list;
    }
}
