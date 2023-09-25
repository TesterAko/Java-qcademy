package OOP.Auto;

public class Auto {

    //Attribute_________________________ Definierung der Attribute, was gehört zum Auto
    String kennzeichen;
    int kilometerstand;
    double tankvolumen;
    double kraftstoffverbrauch;
    double kraftstoffmenge;

    //Konstruktor_________________________ Erstellung eines Autos
    public Auto(String kennzeichen, int kilometerstand, double tankvolumen, double kraftstoffverbrauch) {
        this.kennzeichen = kennzeichen;
        this.kilometerstand = kilometerstand;
        this.tankvolumen = tankvolumen;
        this.kraftstoffverbrauch = kraftstoffverbrauch;
    }

    //Methoden________________________________ Was kann das Auto?

    //tanken
    public void tanken(double mengeLiter) {
        kraftstoffmenge += mengeLiter;//zutanken von menge in Liter - es vermehrt sich
    }

    //fahren
    public void fahren(int strecke) {
        double verbrauch = strecke * kraftstoffverbrauch / 100;//Verbrauch des Autos je 100km
        if (verbrauch <= kraftstoffmenge) {//Wenn das Auto genug Kraftstoff hat und das mehr ist als Verbrauch
            kilometerstand += strecke;//Kilometerstand erhöhen durch fahren
            kraftstoffmenge -= verbrauch;//kraftstoffmenge abziehen durch verbrauch
        } else {
            System.out.println("Kein Kraftstoff!");//wenn das Auto nicht genug Kraftstoff hat
        }
    }
}

