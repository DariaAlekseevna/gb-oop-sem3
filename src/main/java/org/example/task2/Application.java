package org.example.task2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("1 - number game");
        System.out.println("2 - english game");
        System.out.println("3 - russian game");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new EnGame();
                break;
            case 3:
                game = new RuGame();
                break;
            default:
                System.out.println(" such game not added yet! ");
        }
        System.out.println("Input size of word: ");
        Integer wordSize = scanner.nextInt();
        System.out.println(" and number of attempts: ");
        Integer attempts = scanner.nextInt();
        game.start(wordSize, attempts);
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("step: ");
            String answer = scanner.next();
            Answer answerGame = game.inputValue(answer);
            System.out.println("cows - " + answerGame.getCow() + ", bulls - " + answerGame.getBull());
        }
        scanner.close();
    }
}
