package OOP.Person;

import java.time.LocalDate;

public class Person {
    //Name der Klasse fängt immer mit Großbuchstaben an
    //public heißt die Klasse kann in anderen Dateien benutzt werden
    //class ist die Java Klasse

    public static int mindestGeburtsjahr = 1990;//static attribute

    private String vorname1;//non static attribute//Vorname = Instanzvariable in diesem Fall //es war davor nur "vorname"
    //weil ich die Konstruktoren von vorherigen abgerufen habe, muss ich es nicht mehr so oft anpassen
    //erspart viel Arbeit in Änderung
    //ist der Grund, warum man Konstruktoren wiederverwendet bzw. vom ersten abruft
    private String nachname;
    LocalDate geburtsDatum;
    double gewicht;

    //___________________________________________________________________________________________________________________________________________
    //das ist jz der Bauplan/Klasse jetzt fehlt ein Konstruktor
    //wie entsteht eine Person
    //Konstruktion der Person bspw.:
    public Person(String vorname, String nachname, double gewicht, LocalDate geburtsDatum) {//String vorname, vorname Konstruktor-Parameter in diesem Fall
        this.vorname1 = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.gewicht = gewicht;
        /**this dient dazu, die Unterscheidung zwischen Instanzvariablen (Attributen) und lokalen Variablen zu ermöglichen, wenn beide denselben Namen haben
         Wenn du this verwendest, wird es offensichtlich, dass du auf die Instanzvariable zugreifst und ihr einen Wert zuweist.
         Weil Konstruktionsparameter gleich wie Instanzvariablen heißen, kannst du mit this auch die Instanzvariablen zugreifen ohne Parameter anders nennen zu müssen**/
    }
    //___________________________________________________________________________________________________________________________________________

    /**
     * Überladen der Konstruktor, das heißt man bietet verschiedene Arten von Konstruktoren, diese Unterscheiden sich in der Signatur (Parameterliste)
     * bspw. Person(String vorname, String nachname, LocalDate geburtsDatum)
     * hiermit kann ich 3 verschiedene Personen erstellen die verschiedene Werte beinhalten, mehr dazu in der Main Methode
     **/
    Person(String vorname, String nachname, LocalDate geburtsDatum) {//String vorname, vorname Konstruktor-Parameter in diesem Fall
        this(vorname, nachname, 0, geburtsDatum);
        // mit this.("Parametern des vorherigen Konstruktors") rufe ich den vorherigen Konstuktor auf
        //muss immer in der ersten Zeile stehen!

    }

    Person(String vorname, String nachname) {//String vorname, vorname Konstruktor-Parameter in diesem Fall
        this(vorname, nachname, null);
       /* this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.gewicht = 0.0;*/
    }

    Person(String nachname) {//String vorname, vorname Konstruktor-Parameter in diesem Fall
        this(null, nachname);
       /* this.vorname = vorname;
        this.nachname = nachname;
        */
    }

    //bei komplexen Datentypen definiert Java, wenn sie nicht gesetzt sind mit NULL
    Person() {

        /*
        this.vorname = null;
        this.nachname = null;
        this.geburtsDatum = null;
        this.gewicht = 0.0;
        */
    }
    //Default Constructor das heißt; Java erzeugt Default Constructor mit einer leeren Parameterliste
    //public Person() {}

    //_____________________________________________________________________________________________________________________

    //Factory Methoden
    /* sind Methoden die man erzeugt, um Instanzen von der Klasse zu erstellen
    sind immer static Methoden!
    */

    public static Person createPerson(String vorname, String nachname, LocalDate geburtsDatum, double gewicht) {
        return new Person(vorname, nachname, gewicht, geburtsDatum);
    }
    //damit kann man auf private Konstruktoren von aussen zugreifen

    /**
     * in der Main Methode dann...
     * bspw. Person Ako = new Person.createPerson("Ako", "Reshwanzadeh", LocalDate.of(1992,12,25));
     *
     **/

    //_____________________________________________________________________________________________________________________

    /**
     * public int alter() { ERKLÄRUNG SIGNATUR
     * //Signatur der Methode
     * //<Sichtbarkeit><static/non-static><Datentyp/Rückgabetyp><<Methodename>(<Parameter/-Liste>)
     * <p>
     * //return;
     * //return-typ ist immer ein Datentyp/ Rückgabe- ende der Ausführung
     * Wenn keine Rückgabe, dann ist der Rückgabetyp void!
     **/
    //_____________________________________________________________________________________________________________________
    public int alter() {
        int jetzigesJahr = LocalDate.now().getYear(); //now gibt immer jetzt die aktuelle Zeit zurück//get Year gibt aktuelle Jahr zurück
        int geburtsJahr = geburtsDatum.getYear();
        return jetzigesJahr - geburtsJahr;
    }
    //wenn bspw. Person zunimmt

    public void zunahme(double kg) {
        gewicht += kg;
    }
    //Methode überladen________________________________________________________________________________________________

    /**
     * Unterscheidung erfolgt durch Parameterliste!!!!
     * public void zunahme(int kg) {
     * gewicht += kg;
     * }
     */
    /*oder besser________________________________________________________________________________________________
    public void zunahme(int kg) {
        this.zunahme((double)kg);
        //mit this kann ich wieder auf die vorherigen Parametern zugreifen
        //wenn ich das hier machen will, dann muss ich das hier auch ändern

        //bei this.zunahme(kg) wäre es eine endlose Rekursion!! Aufpassen bei Parametern !!
    }*/
    //________________________________________________________________________________________________________________

    //Methode überschreiben____________________________________________________________________________________________

   @Override
    public String toString() {
        return "{\"vorname\": \"" + vorname1 + "\", \"nachname\": \"" + nachname + "\", \"gewicht\": " + gewicht + ", \"geburtsDatum\": \"" + geburtsDatum + "\"};";
        //wenn ich ausgabe in Json will
    }
    /**
     * Man bietet dieselbe Methode aber in einer erbende Klasse!
     * JEDE KLASSE IN JAVA ERBT AUTOMATISCH VON DER KLASSE OBJECT
     * --> Object IST EINE Basisklasse in Java
     * JEDES OBJEKT ENTHÄLT METHODE NAMENS toString
     * toString um ein Objekt in einen String umzuwandeln
     *
     * @param
     */

    //________________________________________________________________________________________________________________
    //Wenn bspw. Person abnimmt
    public void abnahme(double kg) {
        gewicht -= kg;
    }
    //________________________________________________________________________________________________________________
    //GETTER
    /**
     * um auf private Attribut zuzugreifen, bzw. ausgeben lassen
     * bspw.:
     */

    public String getVorname() {
        return vorname1;
    }

    public String getNachname() {
        return nachname;
    }

    //SETTER
    /**
     * um auf private Attribut neue Werte zu setzen, bzw. ausgeben lassen
     * bspw.:
     */
    public String setVorname(String vorname) {
        return vorname1 = vorname;

    }

}

