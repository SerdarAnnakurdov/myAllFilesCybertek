package day11_MultiBranchIf;

public class QuizQuestions {
    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 200;
        float fvar =  300;

        ivar = (int)fvar; // explicit casting   short cats - hold Alt+hitthe - Enter
        fvar = (float) ivar; // implicit casting
        dvar = fvar; // implicit casting
        fvar = (float) dvar;
        dvar = ivar;// implicit ..
        ivar = (int) dvar; // explicit casting


        System.out.println(3%2);


    }
}
