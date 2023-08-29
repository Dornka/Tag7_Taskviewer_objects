package org.example;

public class Person {

    private String name;
    private int alter;
    private String geschlecht;


    public Person (String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public Person() {

    }


    public void vorstellen(){

        System.out.println("Hallo, ich bin " + name + " (" + geschlecht + ") " + "und " + alter + " Jahre alt.");
    }

}
