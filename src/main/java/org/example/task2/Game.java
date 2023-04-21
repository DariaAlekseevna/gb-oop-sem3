package org.example.task2;

public interface Game {

    void start(Integer sizeWord, Integer attempts);
    GameStatus getGameStatus();
    Answer inputValue(String value);
}
