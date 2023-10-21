import java.util.Arrays;

public class SetTheQuiz {
    // later add types of questions: easy/ medium/ hard/ mixed_up
    // add also allOrNothingMode -> extra points for making correct answers in raw, but also you can lose much more
    //numberOfQuestion should be initialized only once while
    public static int numberOfQuestions;
    public static int numberOfPlayers;
    public User [] listOfPlayers = new User [numberOfPlayers];

    static {

        numberOfQuestions = Console.getInput("Please write how many questions you would like to have in the quiz: ");
        numberOfPlayers = Console.getInput("How many players are going to compete (max 3): ");
    }


    public void start()
    {
        System.out.println("Welcome to Java Quiz!");
        System.out.println();
        for (int i = 0; i < numberOfPlayers; i++){
            int numOfPlayer = i + 1;
            System.out.println("Player " + numOfPlayer);
            listOfPlayers[i] = new User();
        }
    }



}
