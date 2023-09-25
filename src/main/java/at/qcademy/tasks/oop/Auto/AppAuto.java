package OOP.Auto;

public class AppAuto {
    public static void main(String[] args) {
        Auto Toyota = new Auto("YY-123", 5000, 40, 5);
        Auto Ferrari = new Auto("FF-456", 2000, 40, 10);


        //Autos Methoden also Funktionen fahren und tanken und zuweisung von Werten an Variablen
        Toyota.tanken(20);
        Toyota.fahren(100);

        Ferrari.tanken(20);
        Ferrari.fahren(100);

        //nach 100 km Fahrt
        System.out.println("km " + Toyota.kilometerstand);
        System.out.println("km " + Ferrari.kilometerstand);
        System.out.println("Kraftstoffmenge " + Toyota.kraftstoffmenge);
        System.out.println("Kraftstoffmenge " + Ferrari.kraftstoffmenge);

    }
}
