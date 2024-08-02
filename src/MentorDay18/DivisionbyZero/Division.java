package MentorDay18.DivisionbyZero;

class Division {
    public double divideNumbers(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return (double) num1 / num2;
    }
}

