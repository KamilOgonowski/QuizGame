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

    public void answerTheQuestion(Questions question){
        for(User user: listOfPlayers){
            int userAnswer = getUserAnswer(user);
            if(userAnswer == question.getIndexOfCorrectAnswer()){
                int points = user.getPoints() + question.getPoints();
                user.setPoints(points);
                System.out.println("Congratulation! you answered correctly!!! Your have just earned " + question.getPoints() + " to your account and now you have " + user.getPoints());
            } else{
                user.setPoints(user.getPoints()-1);
                System.out.println("Unfortunately! you answered is incorrect!!! You have just los 1 point and now you have " + user.getPoints());
            }

        }

    }

    public int getUserAnswer(User user){
        String answer = (Console.getStringInput(user.getName() + " it is your turn to answer. Chose correct option A/B/C/D: ")).toUpperCase();
        switch(answer){
            case "A" -> {return 0;}
            case "B" -> {return 1;}
            case "C" -> {return 2;}
            case "D" -> {return 3;}
        }
        return 99;
    }



}
