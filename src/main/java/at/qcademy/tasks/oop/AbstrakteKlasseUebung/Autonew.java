package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

public class Auto {

    //Attribute_________________________ Definierung der Attribute, was gehört zum Auto
    String kennzeichen;
    int kilometerstand;
    double tankvolumen;
    double kraftstoffverbrauch;
    double kraftstoffmenge;

    //Konstruktor_________________________ Erstellung eines Autos
    public Auto(String kennzeichen, int kilometerstand) {
        this.kennzeichen = kennzeichen;
        this.kilometerstand = kilometerstand;
        this.tankvolumen = tankvolumen;
        this.kraftstoffverbrauch = kraftstoffverbrauch;
    }
    public class Autonew extends Fahrzeug implements at.qcademy.tasks.oop.AbstrakteKlasseUebung.Beschleunigbar {
        //Unterklasse Auto die von der abstrakten Klasse Fahrzeug erbt
        // also wird Auto die Attribute bzw. die Methoden von abstrakten Klasse Fahrzeug übernehmen
        private int anzahlTueren;

        public Autonew(String marke, int anzahlTueren) {//Konstruktor für Auto
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

        //Methoden________________________________ Was kann das Auto?

        //tanken
        public void tanken(double mengeLiter) {
            kraftstoffmenge += mengeLiter;//zutanken von menge in Liter - es vermehrt sich
        }

        //fahren
        public void fahren(int strecke) {
            double verbrauch = strecke * kraftstoffverbrauch / 100;//Verbrauch des Autos je 100km
            if (verbrauch <= kraftstoffmenge) {//Wenn das Auto genug Kraftstoff hat und das mehr ist als Verbrauch
                kilometerstand += strecke;//Kilometerstand erhöhen durch fahren
                kraftstoffmenge -= verbrauch;//kraftstoffmenge abziehen durch verbrauch
            } else {
                System.out.println("Kein Kraftstoff!");//wenn das Auto nicht genug Kraftstoff hat
            }
        }
    }


}

