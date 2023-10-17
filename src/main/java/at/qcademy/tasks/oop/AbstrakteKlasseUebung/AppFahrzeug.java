package at.qcademy.tasks.oop.AbstrakteKlasseUebung;


public class AppFahrzeug {

    public static void main(String[] args) {

        Autonew meinAuto = new Autonew("Opel", 4);
        meinAuto.anzeigenMarkeAuto();
        meinAuto.autoStarten();
        meinAuto.autoFaehrt();
        meinAuto.autoBeschleunigen();
        meinAuto.autoBremst();
        for (int i = 0; i <= 50; i++) {
            System.out.println("Beschleunigung auf: " + i + " km/h");
            if (i == 50) {
                meinAuto.autoBremst();
            }
        }

        Motorrad meinMotorrad = new Motorrad("BMW", 2);
        meinMotorrad.anzeigenMarkeMotorrad();
        meinMotorrad.motorradStarten();
        meinMotorrad.motorradBeschleunigen();
        meinMotorrad.motorradFaehrt();
        meinMotorrad.motorradBremst();
        for (int i = 0; i <= 50; i++) {
            System.out.println("Beschleunigung auf: " + i + " km/h");
            if (i == 50) {
                meinMotorrad.motorradBremst();
            }
        }
    }
}