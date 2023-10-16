package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

    abstract class FahrzeugAuto {

        public String marke;


        public abstract void autoStarten();

        public void anzeigenMarkeAuto() {
            System.out.println("Marke: " + marke);
        }


    }

