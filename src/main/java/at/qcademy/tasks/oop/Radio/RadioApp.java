package at.qcademy.tasks.oop.Radio;


public class RadioApp {

    public static void main(String[] args) {
        Radio radio = new Radio(true,  10, 95.9);

        boolean radioAn = true;

        if (radioAn == true) {
            System.out.println(radio.toString());
        } else {
            System.out.println("Radio is off");
        }

        radio.wähleSender(94.9);
        radio.radioLeiser();
        radio.radioLeiser();
        radio.radioLauter();
        radio.radioAus();
        radio.radioEin();

        System.out.println(radio.toString());
    }

}