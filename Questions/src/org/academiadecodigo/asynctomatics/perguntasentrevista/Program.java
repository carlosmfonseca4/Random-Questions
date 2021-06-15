package org.academiadecodigo.asynctomatics.perguntasentrevista;

public class Program {

    public String makeAQuestion() {

        switch (Random.randomNumber(16)) {

            case 0:
                return Questions.QUESTION_1;
            case 1:
                return Questions.QUESTION_2;
            case 2:
                return Questions.QUESTION_3;
            case 3:
                return Questions.QUESTION_4;
            case 4:
                return Questions.QUESTION_5;
            case 5:
                return Questions.QUESTION_6;
            case 6:
                return Questions.QUESTION_7;
            case 7:
                return Questions.QUESTION_8;
            case 8:
                return Questions.QUESTION_9;
            case 9:
                return Questions.QUESTION_10;
            case 10:
                return Questions.QUESTION_11;
            case 11:
                return Questions.QUESTION_12;
            case 12:
                return Questions.QUESTION_13;
            case 13:
                return Questions.QUESTION_14;
            case 14:
                return Questions.QUESTION_15;
            default:
                return "Unknown Question";
        }
    }

    public void go(){
        makeAQuestion();
    }
}
