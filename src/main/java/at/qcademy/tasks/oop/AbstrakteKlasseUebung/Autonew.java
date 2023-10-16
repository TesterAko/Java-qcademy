package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

public class Autonew extends FahrzeugAuto implements BeschleunigbarAuto {

    private final int anzahlRaeder;


    public Autonew(String marke, int anzahlRaeder) {
        this.marke = marke;
        this.anzahlRaeder = anzahlRaeder;
    }

    @Override
    public void autoStarten() {
        System.out.println("Das Auto mit " + anzahlRaeder + " Rädern startet");
    }

    @Override
    public void autoBeschleunigen() {
        System.out.println("Das Auto beschleunigt");
    }

    @Override
    public void autoFaehrt() {
        System.out.println("Das Auto fährt");
    }

    @Override
    public void autoBremst() {
        System.out.println("Das Auto bremst");
    }


}
