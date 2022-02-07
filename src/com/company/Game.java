package com.company;
import java.util.Scanner;

public class Game {
    private Question[] questions;

    public Game(Question[] questions) {
        this.questions = questions;
    }

    public void doPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the 'Brooklyn 9-9' quest");
        System.out.println("Press Enter to begin");
        if(scanner.nextLine()=="") {
            int counter = 0;
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i].getValue());
                questions[i].printAnswers(questions[i].getAnswers());
                int input = Integer.valueOf(scanner.nextLine());
                if (input == questions[i].getCorrect()) {
                    counter = counter + 1;
                }
            }
            System.out.println("End of the game");
            System.out.println("Your score is " + counter);
        }
    }
}
