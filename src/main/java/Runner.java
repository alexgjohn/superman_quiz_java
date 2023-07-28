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
        AnswerOption option3a = new AnswerOption('a', "Ohio");
        AnswerOption option3b = new AnswerOption('b', "Nebraska");
        AnswerOption option3c = new AnswerOption('c', "Texas");
        AnswerOption option3d = new AnswerOption('d', "Kansas");
        question3.addAnswerOption(option3a);
        question3.addAnswerOption(option3b);
        question3.addAnswerOption(option3c);
        question3.addAnswerOption(option3d);
        question3.setCorrectAnswer('d');
        game.addQuestion(question3);

        QuizQuestion question4 = new QuizQuestion(4, "Which of these Super-adjacent LLs did I just invent?", "I imagine Larry to be a pizza delivery guy.");
        AnswerOption option4a = new AnswerOption('a', "Larry Lark");
        AnswerOption option4b = new AnswerOption('b', "Lana Lang");
        AnswerOption option4c = new AnswerOption('c', "Lois Lane");
        AnswerOption option4d = new AnswerOption('d', "Lori Lemaris");
        question4.addAnswerOption(option4a);
        question4.addAnswerOption(option4b);
        question4.addAnswerOption(option4c);
        question4.addAnswerOption(option4d);
        question4.setCorrectAnswer('a');
        game.addQuestion(question4);


        QuizQuestion question5 = new QuizQuestion(5, "How does Jimmy Olsen typically contact Superman?", "Jimmy is Superman's pal, and also very prone to getting into sticky situations. That's why Supes made him this handy wristwatch that emits a high-frequency call to the Man the Steel.");
        AnswerOption option5a = new AnswerOption('a', "With a fax machine");
        AnswerOption option5b = new AnswerOption('b', "With a whistle");
        AnswerOption option5c = new AnswerOption('c', "With a flare gun");
        AnswerOption option5d = new AnswerOption('d', "With a signal watch");
        question5.addAnswerOption(option5a);
        question5.addAnswerOption(option5b);
        question5.addAnswerOption(option5c);
        question5.addAnswerOption(option5d);
        question5.setCorrectAnswer('d');
        game.addQuestion(question5);

        QuizQuestion question6 = new QuizQuestion(6, "When Lex Luthor is occasionally shown with a full head of hair, what colour is it?", "In fact, Luthor's first appearance in 1940 had him with a beautiful ginger hairdo. Have you noticed these questions are getting harder?");
        AnswerOption option6a = new AnswerOption('a', "Black");
        AnswerOption option6b = new AnswerOption('b', "Brown");
        AnswerOption option6c = new AnswerOption('c', "Ginger");
        AnswerOption option6d = new AnswerOption('d', "Blonde");
        question6.addAnswerOption(option6a);
        question6.addAnswerOption(option6b);
        question6.addAnswerOption(option6c);
        question6.addAnswerOption(option6d);
        question6.setCorrectAnswer('c');
        game.addQuestion(question6);

        QuizQuestion question7 = new QuizQuestion(7, "Which of these replacement Superman from the Death of Superman sage never actually claimed to be Superman?", "John Henry Irons, AKA Steel, never claimed to be Superman. He just called himself the Man Of Steel and flew around with a big 'S' on his chest.");
        AnswerOption option7a = new AnswerOption('a', "Superboy");
        AnswerOption option7b = new AnswerOption('b', "The Man Of Steel");
        AnswerOption option7c = new AnswerOption('c', "The Cyborg Superman");
        AnswerOption option7d = new AnswerOption('d', "The Eradicator");
        question7.addAnswerOption(option7a);
        question7.addAnswerOption(option7b);
        question7.addAnswerOption(option7c);
        question7.addAnswerOption(option7d);
        question7.setCorrectAnswer('b');
        game.addQuestion(question7);

        QuizQuestion question8 = new QuizQuestion(8, "Which of these El's is not a blood relative of Superman?", "Mon-El isn't a relative of Superman or even Kryptonian. He comes from the somewhat-similar planet Daxam and has extremely similar powers. He's also a member of the Legion of Superheroes in the 31st century.");
        AnswerOption option8a = new AnswerOption('a', "Jor El");
        AnswerOption option8b = new AnswerOption('b', "Kara Zor El");
        AnswerOption option8c = new AnswerOption('c', "Mon El");
        AnswerOption option8d = new AnswerOption('d', "Seg El");
        question8.addAnswerOption(option8a);
        question8.addAnswerOption(option8b);
        question8.addAnswerOption(option8c);
        question8.addAnswerOption(option8d);
        question8.setCorrectAnswer('c');
        game.addQuestion(question8);

        QuizQuestion question9 = new QuizQuestion(9, "Superman's favourite film is an adaptation of a classic American novel. What is it?", "It's not as well-known as Batman's Zorro fanaticism, but it really tells you a lot about Clark Kent's values. Onto the final question!");
        AnswerOption option9a = new AnswerOption('a', "The Great Gatsby");
        AnswerOption option9b = new AnswerOption('b', "The Catcher In The Rye");
        AnswerOption option9c = new AnswerOption('c', "The Grapes of Wrath");
        AnswerOption option9d = new AnswerOption('d', "To Kill A Mockingbird");
        question9.addAnswerOption(option9a);
        question9.addAnswerOption(option9b);
        question9.addAnswerOption(option9c);
        question9.addAnswerOption(option9d);
        question9.setCorrectAnswer('d');
        game.addQuestion(question9);

        QuizQuestion question10 = new QuizQuestion(10, "In which medium was Kryptonite, Superman's greatest weakness, introduced?", "The legend goes that the actor playing Superman on the show was sick and they needed an excuse to have Superman out of commission for a few episodes.");
        AnswerOption option10a = new AnswerOption('a', "Comics");
        AnswerOption option10b = new AnswerOption('b', "Radio");
        AnswerOption option10c = new AnswerOption('c', "Television");
        AnswerOption option10d = new AnswerOption('d', "Film");
        question10.addAnswerOption(option10a);
        question10.addAnswerOption(option10b);
        question10.addAnswerOption(option10c);
        question10.addAnswerOption(option10d);
        question10.setCorrectAnswer('b');
        game.addQuestion(question10);






        game.runQuizGame();
    }
}
