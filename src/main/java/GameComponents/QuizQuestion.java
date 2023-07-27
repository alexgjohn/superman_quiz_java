package GameComponents;

import GameComponents.AnswerOption;

import java.util.ArrayList;

public class QuizQuestion {

    private int questionNumber;
    private String questionText;

    private ArrayList<AnswerOption> options;

    private char correctAnswer;

    private String postQuestionInfo;

    private boolean hasBeenAnswered;

    public QuizQuestion(int questionNumber, String questionText, String postQuestionInfo) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.options = new ArrayList<>();
        this.correctAnswer = 'a';
        this.postQuestionInfo = postQuestionInfo;
        this.hasBeenAnswered = false;
    }

    public int getQuestionNumber() {
        return this.questionNumber;
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public ArrayList<AnswerOption> getOptions() {
        return this.options;
    }

    public char getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void addAnswerOption(AnswerOption answerOption) {
        AnswerOption option = new AnswerOption(answerOption.getOptionLetter(), answerOption.getOptionText());
        this.options.add(option);
    }

    public void setCorrectAnswer(char optionLetter) {
        this.correctAnswer = optionLetter;
    }

    public String getPostQuestionInfo() {
        return this.postQuestionInfo;
    }

    public boolean getAnsweredStatus(){
        return this.hasBeenAnswered;
    }

    public void markAsAnswered() {
        this.hasBeenAnswered = true;
    }
}
