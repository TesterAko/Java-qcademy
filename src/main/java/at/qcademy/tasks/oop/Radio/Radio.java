package OOP.Radio;

public class Radio {

    //Attribute
    boolean radioAn = true;

    int lautStärke = 2;

    double frequenz = 98.4;
    //nicht statisch weil diese Werte sich ändern können

    //Konstruktor
    public Radio(boolean radioAn, int lautStärke, double frequenz) {
        this.radioAn = radioAn;
        this.lautStärke = lautStärke;
        this.frequenz = frequenz;
    }

    //Methoden
    //lauter
    public void radioLauter() {
        if (radioAn == true) {//wenn radioAn true ist dann
            if (lautStärke >= 0 || lautStärke <= 10) {//wenn lautstärke kleiner gleich 10
                lautStärke += 1;//lautstärke wird 1 erhöht
            }
        }

    }

    //leiser
    public void radioLeiser() {
        if (radioAn == true) {//wenn radioAn true ist dann
            if (lautStärke >= 0 || lautStärke <= 10) {//wenn lautstärke kleiner gleich 10
                lautStärke -= 1;//lautstärke wird 1 verringert

            }
        }
    }

    //an aus
    public void radioEin() {
        radioAn = true;

    }

    public void radioAus() {
        radioAn = false;

    }
    //ZustandRadio
    @Override
    public String toString() {
        return "Radio an:" + " Lautstärke: " + lautStärke + ", Frequenz: " + frequenz;
    }

    //wähleSender
    public void wähleSender(double frequenz) {
        this.frequenz = frequenz;
        if (frequenz > 99.9) {
            this.frequenz = frequenz;

        }
    }
}