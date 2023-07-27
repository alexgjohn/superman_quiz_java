import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnswerOptionTest {

    private AnswerOption optionA;

    private AnswerOption optionB;

    @Before
    public void before(){
        optionA = new AnswerOption('a', "Bruce Wayne");
        optionB = new AnswerOption('b', "Clark Kent");
    }

    @Test
    public void hasOptionLetter(){
        assertEquals('a', optionA.getOptionLetter());
    }

    @Test
    public void hasOptionText(){
        assertEquals("Clark Kent", optionB.getOptionText());
    }
}
