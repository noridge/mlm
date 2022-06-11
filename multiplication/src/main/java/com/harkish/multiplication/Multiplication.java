package com.harkish.multiplication;

import com.harkish.addition.Addition;

public class Multiplication {
    private Addition addition;

    public Multiplication() {
        addition = new Addition();
    }

    public int multiply(int value1, int value2) {
        int result = 0;
        for (int i = 0; i < value2; i++) {
            result = addition.add(value1, result);
        }
        return result;
    }
}
