package OOP.Radio;

public class Radio {

    //Attribute
    static boolean radioAn = true;

    static int lautStärke = 2;

    static double frequenz = 98.4;


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
            if (lautStärke <= 10) {//wenn lautstärke kleiner gleich 10
                lautStärke += 1;//lautstärke wird 1 erhöht
            }
        }

    }

    //leiser
    public void radioLeiser() {
        if (radioAn == true) {//wenn radioAn true ist dann
            if (lautStärke <= 10) {//wenn lautstärke kleiner gleich 10
                lautStärke -= 1;//lautstärke wird 1 verringert

            }
        }
    }

    //an aus
    public void radioEinAus() {
        radioAn = !radioAn;
        // wenn radioAn true ist dann wird es false
        // und wenn false dann true
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