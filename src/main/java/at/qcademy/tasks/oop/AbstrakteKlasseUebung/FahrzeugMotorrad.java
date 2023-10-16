package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

    abstract class FahrzeugMotorrad {

        public String marke;


        public abstract void motorradStarten();

        public void anzeigenMarkeMotorrad() {
            System.out.println("Marke: " + marke);
        }

    }

