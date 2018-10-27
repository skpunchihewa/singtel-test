package dev.singtel.interview;

import dev.singtel.interview.interfaces.SingingBirds;
import dev.singtel.interview.interfaces.SwimmingAnimals;

/**
 * @author Thusitha Nuwan
 */
public class Duck extends FlyingBird {

    void sing() {
        Utility.printLn("Quack, quack");
    }

    void swim(){
        Utility.printLn("duck swimming");
    }
}
