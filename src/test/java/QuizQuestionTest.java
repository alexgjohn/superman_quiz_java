import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuizQuestionTest {

    private QuizQuestion question1;

    @Before
    public void before(){
        question1 = new QuizQuestion(1, "What is Superman's secret identity?");
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
        question1.addAnswerOption('a', "Bruce Wayne");
        question1.addAnswerOption('b', "Clark Kent");
        assertEquals(2, question1.getOptions().size());
    }

    @Test
    public void canSetCorrectAnswer(){
        question1.addAnswerOption('a', "Bruce Wayne");
        question1.addAnswerOption('b', "Clark Kent");
        question1.setCorrectAnswer('b');
        assertEquals('b', question1.getCorrectAnswer());
    }
}
