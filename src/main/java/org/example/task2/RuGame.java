package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame{

    /**
     * @return - русский алфавит (список символов от а до я)
     */
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            charList.add(String.valueOf((char) i));
        }
        return charList;
    }
}
