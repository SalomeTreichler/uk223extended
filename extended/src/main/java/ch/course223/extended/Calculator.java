package ch.course223.extended;

public class Calculator {
    MathematicalOperation add = (int x, int y) -> (x + y);
    MathematicalOperation subtract = (int x, int y) -> (x - y);
    MathematicalOperation multiply = (int x, int y) -> (x * y);

    public int getResult(int x, int y, MathematicalOperation mathematicalOperation){
        return mathematicalOperation.executeNumericalOperation(x,y);
    }

    //calculator.getResult(2,3, add); RESULTAT ist 5
    //calculator.getResult(2,3, multiply); RESULTAT ist 6
    //calculator.getResult(2,3, subtract); RESULTAT ist -1
}
