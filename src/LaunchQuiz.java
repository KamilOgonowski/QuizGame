public class LaunchQuiz {
    public static void main(String[] args) {
        SetTheQuiz setTheQuiz = new SetTheQuiz();
        setTheQuiz.start();
        PoolOfQuestions poolOfQuestions = new PoolOfQuestions();
        for (Questions question : poolOfQuestions.ListOfQuestions){
            System.out.println(question.printQuestion());
        }
    }
}