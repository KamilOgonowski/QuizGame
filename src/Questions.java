public class Questions {
    int id;
    String question;
    String[] listOfAnswers;
    int indexOfCorrectAnswer;
    int points;
    //points should be replaced by level grouping questions by points


    // I would like to add every created question to listOfQuestions available in the PoolOfQUestions class
    public Questions(int id, String question, String[] listOfAnswers, int indexOfCOrrectAnswers, int points){
        this.id = id;
        this.question= question;
        this.listOfAnswers = listOfAnswers;
        this.indexOfCorrectAnswer = indexOfCOrrectAnswers;
        this.points = points;
    }


    public String printQuestion(){
        return ". " + question + "\n\n" + printAnswers();
    }
    public String printAnswers(){
        String result = "";
        for (int i = 0 ; i < listOfAnswers.length ; i++){
            result += indicateOnOption(i) + ". " + listOfAnswers[i] + "\n";
        }
        return result;
    }

    public String indicateOnOption(int num){
        switch(num){
            case 0 -> {return "A";}
            case 1 -> {return "B";}
            case 2 -> {return "C";}
            case 3 -> {return "D";}
        }
        return null;
    }



}
