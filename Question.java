import java.util.Scanner;

public abstract class Question {
    String questionText;
    public Question(String questionText) {
        this.questionText = questionText;
    }

    public abstract void ask(Scanner input);

    public abstract boolean isCorrect();
}
