package com.leeharkness.mathdrills;

import java.util.Random;

/**
 * Generates problems
 */
public class ProblemGenerator {

    private final AppConfiguration appConfiguration;
    private final Random rng = new Random();
    private final ProblemStatistics problemStatistics = new ProblemStatistics();

    /**
     * Initialization constructor
     * @param appConfig
     */
    public ProblemGenerator(AppConfiguration appConfig) {
        this.appConfiguration = appConfig;
    }

    public Problem generateProblem() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < appConfiguration.getMaxMagnitude(); i++) {
            sb.append(9);
        }
        int max = Integer.parseInt(sb.toString());
        sb = new StringBuilder();
        for (int i = 0; i < appConfiguration.getMinMagnitude(); i++) {
            sb.append(9);
        }
        int min = Integer.parseInt(sb.toString());
        int firstOperand = rng.nextInt(max);
        int secondOperand = rng.nextInt(min);

        return new Problem(appConfiguration.getType(), firstOperand, secondOperand, problemStatistics);
    }

    public ProblemStatistics getStatistics() {
        return problemStatistics;
    }
}
