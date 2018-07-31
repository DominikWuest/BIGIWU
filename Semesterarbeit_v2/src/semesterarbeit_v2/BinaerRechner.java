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

        Boolean weiterMachen = true;
        //Abfrage zum beenden bei Eingabe 0
        // Zum Beenden 9 

        bitstring = eingabe.nextLine();
        //Bitlänge zählen
        while (weiterMachen == true) {

            System.out.println("Zum beenden des Rechners sag einfach Beenden :) ");
            System.out.println("Bitte gebe einen binären String ein:");
            
            // Länge prüfen, falls nicht 32-Bit Fehler melden
            // falls 0 = Positive Zahl
            
            if (bitstring.startsWith("0")) {
                // Bitstring aus Zahl erstellen
                binaerzahl1 = Integer.parseInt(bitstring, 2);
                System.out.println("Die Zahl lautet Dezimal: ");
                System.out.print(binaerzahl1);

            } else if (bitstring.startsWith("1")) {

                binaerzahl2 = Long.parseLong(bitstring, 2);
                //Casting
                binaerausgabe = (int) binaerzahl2;
                System.out.println("Die Zahl lautet Dezimal: ");
                System.out.print(binaerausgabe);

            } else if (bitstring.contains("beenden")) {
                System.out.println("Ich beende den Rechner für dich");
                
            }

        }
    }

    void deztoBinRechner() {

        int dezstring;
        System.out.println("Bitte gebe eine Dezimale Zahl ein:");
        dezstring = eingabe.nextInt();
        System.out.println("Deine Zahl lautet in der Binären Schreibweise: ");
        System.out.print(Integer.toBinaryString(dezstring));

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
