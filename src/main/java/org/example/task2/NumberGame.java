package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame{

    /**
     * @return - список символов от 0 до 9
     */
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}
