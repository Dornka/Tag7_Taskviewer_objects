package org.example;

public class Auto {

    private String marke;
    private String modell;
    private String farbe;
    private int baujahr;
    private boolean gestartet;
    private int geschwindigkeit;


    public Auto(String marke, String modell, String farbe, int baujahr){
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.geschwindigkeit = 0;
        this.gestartet = false;
    }

    public Auto() {

    }

    public void starten() {

        if(!gestartet) {
            gestartet = true;
            System.out.println("Das Auto wurde gestartet.");
        } else {
            System.out.println("Das Auto ist bereits gestartet.");
        }

    }
    public void beschleunigen(int tempo) {

        if (gestartet){
            geschwindigkeit = geschwindigkeit + tempo;
            System.out.println("Auto beschleunigt um " + tempo + " km/h. " + "Neue Geschwindigkeit: " + geschwindigkeit + " km/h.");
        } else {
            System.out.println("Bitte zuerst Auto starten, bevor es beschleunigen kann.");
        }

    }
}
