package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

    abstract class FahrzeugAuto {

        public String marke;


        public abstract void starten(String marke);

        public void anzeigenMarke(String marke) {
            System.out.println("Marke: " + marke);
        }

        public abstract void starten();
    }

