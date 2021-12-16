package com.leeharkness.mathdrills;

public class ProblemStatistics {

    private int totalQuestions;
    private int totalCorrect;

    public ProblemStatistics() {
        totalQuestions = 0;
        totalCorrect = 0;
    }

    public void recordCorrectAnswer() {
        totalQuestions++;
        totalCorrect++;
    }

    public void recordIncorrectAnswer() {
        totalQuestions++;
    }

    @Override
    public String toString() {
        return ("Performance: " + (totalCorrect / (float)totalQuestions) * 100);
    }
}
