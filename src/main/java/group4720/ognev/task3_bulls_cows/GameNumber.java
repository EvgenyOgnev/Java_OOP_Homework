package group4720.ognev.task3_bulls_cows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameNumber extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        return list;
    }
}
