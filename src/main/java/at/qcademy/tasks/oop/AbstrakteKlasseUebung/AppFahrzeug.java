package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

public class AppAuto {
    public static void main(String[] args) {
        Autonew Toyota = new Autonew("xyz-1", 4000);
        Autonew Ferrari = new Autonew("abc1", 5000);



     //Autos Methoden also Funktionen fahren und tanken und zuweisung von Werten an Variablen
        Toyota.tanken(20);
        Toyota.fahren(100);

        Ferrari.tanken(20);
        Ferrari.fahren(100);

        //nach 100 km Fahrt
        System.out.println("km " + Toyota.anzahlTueren);
        System.out.println("km " + Ferrari.anzahlTueren);
        System.out.println("Kraftstoffmenge " + Toyota.kraftstoffmenge);
        System.out.println("Kraftstoffmenge " + Ferrari.kraftstoffmenge);

    }
}
