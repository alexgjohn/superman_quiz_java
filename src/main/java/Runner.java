import Game.*;
import GameComponents.*;

public class Runner {

    public static void main(String[] args) {
        AnswerOption option1A = new AnswerOption('a', "Bruce Wayne");
        AnswerOption option1B = new AnswerOption('b', "Clark Kent");
        AnswerOption option1C = new AnswerOption('c', "Peter Parker");
        AnswerOption option1D = new AnswerOption('d', "Harry Hill");

        QuizQuestion question1 = new QuizQuestion(1, "What is Superman's secret identity?", "Clark Kent is a mild-mannered reporter for a major metropolitan newspaper.");
        question1.addAnswerOption(option1A);
        question1.addAnswerOption(option1B);
        question1.addAnswerOption(option1C);
        question1.addAnswerOption(option1D);
        question1.setCorrectAnswer('b');
        QuizGame game = new QuizGame();
        game.addQuestion(question1);
        game.runQuizGame();
    }
}
