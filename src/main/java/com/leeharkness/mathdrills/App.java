package com.leeharkness.mathdrills;

/**
 * Driver application for Math Drills.  Describe the drills in a configuration file or on the command line
 * (or take the default - 2-digit addition) and the system will present random problems according to the
 * parameters given.  At the end of the drill set the system will display the results.
 */
public class App {

    private final AppConfiguration appConfig;
    private final ProblemGenerator problemGenerator;

    /**
     * Initialization ctor
     * @param appConfig The application configuration
     */
    public App(AppConfiguration appConfig) {
        this.appConfig = appConfig;
        this.problemGenerator = new ProblemGenerator(appConfig);
    }

    /**
     * Main Program Entry Point.
     * @param args optional command-line arguments.  Used to initialize the AppConfiguration
     */
    public static void main(String[] args ) {
        AppConfiguration appConfig = AppConfiguration.from(args);
        App app = new App(appConfig);
        app.start();
    }

    /**
     * Starts the application
     */
    private void start() {
        System.out.print("What is your name? ");
        String name = System.console().readLine();
        System.out.print("Hello " + name + ".  Would you like to play a game?");
        System.console().readLine();
        for (int i = 0; i < appConfig.getIterations(); i++) {
            Problem problem = problemGenerator.generateProblem();
            System.out.println(problem.getDescription());
            String answer = System.console().readLine();
            System.out.println(problem.recordAnswer(answer));
        }

        System.out.println(problemGenerator.getStatistics());
    }
}
