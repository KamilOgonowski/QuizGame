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
        generatedListOfQuestions =  new Questions[numberOfQuestions];
        indexesOfQuestionsUsedToGenerate = new int [numberOfQuestions];
        for (int i = 0; i<numberOfQuestions; i++){
            this.generatedListOfQuestions[i] = drawQuestionToGeneratedList(i);
            }
        return generatedListOfQuestions; //added to disable compile-time error - probably this will be correct return, or not return at al will be needed
    }

    public Questions drawQuestionToGeneratedList(int indexOfQuestion) {
        int idToBeChecked;
        boolean check;
        do {
            idToBeChecked = generateTest();
            check = false;  // Set check to false initially

            for (int i = 0; i < indexOfQuestion; i++) {
                if (indexesOfQuestionsUsedToGenerate[i] == idToBeChecked) {
                    check = true;  // If duplicate is found, set check to true
                    break;  // No need to continue checking, exit the loop
                }
            }
        } while (check);  // Repeat until you find a non-duplicate id

        indexesOfQuestionsUsedToGenerate[indexOfQuestion] = idToBeChecked;
        return listOfQuestions[idToBeChecked];
    }


    public void printGeneratedList(Questions [] generatedListOfQuestions){
        System.out.println(Arrays.toString(generatedListOfQuestions));
    }

    public void printIndexes(){
        System.out.println(Arrays.toString(indexesOfQuestionsUsedToGenerate));
    }

    public int generateTest(){
        return random.nextInt(listOfQuestions.length);
    }
}
