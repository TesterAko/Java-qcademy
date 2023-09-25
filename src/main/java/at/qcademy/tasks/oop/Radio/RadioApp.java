package OOP.Radio;

import static OOP.Radio.Radio.*;

public class RadioApp {

    public static void main(String[] args) {

        Radio radio = new Radio(true, 2, 98.4);
        //zuerst in der Radio Klasse to String Methode erstellen!!!
        //und dann hier Radio radio = new Radio(true, 2, 98.4);
        //radio.toString();
        //@Override
        //    public String toString() {
        //        return "Radio an:" + " Lautstärke: " + lautStärke + ", Frequenz: " + frequenz;
        //    }
        System.out.println(radio.toString());


    }

}