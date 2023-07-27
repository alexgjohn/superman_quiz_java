import java.util.ArrayList;

public class QuizQuestion {

    private int questionNumber;
    private String questionText;

    private ArrayList<AnswerOption> options;

    private char correctAnswer;

    public QuizQuestion(int questionNumber, String questionText) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.options = new ArrayList<>();
        this.correctAnswer = 'a';
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

    public void addAnswerOption(char optionLetter, String optionText) {
        AnswerOption option = new AnswerOption(optionLetter, optionText);
        this.options.add(option);
    }

    public void setCorrectAnswer(char optionLetter) {
        this.correctAnswer = optionLetter;
    }
}
