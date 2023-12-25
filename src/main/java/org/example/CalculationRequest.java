package org.example;

public class CalculationRequest {
    private final long num1;
    private final long num2;
    private final String operation;

    public CalculationRequest(String[] args) {
        if (args.length != 3) {
            throw new BadRequestException();
        }
        if (args[1].length() != 1) {
            throw new InvalidOperatorException();
        }
        isValidOperation(args[1]);

        this.num1 = Long.parseLong(args[0]);
        this.num2 = Long.parseLong(args[2]);
        this.operation =  args[1];
    }

    private static void isValidOperation(String operation) {
        if(!operation.equals("+")
        && !operation.equals("-")
        && !operation.equals("*")
        && !operation.equals("/")) {
            throw new InvalidOperatorException();
        }
    }

    public long getNum1() {
        return num1;
    }

    public long getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }
}
