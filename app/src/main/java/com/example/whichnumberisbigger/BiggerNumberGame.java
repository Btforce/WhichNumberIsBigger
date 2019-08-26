package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lowerLimit;
    private int upperLimit;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        score = 0;
        generateRandomNumbers();
    }

    public void generateRandomNumbers(){
        //generate a number between the upper and lower limits inclusive
        //store that in number 1
        //generate another number and make sure that it is a different number
        //store that into number2
        number1 = (int)(Math.random()*(upperLimit - lowerLimit + 1)) + lowerLimit;
        do{
            number2 =(int)(Math.random()*(upperLimit - lowerLimit + 1)) + lowerLimit;
        }   while(number1 == number2);


    }

    public String checkAnswer(int answer){
        //determine if the answer is right
            //based on the values of number 1 and number 2
        //update the score accordingly
        //return a relevant message
        int correctAnswer = Math.max(number1, number2);
        if(correctAnswer == answer){
            score++;
            return "Correct!";
        }
        else{
            score--;
            return "Incorrect";
        }
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getScore() {
        return score;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }


}
