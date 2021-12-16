package com.leeharkness.mathdrills;

/**
 * Describes a problem to be given
 */
public class Problem {
    private final ProblemStatistics statistics;
    private final String type;
    private final int firstOperand;
    private final int secondOperand;
    private final int correctAnswer;

    public Problem(String type, int firstOperand, int secondOperand, ProblemStatistics statistics) {
        this.type = type;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.statistics = statistics;

        int answer = 0;
        if (type.equals("+")) {
            answer = firstOperand + secondOperand;
        }
        else if (type.equals("x")) {
            answer = firstOperand * secondOperand;
        }
        this.correctAnswer = answer;
    }

    /**
     * Displays the problem
     * @return a String representation of the problem
     */
    public String getDescription() {
        return firstOperand + " " + type + " " + secondOperand;
    }

    /**
     * Records a user's answer
     * @param answer The user's answer
     * @return a description of the results of the user's answer
     */
    public String recordAnswer(String answer) {
        int usersAnswer = Integer.parseInt(answer);
        String retVal;

        if (usersAnswer == correctAnswer) {
            statistics.recordCorrectAnswer();
            retVal = "Correct!";
        }
        else {
            statistics.recordIncorrectAnswer();
            retVal = "Incorrect :(  The answer is " + correctAnswer;
        }

        return retVal;
    }
}
