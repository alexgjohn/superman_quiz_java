import GameComponents.*;
import Game.QuizGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class QuizGameTest {

    private AnswerOption optionA;
    private AnswerOption optionB;

    private AnswerOption optionC;
    private AnswerOption optionD;

    private QuizQuestion question1;

    private QuizGame game;

    @Before
    public void before(){
        optionA = new AnswerOption('a', "Bruce Wayne");
        optionB = new AnswerOption('b', "Clark Kent");
        optionC = new AnswerOption('c', "Peter Parker");
        optionD = new AnswerOption('d', "Beyonce Knowles");
        question1 = new QuizQuestion(1, "What is Superman's secret identity?", "Clark Kent is a mild-mannered reporter for a major metropolitan newspaper.");
        question1.addAnswerOption(optionA);
        question1.addAnswerOption(optionB);
        question1.addAnswerOption(optionC);
        question1.addAnswerOption(optionD);
        question1.setCorrectAnswer('b');
        game = new QuizGame();
        game.addQuestion(question1);
    }

    @Test
    public void hasQuestions(){
        assertEquals(1, game.getQuestions().size());
    }

    @Test
    public void questionsStartUnanswered(){
        assertFalse(game.getQuestions().get(0).getAnsweredStatus());
    }


}
