package dev.singtel.interview;

import dev.singtel.interview.interfaces.SingingBirds;

/**
 * @author Thusitha Nuwan
 */
public class Chicken extends Bird {

    private String words = "";

    void sing(){
        Utility.printLn(words);
    }


    void setWordsToSing(String words){
        this.words = words;
    }

}
