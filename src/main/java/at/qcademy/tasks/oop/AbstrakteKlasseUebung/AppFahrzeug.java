package at.qcademy.tasks.oop.AbstrakteKlasseUebung;



public class AppFahrzeug {
    public static void main(String[] args) {
       Autonew meinAuto = new Autonew("Opel", 4);
        Motorrad meinMotorrad = new Motorrad("BMW", 2);

        meinAuto.anzeigenMarke();
        meinAuto.starten();
        meinAuto.fährt();
            for (int i = 0 ; i <= 50; i++) {
                System.out.println("Beschleunigung auf: " + i + " km/h");
                if ( i == 50) {
                    meinAuto.bremsen();
                }

            }


        meinMotorrad.anzeigenMarke();
        meinMotorrad.starten();
        meinMotorrad.fährt();
            for (int i = 0 ; i <= 50; i++) {
                System.out.println("Beschleunigung auf: " + i + " km/h");
                    if ( i == 50) {
                        meinMotorrad.bremsen();
                    }
                }
            }
        }

