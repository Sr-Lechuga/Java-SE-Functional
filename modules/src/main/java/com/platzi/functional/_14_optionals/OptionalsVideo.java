package com.platzi.functional._14_optionals;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/*Optional is a "wrapper" that allow us to deal with empty results and all possible cases
* It's logic, makes sure to know if there is an empty result, and it can be programmed to give a default value
*   in empty cases*/

public class OptionalsVideo {
    public static void main(String[] args) {
        Optional<List<String>> optionalNames = getNames();
        if (optionalNames.isPresent()){
            /*If there is a value, it returns true*/
        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
        /*If there is a value, it performs consumer actions*/

        Optional<String> valuablePlayer = mostValuablePlayer();
        String valuablePlayerNAme = valuablePlayer.orElseGet(() -> "No Player");
        /*If there isn't any value, it assigns supplier value to variable*/

    }
    static Optional<List<String>> getNames(){
        List<String> nameList = new LinkedList<>();

        return Optional.of(nameList);
    }

    static Optional<String> mostValuablePlayer(){
        try {
            return Optional.of("Sr-Lechuga");
        }catch (Exception e){
            e.printStackTrace();
        }

        return  Optional.empty();
    }
}
