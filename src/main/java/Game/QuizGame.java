package Game;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

import GameComponents.*;

public class QuizGame {

    private ArrayList<QuizQuestion> questions;

    private int userScore;

    public QuizGame() {
        this.questions = new ArrayList<>();
        this.userScore = 0;
    }

    public ArrayList<QuizQuestion> getQuestions() {
        return questions;
    }

    public void addQuestion(QuizQuestion question){
        this.questions.add(question);
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int newScore) {
        this.userScore = newScore;
    }

    public void userAnswersCorrectly(){
        this.userScore += 1;
    }

    public void giveCurrentScore(){
        String currentScore = String.format("You have answered %s questions correctly.", getUserScore());
        System.out.println(currentScore);
    }

    public boolean allQuestionsAnswered(){
        boolean status = false;
        for (QuizQuestion question:this.questions){
            if (!question.getAnsweredStatus()){
                status = false;
            } else {
                status = true;
            }
        }
        return status;
    }

    public void askQuestion(QuizQuestion question) {
        question.ask();
        Scanner input = new Scanner(System.in);
        char userAnswer = input.next().toLowerCase().charAt(0); // Read the first character of user input
        input.nextLine(); // Consume the remaining newline character from the input

        if (userAnswer == question.getCorrectAnswer()) {
            System.out.println("That's correct!");
            userAnswersCorrectly();
        } else if (userAnswer == 'a' || userAnswer == 'b' || userAnswer == 'c' || userAnswer == 'd') {
            System.out.println("I'm afraid that's incorrect.");
        } else {
            System.out.println("Please enter a valid answer");
            askQuestion(question);
        }
        System.out.println(question.getPostQuestionInfo());
        question.markAsAnswered();
    }

    public void runQuizGame(){
        System.out.println("Welcome to the Superman quiz!");
        for (QuizQuestion question: this.questions){
            askQuestion(question);
            if (!allQuestionsAnswered()){
                giveCurrentScore();
            } else {
                System.out.println("That's the end of the quiz!");
            }
        }
    }

   
}
