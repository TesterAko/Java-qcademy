package at.qcademy.tasks.oop.Person.reserve;


public class Main {

    public static void main(String[] args) {
        /*Person Ekrem = new Person("Ekrem", "Gedik", LocalDate.of(1992, 12,25), 95.00);
        new neue Person(in diesem Fall) von der Klasse
        LocalDate.of: Diese Methode wird verwendet, um eine neue LocalDate-Instanz zu erstellen
        die ein spezifisches Datum darstellt. Sie ermöglicht es dir, das Jahr, den Monat und den Tag als Argumente anzugeben, um ein Datum zu erstellen.

        System.out.println("Das Alter von Ekrem ist " + Ekrem.alter());

        Ekrem.zunahme(5);//zuerst gewicht mit zunahme zuweisen
        System.out.println("Das Gewicht von Ekrem beträgt aktuell " + Ekrem.gewicht);//danach wird es addiert in der Instanzvariable gewicht zusammengezählt

        Ekrem.abnahme(30);
        System.out.println("Das Gewicht von Ekrem beträgt aktuell " + Ekrem.gewicht);

       // 1. Überladung bzw. Variante
        Person Ako = new Person("Ako", "Reshwanzadeh", LocalDate.of(1992,12,25));

        // 2. Überladung bzw. Variante
        Person John = new Person("John", "Deere");
        System.out.println("Das Geburtsdatum von John ist " + John.geburtsDatum);


        3. Überladung - / Default Konstructor das heißt; Java erzeugt Default Constructor mit einer leeren Parameterliste
        Person emptyPerson = new Person();//Konstruktor existiert nicht aber Java erstellt einen mit leeren Parameterliste automatisch
        System.out.println("Geburtsdatum vom Empty: " + emptyPerson.geburtsDatum);
        //EINE KLASSE OHNE KONSTRUKTOR HAT AUCH EINEN KONSTRUKTOR!!
        */

        //Person Ekrem = new Person("Ekrem", "Gedik", 95.0, LocalDate.of(1992,12,24));

        /**
         * System.out.println(Ekrem.toString());
         *   Ausgabe:OOP.Person@65ab7765
         *  OOP.Person@65ab7765 ist die Standardausgabe der toString()-Methode für ein Objekt der Klasse Person im Zusammenhang mit der Verwendung von Java
         * 1- OOP.Person gibt den vollqualifizierten Klassennamen an, zu dem das Objekt gehört (in diesem Fall Person in einem Package namens OOP).
         * 2- @ ist ein Trennzeichen.
         * 3- 65ab7765 ist die hexadezimale Darstellung der Speicheradresse des Objekts.
         *
         * Diese Standardausgabe wird generiert, wenn du versuchst, ein Objekt auszugeben, ohne eine eigene toString()-Methode in der Klasse zu definieren
         * Wenn du spezifische Informationen über ein Person-Objekt anzeigen möchtest, solltest du die toString()-Methode in der Person-Klasse überschreiben,
         * um die gewünschte Ausgabe zu generieren. Hier ist ein Beispiel, wie du das tun könntest:
         */

        //System.out.println(Ekrem.getVorname());//Getter angewendet - Name aus Private geholt
        //Ausgabe: {"vorname": "Ekrem", "nachname": "Gedik", "gewicht": 95.0, "geburtsDatum": "1992-12-24"};

        //_________Ekrem nach Zunahme +10 kg // weisen den neuen Wert dem Attribut zu = Seiteneffekt
        //Ekrem.zunahme(10);
        //System.out.println(Ekrem.setVorname("Ako"));//Setter angewendet - Name aus Private neu gesetzt
    }
}
