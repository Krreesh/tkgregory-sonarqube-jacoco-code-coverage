package com.tom.service;

public class MathService {
    public int multiply(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        Integer myInt = null;        // Added to test bad code
        Integer yourInt = myInt * 2;    // Added to test bad code
        return firstNumber - secondNumber;
    }
}
