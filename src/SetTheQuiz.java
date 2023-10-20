public class SetTheQuiz {
    // later add types of questions: easy/ medium/ hard/ mixed_up
    // add also allOrNothingMode -> extra points for making correct answers in raw, but also you can lose much more
    private int numberOfQuestions;

    public void start()
    {
        System.out.println("Welcome to Java Quiz!");
        numberOfQuestions = Console.getInput("How many questions set for the competition?: ");
    }

}
