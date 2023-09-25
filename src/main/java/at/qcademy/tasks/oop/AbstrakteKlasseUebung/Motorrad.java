package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

    public class Motorrad extends Fahrzeug implements at.qcademy.tasks.oop.AbstrakteKlasseUebung.Beschleunigbar {
    //implementiere Interface Beschleunigbar
    public int raederMotorrad;

    public Motorrad(String marke, int raederMotorrad) {//Konstruktor fÜr Motorrad
        super(marke);
        this.raederMotorrad = raederMotorrad;
    }


    @Override
    public void starten() {
        System.out.println("Das Motorrad " + marke + " mit " + raederMotorrad + " Raedern startet");
        //mit public void starten kann ich die "starten" Methode
        // aus der abstrakten Klasse Fahrzeug aufrufen !!!!
    }

    public void beschleunigen() {
        System.out.println("Das Motorrad beschleunigt");
        //Da das Interface nicht genau definiert ist, kann ich die Methode dazu erfassen bzw.
        //flexibel gestalten
    }

    public void fährt() {
        System.out.println("Das Motorrad fährt");
    }

    public void bremsen() {
        System.out.println("Das Motorrad bremst");
    }
}
