/*
In dieser Klasse können Dezimal- in Binärzahlen und umgekehrt
ausgerechnet werden.
 */
import java.util.Scanner;

public class BinaerRechner {

    Scanner eingabe = new Scanner(System.in);
    Scanner beenden = new Scanner(System.in);

    int auswahl = 0;
    int binaerzahl1;
    long binaerzahl2;
    int binaerausgabe;
    String bitstring;

    void binrechner() {

        while (auswahl == 0) {
            //Abfrage zum beenden bei Eingabe 0
            System.out.println("Bitte geben Sie den 32-Bit String ein:");
            bitstring = eingabe.nextLine();
            //Bitlänge zählen
            int laenge = bitstring.length();

            if (laenge == 32) {
                // Länge prüfen, falls nicht 32-Bit Fehler melden
                // falls 0 = Positive Zahl
                if (bitstring.startsWith("0")) {
                // Bitstring aus Zahl erstellen
                    binaerzahl1 = Integer.parseInt(bitstring, 2);
                    System.out.println("Die Zahl lautet:");
                    System.out.println(binaerzahl1);

                } else {

                    binaerzahl2 = Long.parseLong(bitstring, 2);
                    //Casting
                    binaerausgabe = (int) binaerzahl2;
                    System.out.println("Die Zahl lautet:");
                    System.out.println(binaerausgabe);
                }

            } else {
                System.out.println("Eingabe nicht korrekt, bitte 32-Bit String eingeben");
            }

            System.out.println();
            System.out.println("Zum fohrtfahren wählen Sie 0, zum beenden wählen sie 1");
            auswahl = beenden.nextInt();
        }

        System.out.println("Programm wird nun beendet");
    }

}
