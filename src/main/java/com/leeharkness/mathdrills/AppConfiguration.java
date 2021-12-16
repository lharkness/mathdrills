package com.leeharkness.mathdrills;

/**
 * Describes the application configuration
 */
public class AppConfiguration {

    private final int iterations;
    private final String type;
    private final int minMagnitude;
    private final int maxMagnitude;

    public AppConfiguration(String[] args) {
        if (args.length > 0) {
            this.type = args[0];
            String[] paramParts = args[1].split(",");
            this.minMagnitude = Integer.parseInt(paramParts[0]);
            this.maxMagnitude = Integer.parseInt(paramParts[1]);
            this.iterations = Integer.parseInt(args[2]);
        }
        else {
            this.type = "x";
            this.maxMagnitude = 2;
            this.minMagnitude = 1;
            this.iterations = 3;
        }
    }

    public static AppConfiguration from(String[] args) {
        return new AppConfiguration(args);
    }

    /**
     * The number of times to iterate
     * @return the number of times to iterate
     */
    public int getIterations() {
        return iterations;
    }

    /**
     * The type of operation
     * @return the type of operation
     */
    public String getType() {
        return type;
    }

    /**
     * The minimum number of digits
     * @return The minimum number of digits
     */
    public int getMinMagnitude() {
        return minMagnitude;
    }

    /**
     * The maximum number of digits
     * @return The maximum number of digits
     */
    public int getMaxMagnitude() {
        return maxMagnitude;
    }
}
