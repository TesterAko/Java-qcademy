package at.qcademy.tasks.oop.Radio;

public class Radio {

    //Attribute
    boolean radioAn = true;

    int lautStärke = 2;

    double frequenz = 98.4;

    public Radio(boolean radioAn, int lautStärke, double frequenz) {
        this.radioAn = radioAn;
        this.lautStärke = lautStärke;
        this.frequenz = frequenz;
    }


    public void radioLauter() {
        if (radioAn == true) {//wenn radioAn true ist dann
            if (lautStärke >= 0 || lautStärke <= 10) {//wenn lautstärke kleiner gleich 10
                lautStärke += 1;//lautstärke wird 1 erhöht
            }
        }

    }


    public void radioLeiser() {
        if (radioAn == true) {//wenn radioAn true ist dann
            if (lautStärke >= 0 || lautStärke <= 10) {//wenn lautstärke kleiner gleich 10
                lautStärke -= 1;//lautstärke wird 1 verringert

            }
        }
    }


    public void radioEin() {
        radioAn = true;

    }

    public void radioAus() {
        radioAn = false;

    }

    @Override
    public String toString() {
        return "Radio an:" + " Lautstärke: " + lautStärke + ", Frequenz: " + frequenz;
    }

    public void wähleSender(double frequenz) {
        this.frequenz = frequenz;
        if (frequenz > 99.9) {
            this.frequenz = frequenz;

        }
    }
}