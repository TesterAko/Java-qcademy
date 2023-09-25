package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

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

