package GameComponents;

public class AnswerOption {

    private char optionLetter;

    private String optionText;

    public AnswerOption(char optionLetter, String optionText) {
        this.optionLetter = optionLetter;
        this.optionText = optionText;
    }

    public char getOptionLetter() {
        return this.optionLetter;
    }

    public String getOptionText() {
        return this.optionText;
    }
}
