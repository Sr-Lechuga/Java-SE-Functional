package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            description = "KEYWORD",
            validateWith = CLIKeywordValidator.class
    )
    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "each search could include an location"
    )
    private String location;

    @Parameter(
            names = {"--page", "-p"},
            description = "API return 50 results per page, use a number for page"
    )
    private int page = 0;

    @Parameter(
            names = {"--full-time"},
            description = "If full time jobs wanted"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--MarkedDown"},
            description = "Get markdown results"
    )
    private boolean isMarkedDown = false;

    @Parameter(
            names = {"--help", "-h"},
            help = true,//Specify this is the help
            description = "Show help",
            validateWith = CLIHelpValidator.class
    )
    private boolean isHelp;


    //Getters
    public String getKeyword() {
        return keyword;
    }
    public String getLocation() {
        return location;
    }
    public int getPage() {
        return page;
    }
    public boolean isFullTime() {
        return isFullTime;
    }
    public boolean isMarkedDown() {
        return isMarkedDown;
    }
    public boolean isHelp() {
        return isHelp;
    }

    //Constructor
    public CLIArguments() {
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkedDown=" + isMarkedDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }

}
