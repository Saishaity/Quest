package com.company;

public class Question {
    private String value;
    private Answer[] answers;
    private int correct;

    public Question(String value, Answer[] answers, int correct) {
        this.value = value;
        this.answers = answers;
        this.correct = correct;
    }
    public String getValue(){
        return value;
    }
    public int getCorrect(){
        return correct;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void printAnswers(Answer[] answers) {
        System.out.println(answers[0].getValue());
        System.out.println(answers[1].getValue());
        System.out.println(answers[2].getValue());
    }
}
