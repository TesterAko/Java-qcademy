package at.qcademy.tasks.oop.Final;

public class Autofinal extends Fahrzeugfinal {

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
        return "{\"stossDaempfer\": \"" + this.stossDaempfer + "\", \" fahrzeug\": " + super.toJson() + "}";
    }

    @Override
    public String toString() {
        return this.toPrettyJson();
    }
    public static void main(String[] args) {
        Autofinal auto = new Autofinal("rot", 100, 1999, "stossDaempfer");
        System.out.println(auto);
    }

}



