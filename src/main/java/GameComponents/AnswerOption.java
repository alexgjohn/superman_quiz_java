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

    public void formatAnswerOption(){
        String formattedOption = String.format("%s) %s", this.optionLetter, this.optionText);
        System.out.println(formattedOption);
    }
}
