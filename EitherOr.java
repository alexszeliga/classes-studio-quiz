import java.util.Scanner;
import java.util.InputMismatchException;

public class EitherOr extends Question{
    boolean correctAnswer;
    boolean userAnswer;
    public EitherOr(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void ask(Scanner input) {
        System.out.println(questionText);
        try {
            this.userAnswer = input.nextBoolean();
        } catch (InputMismatchException ex) {
            System.out.println("Please respone with true or false only");
            this.ask(input);
        }         
    }

    @Override
    public boolean isCorrect() {
        return this.correctAnswer == this.userAnswer;
    }
    
}
