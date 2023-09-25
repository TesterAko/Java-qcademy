package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

public class AbstrakteKlasse {

}

abstract class Fahrzeug {
    // Abstrakte Klasse Fahrzeug
    public String marke;

    //marke Attribut gilt für die in der gesamten Klasse erstellten
    // Objekte bzw. in diesem Fall für Autos
    public Fahrzeug(String marke) {
        //Konstruktor für das Auto, wodurch wird das Auto definiert?
        this.marke = marke;
    }

    public abstract void starten();
    // abstrakte private Methode für das Starten der Fahrzeuge
    //Methode muss abstrakt deklariert werden damit beide Unterklassen
    //von der Methode erben können bzw. die Methode ausführen
    //und ich nicht für beide einzelmn deklarieren muss!

    public void anzeigenMarke() {
        System.out.println("Marke: " + marke);
    }
}

class Auto extends Fahrzeug implements OOP.AbstrakteKlasseUebung.Beschleunigbar {
    //Unterklasse Auto die von der abstrakten Klasse Fahrzeug erbt
    // also wird Auto die Attribute bzw. die Methoden von abstrakten Klasse Fahrzeug übernehmen
    private int anzahlTueren;

    public Auto(String marke, int anzahlTueren) {//Konstruktor für Auto
        super(marke);
        /**super: Das Schlüsselwort super wird in Java verwendet,
         * um auf die übergeordnete Klasse (die Superklasse) zu verweisen.
         *  In diesem Fall ist die Superklasse die abstrakte Klasse Fahrzeug.
         */
        this.anzahlTueren = anzahlTueren;
    }

    public String toString() {
        return marke + " mit " + anzahlTueren + " Tueren";
    }


    @Override
    public void starten() {
        System.out.println("Das Auto mit " + anzahlTueren + " Tueren startet");
        //mit public void starten kann ich die "starten" Methode
        // aus der abstrakten Klasse Fahrzeug aufrufen !!!!
        //Überschreiben der Methode durch Override und Ausgabe als Zusatz "Das Auto mit anzahlTueren startet"
    }

    public void beschleunigen() {
        System.out.println("Das Auto beschleunigt");
        //Da das Interface nicht genau definiert ist, kann ich die Methode dazu erfassen bzw.
        //flexibel gestalten
    }

    public void fährt() {
        System.out.println("Das Auto fährt");
    }

  public void bremsen() {
        System.out.println("Das Auto bremst");
  }
}

class Motorrad extends Fahrzeug implements OOP.AbstrakteKlasseUebung.Beschleunigbar {
    //implementiere Interface Beschleunigbar
    public int raederMotorrad;

    public Motorrad(String marke, int raederMotorrad) {//Konstruktor fÜr Motorrad
        super(marke);
        this.raederMotorrad = raederMotorrad;
    }


    @Override
    public void starten() {
        System.out.println("Das Motorrad " + marke + " mit " + raederMotorrad + " Raedern startet");
        //mit public void starten kann ich die "starten" Methode
        // aus der abstrakten Klasse Fahrzeug aufrufen !!!!
    }

    public void beschleunigen() {
        System.out.println("Das Motorrad beschleunigt");
        //Da das Interface nicht genau definiert ist, kann ich die Methode dazu erfassen bzw.
        //flexibel gestalten
    }

    public void fährt() {
        System.out.println("Das Motorrad fährt");
    }

    public void bremsen() {
        System.out.println("Das Motorrad bremst");
    }
}





