package day06_ArithmeticOperators;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 15000;

        double lira = dollar / 0.13;
        double euro = 1000 / 1.16;
        double manat = 1000 * 3.5;
        double rouble = 1000 * 78.22;
        double JYP = 1000 / 0.09;
        double som = 1000 * 80;

        String result = dollar +" $ equal to ";
        System.out.println(dollar+" $ equal to "+lira+" Lira ");
        System.out.println(dollar+" $ equal to "+euro+" euro");
        System.out.println(result+manat+"manat");
        System.out.println(result+rouble+" rouble");
        System.out.println(result+JYP+"JYP");







    }
}
