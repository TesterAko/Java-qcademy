package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

    public class Autonew extends Fahrzeug implements at.qcademy.tasks.oop.AbstrakteKlasseUebung.Beschleunigbar {
        //Unterklasse Auto die von der abstrakten Klasse Fahrzeug erbt
        // also wird Auto die Attribute bzw. die Methoden von abstrakten Klasse Fahrzeug übernehmen
        private int anzahlTueren;

        public Autonew (String marke, int anzahlTueren) {//Konstruktor für Auto
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

