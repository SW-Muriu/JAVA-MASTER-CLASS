package OOP.OOP1Inheritance.SumCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;


    //Functional Methods
    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        return (getSecondNumber() == 0) ? 0 : (getFirstNumber() / getSecondNumber());
    }

    //Getters and Setters

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
