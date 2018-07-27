    /*
    Semesterarbeit "Objektorientierter Chatbot" 
    Schule:     ABB Technikerschule Baden
    Semester:   4
    Klasse:     B18-if4.1
    Authoren:
                Dominik Wüst
                Andri Binda
                Marek Giesen
    
     */


/*
In dieser Klasse können Dezimal- in Binärzahlen und umgekehrt
ausgerechnet werden.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class BinaerRechner {
    
    Scanner eingabe = new Scanner(System.in);
    Scanner beenden = new Scanner(System.in);
   

    int auswahl;
    int binaerzahl1;
    long binaerzahl2;
    int binaerausgabe;
    String bitstring;

    void bintoDezRechner() {

        //Abfrage zum beenden bei Eingabe 0
        // Zum Beenden 9 
        System.out.println("Zum beenden drücke 9");
        System.out.println("Bitte geben Sie einen binären String ein:");
        bitstring = eingabe.nextLine();
        //Bitlänge zählen

        // Länge prüfen, falls nicht 32-Bit Fehler melden
        // falls 0 = Positive Zahl
        if (bitstring.startsWith("0")) {
            // Bitstring aus Zahl erstellen
            binaerzahl1 = Integer.parseInt(bitstring, 2);
            System.out.println("Die Zahl lautet:");
            System.out.println(binaerzahl1);
            

        } else if (bitstring.startsWith("1")){

            binaerzahl2 = Long.parseLong(bitstring, 2);
            //Casting
            binaerausgabe = (int) binaerzahl2;
            System.out.println("Die Zahl lautet:");
            System.out.println(binaerausgabe);
            
        } else if (bitstring.startsWith("9")){
        beendenBintoDezRechner();
        }
    }

    void deztoBinRechner() {

        int dezstring;
        System.out.println("Bitte geben Sie eine Dezimale Zahl ein:");
        dezstring = eingabe.nextInt();
        System.out.println(Integer.toBinaryString(dezstring));

    }

    private void beendenBintoDezRechner() {

        System.out.println();
        System.out.println("Zum fohrtfahren wähle 0, "
                + "zum Beenden wähle 1");
        auswahl = beenden.nextInt();

        if (auswahl == 0) {
            bintoDezRechner();

        } else if (auswahl == 1) {
            System.out.println("Der Rechner wird beendet");
            System.out.println("Du kommst zurück zum Menü");
            

        }

    }
    
}
