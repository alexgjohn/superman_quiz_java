import GameComponents.AnswerOption;
import GameComponents.QuizQuestion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuizQuestionTest {

    private AnswerOption optionA;

    private AnswerOption optionB;
    private QuizQuestion question1;

    @Before
    public void before(){
        optionA = new AnswerOption('a', "Bruce Wayne");
        optionB = new AnswerOption('b', "Clark Kent");
        question1 = new QuizQuestion(1, "What is Superman's secret identity?", "Clark Kent is a mild-mannered reporter for a major metropolitan newspaper.");
    }

    @Test
    public void hasQuestionNumber(){
        assertEquals(1, question1.getQuestionNumber());
    }

    @Test
    public void hasQuestionText(){
        assertEquals("What is Superman's secret identity?", question1.getQuestionText());
    }

    @Test
    public void hasEmptyListOfOptions(){
        assertEquals(0, question1.getOptions().size());
    }

    @Test
    public void hasDefaultCorrectAnswerOf_A(){
        assertEquals('a', question1.getCorrectAnswer());
    }

    @Test
    public void canAddAnswerOptions(){
        question1.addAnswerOption(optionA);
        question1.addAnswerOption(optionB);
        assertEquals(2, question1.getOptions().size());
    }

    @Test
    public void canSetCorrectAnswer(){
        question1.addAnswerOption(optionA);
        question1.addAnswerOption(optionB);
        question1.setCorrectAnswer('b');
        assertEquals('b', question1.getCorrectAnswer());
    }

    @Test
    public void hasPostQuestionInfo(){
        String expected = "Clark Kent is a mild-mannered reporter for a major metropolitan newspaper.";
        assertEquals(expected, question1.getPostQuestionInfo());
    }

    @Test
    public void startAnsweredAsFalse(){
        assertEquals(false, question1.getAnsweredStatus());
    }

    @Test
    public void canMarkAsAnswered(){
        question1.markAsAnswered();
        assertEquals(true, question1.getAnsweredStatus());
    }
}
