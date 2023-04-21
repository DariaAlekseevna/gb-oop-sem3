package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@AllArgsConstructor  // создание конструктора
@NoArgsConstructor  // создание пустого конструктора
@Data               // геттеры и сеттеры

public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;
    int count = 0;

    // передаем размер слова, количество попыток за которое нужно угадать слово
    // также методо генерируем слово, ставим статус старт игры
    // если нужно сохр историю, то нужно проинцелизировать коллекцию,
    // которая будет сохранять ответ, при старте игры нужно занулить
    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWord(); // слово загаданное компьютером
        this.gameStatus = GameStatus.START;
    }

    @Override
    public GameStatus getGameStatus() {
        if (gameStatus == GameStatus.INIT) {
            gameStatus = GameStatus.START;

        } else if (gameStatus == GameStatus.WIN) {
            System.out.println("You are WIN!!!");
        } else if (gameStatus == GameStatus.LOSE) {
            System.out.println("You are LOSE :(");
        }
        return gameStatus;
    }

    @Override
    public Answer inputValue(String value) {
        int bull = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bull++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
        }
        count++;
        if (bull == value.length()) {
            gameStatus = GameStatus.WIN;
        } else if (count == attempts) {
            gameStatus = GameStatus.LOSE;
        }
        return new Answer(value, cows, bull);
    }

    private String generateWord() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWord = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWord = resWord.concat(charList.get(randomIndex)); // сконкатинировали строку
            charList.remove(randomIndex); // удаляем элемент, и будем уверены, что такую букву или цифру больше не возьмем
        }
        return resWord;
    }

    abstract List<String> generateCharList();
}
