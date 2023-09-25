package OOP.AbstrakteKlasseUebung;

public class AppFahrzeug {
    public static void main(String[] args) {
        Motorrad meinMotorrad = new Motorrad("Yamaha", 2);

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

