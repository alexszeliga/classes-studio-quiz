import java.util.ArrayList;
import java.util.Scanner;
class QuizRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<Question>();
        int correctQuestions = 0;
        EitherOr testQuestion1 = new EitherOr("Why does the porridge bird lay its eggs in the air?", false);
        EitherOr testQuestion2 = new EitherOr("Do you know the way to San Jose?", true);
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("London");
        answers.add("Cheeseburger");
        answers.add("Baseball");
        MultipleChoice testQuestion3 = new MultipleChoice("What is a city?", answers, 0);
        questions.add(testQuestion1);
        questions.add(testQuestion2);
        questions.add(testQuestion3);
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            q.ask(input);
            boolean isCorrect = q.isCorrect();
            if (isCorrect) {
                System.out.println("Correct");
                correctQuestions++;
            } else {
                System.out.println("Incorrect");
            }
        }
        input.close();
        System.out.println("You've made it to the end! Here's your score! Out of a total of " + questions.size() + " you answered " + correctQuestions + " correct." );
    }
}