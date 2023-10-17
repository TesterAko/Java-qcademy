package OOP.Bankkonto;

public class Bankkonto { //Attribute Bankkonto
    String vorname;
    String nachname;
    int kontoNr;
    double kontoStand;
    double limit;

    public Bankkonto(String vorname, String nachname, int kontoNr, double kontoStand, double limit) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontoNr = kontoNr;
        this.kontoStand = kontoStand;
        this.limit = limit;
    }

    public String toString () {
        return ("vorname: " + vorname + "\n" + "nachname: " + nachname + "\n"
                + "kontoNr: " + kontoNr + "\n" + "kontoStand: " + kontoStand + "\n" + "limit: " );
    }

    public void einzahlen(double betrag) {
        kontoStand += betrag;
    }

    public void auszahlen(double betrag) {
        kontoStand -= betrag;
    }

    public void kontostandAbfrage() {
        System.out.println(kontoStand);
    }

}