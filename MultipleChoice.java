import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleChoice extends Question {
    
    ArrayList<String> answers;
    int indexOfCorrectAnswer;
    int userAnswer;

    public MultipleChoice(String questionText, ArrayList<String> answers, int indexOfCorrectAnswer) {
        super(questionText);
        this.answers = answers;
        this.indexOfCorrectAnswer = indexOfCorrectAnswer;
    }
    
    @Override
    public void ask(Scanner input) {
        System.out.println(questionText);
        for (int i = 0; i < answers.size(); i++) {
            System.out.println(i + ": " + answers.get(i));
        }
        try {
            // if (input.hasNextInt() && this.userAnswer >= answers.size()) {
            //     this.userAnswer = input.nextInt();
            // } else {
            //     System.out.println("Please respond with an integer in range!");
            //     this.ask(input);
            // }
            if (input.hasNextInt()) {
                int userInput = input.nextInt();
                if (userInput < answers.size()) {
                    this.userAnswer = userInput;
                } else {
                    System.out.println("Please respond with an integer in range!");
                }
                
            }
        } catch (InputMismatchException ex) {
            System.out.println("Please respond with an integer only!");
            this.ask(input);
        } 
    
    }

    @Override
    public boolean isCorrect() {
        return this.userAnswer == this.indexOfCorrectAnswer;
    }
    
}
