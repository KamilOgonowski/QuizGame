import java.util.Arrays;
import java.util.Random;

public class DrawQuestion {
    private static Random random = new Random();
    PoolOfQuestions poolOfQuestions;
    Questions [] listOfQuestions;
    Questions [] generatedListOfQuestions;



    public DrawQuestion(PoolOfQuestions poolOfQuestionsObject){
        this.poolOfQuestions = poolOfQuestionsObject;
        this.listOfQuestions = poolOfQuestions.listOfQuestions;
    }


    public Questions[] generateList(int numberOfQuestions){  // numberOfQuestions describes how many questions have been set at the very beginning while creating the quiz
        this.generatedListOfQuestions =  new Questions[numberOfQuestions];
        for (int i = 0; i<numberOfQuestions; i++){
            if (i==0){
                generatedListOfQuestions[i] = new Questions(0,"Test?: ",
                        new String[]{"Mutable class","String class", "String class", "StringBuilder class"},
                        3,2);
            }
            generatedListOfQuestions[i] = drawQuestionToGeneratedList();
        }
        return generatedListOfQuestions; //added to disabled compiletime error - probably this will be correct return, or not return at al will be needed
    }

    public Questions drawQuestionToGeneratedList(){
        while (true){
            int idToBeChecked = random.nextInt(listOfQuestions.length);
            while(true){

                for (Questions question : generatedListOfQuestions){

                    if(question.id == idToBeChecked)
                        break;
                }
                for (int i =0; i<listOfQuestions.length; i++){
                    if (listOfQuestions[i].id == idToBeChecked){
                        return listOfQuestions[i];
//                        generatedListOfQuestions[number] = listOfQuestions[i];
                    }
                }
            }
        }


    }

    public void printGeneratedList(Questions [] generatedListOfQuestions){
        System.out.println(Arrays.toString(generatedListOfQuestions));
    }
}
