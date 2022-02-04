package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;

import java.util.function.Supplier;

public class CommanderFunctions {
    static <T> JCommander buildCommanderWithName(
            String cliName, Supplier<T> argumentSupplier){

        JCommander jCommander = JCommander.newBuilder() //Creates JCommander
                .addCommand(argumentSupplier.get()) //Set the parameter
                .build();

        jCommander.setProgramName(cliName); //Change the name
        return jCommander;
    }
}
