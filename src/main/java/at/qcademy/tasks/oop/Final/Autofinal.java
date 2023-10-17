package at.qcademy.tasks.oop.Final;

public class Autofinal extends Fahrzeugfinal implements Jsonfiable {

    private String stossDaempfer;


    public Autofinal(String farbe, int ps, int baujahr, String stossDaempfer) {
        super(farbe, ps, baujahr);
        this.stossDaempfer = stossDaempfer;
    }

    public void stossDaempfer(String sd) {
        this.stossDaempfer = sd;
    }


    @Override
    public String toJson() {
        return "{\"stossDaempfer\": \"" + this.stossDaempfer + "\", \"fahrzeug\": " + super.toJson() + "}";
    }

    @Override
    public String toString() {
        return this.toPrettyJson();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Autofinal)) return false;
        Autofinal other = (Autofinal) obj;
        boolean gleicheStossDaempfer = this.stossDaempfer.equalsIgnoreCase(other.stossDaempfer);
        boolean gleichesBauJahr = this.baujahr == other.baujahr;
        return gleicheStossDaempfer && gleichesBauJahr;
    }
    public static void main(String[] args) {
        Autofinal auto = new Autofinal("rot", 100, 1999, "stossDaempfer");
        Autofinal auto2 = new Autofinal("rot", 100, 1999, "stossDaempfer");
        System.out.println(auto);
        System.out.println(auto.equals(auto2));
    }
}



