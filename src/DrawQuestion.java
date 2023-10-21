import java.util.Arrays;
import java.util.Random;

public class DrawQuestion {
    private static Random random = new Random();
    PoolOfQuestions poolOfQuestions;
    Questions [] listOfQuestions;
    Questions [] generatedListOfQuestions;
    int [] indexesOfQuestionsUsedToGenerate;



    public DrawQuestion(PoolOfQuestions poolOfQuestionsObject){
        this.poolOfQuestions = poolOfQuestionsObject;
        this.listOfQuestions = poolOfQuestions.listOfQuestions;
    }


    public Questions[] generateList(int numberOfQuestions){  // numberOfQuestions describes how many questions have been set at the very beginning while creating the quiz
        this.generatedListOfQuestions =  new Questions[numberOfQuestions];
        System.out.println("dlugosc listy wynosi " + generatedListOfQuestions.length);

        for (int i = 0; i<numberOfQuestions; i++){
            this.generatedListOfQuestions[i] = drawQuestionToGeneratedList(numberOfQuestions);
            }
        return generatedListOfQuestions; //added to disabled compiletime error - probably this will be correct return, or not return at al will be needed
    }


    public Questions drawQuestionToGeneratedList(int numberOfQuestions){
        while (true){
            int idToBeChecked = random.nextInt(listOfQuestions.length);
            indexesOfQuestionsUsedToGenerate = new int [numberOfQuestions];
//            while(true){

                for (int i = 0; i < numberOfQuestions; i++){
//                    while(true){
                        for (int num : indexesOfQuestionsUsedToGenerate){
                            if (num==idToBeChecked)
                                break;
                        }
                        return listOfQuestions[idToBeChecked];
//                    }



//                    if(generatedListOfQuestions[0] == null){
//                        generatedListOfQuestions[0] = listOfQuestions[idToBeChecked];
//                        indexesOfQuestions = new int [numberOfQuestions];
//                        indexesOfQuestions[0]=idToBeChecked;
//                    } else{
//                        if()
//
//
//                    }
//                    if(question.id == null)
//                        break;
                }
//                for (int i =0; i<listOfQuestions.length; i++){
//                    if (listOfQuestions[i].id == idToBeChecked){
//                        return listOfQuestions[i];
////                        generatedListOfQuestions[number] = listOfQuestions[i];
//                    }
//                }
            }
        }

    public void printGeneratedList(Questions [] generatedListOfQuestions){
        System.out.println(Arrays.toString(generatedListOfQuestions));
    }
}
