package com.practise.practise.creator;


public class UserRequirements {

    private int min;
    private int max;
    private String[] arrayString;
    private int countOfString;

    public UserRequirements(int min, int max, String[] arrayString, int countOfString) {
        this.min = min;
        this.max = max;
        this.arrayString = arrayString;
        this.countOfString = countOfString;
    }

    public UserRequirements() {
    }

    public int getCountOfString() {
        return countOfString;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String[] getArrayString() {
        return arrayString;
    }

    public void setArrayString(String[] arrayString) {
        this.arrayString = arrayString;
    }
}
