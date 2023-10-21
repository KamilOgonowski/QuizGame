public class LaunchQuiz {
    public static void main(String[] args) {
        SetTheQuiz setTheQuiz = new SetTheQuiz();
        setTheQuiz.start();

        DrawQuestion createPoolOfQuestions = new DrawQuestion(new PoolOfQuestions());
        createPoolOfQuestions.generateList(6);

//        PoolOfQuestions poolOfQuestions = new PoolOfQuestions();
//        for (Questions question : poolOfQuestions.listOfQuestions){
//            System.out.println(question.printQuestion());
//        }
    }
}