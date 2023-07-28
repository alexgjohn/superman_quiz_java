import Game.*;
import GameComponents.*;

public class Runner {

    public static void main(String[] args) {

        QuizQuestion question1 = new QuizQuestion(1, "What is Superman's secret identity?", "Clark Kent is a mild-mannered reporter for a major metropolitan newspaper.");
        AnswerOption option1A = new AnswerOption('a', "Bruce Wayne");
        AnswerOption option1B = new AnswerOption('b', "Clark Kent");
        AnswerOption option1C = new AnswerOption('c', "Peter Parker");
        AnswerOption option1D = new AnswerOption('d', "Harry Hill");
        question1.addAnswerOption(option1A);
        question1.addAnswerOption(option1B);
        question1.addAnswerOption(option1C);
        question1.addAnswerOption(option1D);
        question1.setCorrectAnswer('b');
        QuizGame game = new QuizGame();
        game.addQuestion(question1);

        QuizQuestion question2 = new QuizQuestion(2, "In which comics did Superman make his debut?", "Superman debuted in the very first issue of Action Comics, in June of 1938.");
        AnswerOption option2A = new AnswerOption('a', "Action Comics");
        AnswerOption option2B = new AnswerOption('b', "Detective Comics");
        AnswerOption option2C = new AnswerOption('c', "Adventure Comics");
        AnswerOption option2D = new AnswerOption('d', "Amazing Fantasy");
        question2.addAnswerOption(option2A);
        question2.addAnswerOption(option2B);
        question2.addAnswerOption(option2C);
        question2.addAnswerOption(option2D);
        question2.setCorrectAnswer('a');
        game.addQuestion(question2);

        QuizQuestion question3 = new QuizQuestion(3, "Clark Kent grew up in the fictional Smallville, located in which non-fictional US state?", "Smallville was first named as Superman's home town in Superboy #2, published in 1949.");

        QuizQuestion question4 = new QuizQuestion(4, "Which of these Super-adjacent LLs did I just invent?", "I imagine Larry to be a pizza delivery guy.");

        QuizQuestion question5 = new QuizQuestion(5, "How does Jimmy Olsen typically contact Superman?", "Jimmy is Superman's pal, and also very prone to getting into sticky situations. That's why Supes made him this handy wristwatch that emits a high-frequency call to the Man the Steel.");

        QuizQuestion question6 = new QuizQuestion(6, "When Lex Luthor is occasionally shown with a full head of hair, what colour is it?", "In fact, Luthor's first appearance in 1940 had him with a beautiful ginger hairdo. Have you noticed these questions are getting harder?");

        QuizQuestion question7 = new QuizQuestion(7, "Which of these replacement Superman from the Death of Superman sage never actually claimed to be Superman?", "John Henry Irons, AKA Steel, never claimed to be Superman. He just called himself the Man Of Steel and flew around with a big 'S' on his chest.");

        QuizQuestion question8 = new QuizQuestion(8, "Which of these El's is not a blood relative of Superman?", "Mon-El isn't a relative of Superman or even Kryptonian. He comes from the somewhat-similar planet Daxam and has extremely similar powers. He's also a member of the Legion of Superheroes in the 31st century.");

        QuizQuestion question9 = new QuizQuestion(9, "Superman's favourite film is an adaptation of a classic American novel. What is it?", "It's not as well-known as Batman's Zorro fanaticism, but it really tells you a lot about Clark Kent's values. Onto the final question!");

        QuizQuestion question10 = new QuizQuestion(10, "In which medium was Kryptonite, Superman's greatest weakness, introduced?", "The legend goes that the actor playing Superman on the show was sick and they needed an excuse to have Superman out of commission for a few episodes.");







        game.runQuizGame();
    }
}
