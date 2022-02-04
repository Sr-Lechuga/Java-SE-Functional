package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;
import com.platzi.jobsearch.cli.CLIArguments;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.platzi.jobsearch.CommanderFunctions.buildCommanderWithName;
import static com.platzi.jobsearch.CommanderFunctions.parseArguments;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI = parseArguments(jCommander, args, JCommander::usage)
                    .orElse(Collections.emptyList())
                    .stream()
                    .map(object -> (CLIArguments) object);

        Optional<CLIArguments> cliArgumentsOptional = streamOfCLI
                .filter(cli -> !cli.isHelp())
                .filter(cli -> cli.getKeyword() != null)
                .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(JobSearch::excecuteRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }

    private static Stream<JobPosition> excecuteRequest(Map<String,Object> params){

    }
}
