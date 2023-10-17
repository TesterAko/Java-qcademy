package at.qcademy.tasks.oop.Final;

public abstract class Fahrzeugfinal implements Jsonfiable {

    protected String farbe;
    private double kmStand;
    private double kraftstoff;
    protected int ps;
    protected int baujahr;

    public Fahrzeugfinal(String farbe, double kmStand, double kraftstoff) {
        this.farbe = farbe;
        this.kmStand = kmStand;
        this.kraftstoff = kraftstoff;
        this.ps = ps;
        this.baujahr = baujahr;
    }

    public void abfahren(double km) {
        kmStand += km;
    }

    public void starten() {
        System.out.println("Fahrzeug startet");
    }

    public void auftanken(double liter) {
        this.kraftstoff += liter;
    }

    @Override
    public String toJson() {
        return "{\"farbe\": \"" + this.farbe + "\", \"kmStand\": \"" + this.kmStand + "\", \"kraftstoff\": \"" + this.kraftstoff + "\", \"ps\": \"" + this.ps + "\", \"baujahr\": \"" + this.baujahr + "\"}";
    }
}