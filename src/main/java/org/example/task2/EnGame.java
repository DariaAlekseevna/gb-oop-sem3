package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            charList.add(String.valueOf((char) i));
        }
        return charList;
    }
}
