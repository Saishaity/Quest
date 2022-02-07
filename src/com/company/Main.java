package com.company;

public class Main {

    public static void main(String[] args) {
        Question[] questions = new Question[5];

        Answer[] answers1 = new Answer[3];
        answers1[0] = new Answer("1 - 2 lines");
        answers1[1] = new Answer("2 - 4 paragraphs");
        answers1[2] = new Answer("3 - 8 pages");

        questions[0] = new Question("How long was Amy's toast at the first dinner at Holt's?", answers1, 3);

        Answer[] answers2 = new Answer[3];
        answers2[0] = new Answer("1 - Scrambled eggs");
        answers2[1] = new Answer("2 - Tortilla");
        answers2[2] = new Answer("3 - French toast");

        questions[1] = new Question("What was Boyle teaching the capitan to cook?", answers2, 1);

        Answer[] answers3 = new Answer[3];
        answers3[0] = new Answer("1 - Christmas");
        answers3[1] = new Answer("2 - Halloween");
        answers3[2] = new Answer("3 - National Police Day");

        questions[2] = new Question("On which day does the annual heist in the precinct happen?", answers3, 2);

        Answer[] answers4 = new Answer[3];
        answers4[0] = new Answer("1 - none");
        answers4[1] = new Answer("2 - 2 sisters");
        answers4[2] = new Answer("3 - a sister and a brother");

        questions[3] = new Question("How many siblings does Rosa have?", answers4, 2);

        Answer[] answers5 = new Answer[3];
        answers5[0] = new Answer("1 - flawless");
        answers5[1] = new Answer("2 - brilliant");
        answers5[2] = new Answer("3 - superb");

        questions[4] = new Question("How did Gina describe her advice-giving moment?", answers5, 1);

        Game game = new Game(questions);
        game.doPlay();

    }


}
