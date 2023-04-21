package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor  // создание конструктора
@NoArgsConstructor  // создание пустого конструктора
@Data               // геттеры и сеттеры
public class Answer {
    private String userInput;
    private Integer cow;
    private Integer bull;

}
