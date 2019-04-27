package com.example;

public class DuplicationOfCode {

    /**
     * This is a constructor.
     */
    public DuplicationOfCode() {
        System.out.println("Hello this a problem...");
    }

    /**
     *
     * @param someone the name of the person
     * @return greeting string
     */
    public final String greet(final String someone) {
        return String.format("Hello, %s!", someone);
    }

    public final boolean getSomething() {
        Boolean isLie = false;

        if(isLie) {
            return true;
        }else {
            return false;
        }
    }

    public final boolean getAnotherThing() {
        Boolean isLie = false;

        if(isLie) {
            return true;
        }else {
            return false;
        }
    }
}
