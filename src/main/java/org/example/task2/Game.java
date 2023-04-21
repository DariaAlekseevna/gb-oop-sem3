package org.example.task2;

public interface Game {

    /**
     * @param sizeWord длинна слова
     * @param attempts количество попыток, за которое необходимо отгадать слова
     */
    void start(Integer sizeWord, Integer attempts);

    /**
     * @return - статус игры
     */
    GameStatus getGameStatus();

    /**
     * @param value слово введенное пользователем, для угадывания слова загаданного программой
     * @return - ответ, а именно количество быков и коров в слове
     */
    Answer inputValue(String value);
}
