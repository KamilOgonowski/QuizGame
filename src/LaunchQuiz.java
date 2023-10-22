import java.util.Arrays;

public class LaunchQuiz {
    public static void main(String[] args) {
        SetTheQuiz setTheQuiz = new SetTheQuiz();
        setTheQuiz.start();

        DrawQuestion createPoolOfQuestions = new DrawQuestion(new PoolOfQuestions());
        createPoolOfQuestions.generateList(SetTheQuiz.numberOfQuestions);

        for (int i=0; i< createPoolOfQuestions.generatedListOfQuestions.length; i++){
            System.out.println( i+1 + createPoolOfQuestions.generatedListOfQuestions[i].printQuestion());

        }

    }
}