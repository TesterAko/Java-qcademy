package OOP.Koordinaten;

public class AppPunkt {

    public static void main(String[] args) {

        //Punkt erzeugen
        Punkt p1 = new Punkt(3, 4);

        Punkt p2 = new Punkt(5, 6);

        //Punkt abfragen
        System.out.println("Koordinaten P1: " + p1.toString());
        //Abstand zum anderen Punkt
        System.out.println("Abstand P2 zu P1: " + p2.abstandZu(p1));
        //Abstand zum Ursprung
        System.out.println("P1 Abstand zum Ursprung: " + p1.abstandZumUrsprung());
        //Spiegelung der y Achse mit neuem Punkt______________________
        System.out.println("P1 nach Spiegelung y: " + p1.spiegelY().toString());
        //Spiegelung der x Achse mit neuem Punkt______________________
        System.out.println("P1 nach Spiegelung x: " + p1.spiegelX().toString());

    }
}
