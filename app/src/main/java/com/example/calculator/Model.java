package com.example.calculator;

public class Model {
    private double operand1, operand2;
    private String operation;

    public Model(){
        operand1 = 0;
        operand2 = 0;
        operation = null;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double doOperation(){
        switch(operation){
            case "add":
                operand1 += operand2;
                break;
            case "subtract":
                operand1 -= operand2;
                break;
            case "divide":
                operand1 /= operand2;
                break;
            case "multiply":
                operand1 *= operand2;
                break;
            case "C":{
                operand1 = 0;
                operand2 = 0;
                operation = null;
            }
            case "percent":
                operand1 /= 100;
                break;
            case "percent2":
                operand2 /= 100;
                return operand2;
            case "sign":
                operand1 = -1 * operand1;
                break;
            case "sign2":
                operand2 = -1 * operand2;
                return operand2;
            case "equal":
            break;
            default:
                operand1 = 0;
                operand2 = 0;
                operation = null;
        }
        return operand1;
    }
}
