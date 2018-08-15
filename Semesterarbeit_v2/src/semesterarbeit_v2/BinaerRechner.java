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

    //Alle Variabeln initalisieren
    Scanner mEingabeZahl = new Scanner(System.in);
    Scanner beenden = new Scanner(System.in);
    Scanner mEingabeAuswahl = new Scanner(System.in);

    int auswahl;
    int binaerzahl1;
    long binaerzahl2;
    int binaerausgabe;
    String bitstring;
    String auswahlString;
    Boolean weiterMachen = true;

    void bintoDezRechner() {

        System.out.println("Zum beenden des Rechners sag einfach Beenden :) ");

        //Für mindestens einen Durchlauf eine Do-While Schlaufe
        //Wenn weiterMachen boolean false, dann Programm beenden
        do {

            System.out.println("Bitte gebe einen binären String ein:");

            bitstring = mEingabeZahl.nextLine();
            // Länge prüfen, falls nicht 32-Bit Fehler melden
            // falls 0 = Positive Zahl

            if (bitstring.startsWith("0")) {
                // Bitstring aus Zahl erstellen
                binaerzahl1 = Integer.parseInt(bitstring, 2);
                System.out.println("Die Zahl lautet Dezimal: ");
                System.out.println(binaerzahl1);

            } else if (bitstring.startsWith("1")) {

                binaerzahl2 = Long.parseLong(bitstring, 2);
                //Casting
                binaerausgabe = (int) binaerzahl2;
                System.out.println("Die Zahl lautet Dezimal: ");
                System.out.println(binaerausgabe);

            }

            //Frage nach fortführung des Rechners
            //Arrays definieren, NextLine initalisieren
            System.out.println("Möchtest du weiter machen oder den Rechner beenden?");
            auswahlString = mEingabeAuswahl.nextLine();
            String[] words = auswahlString.split(" ");
            String[] weiterArray = new String[]{"weiter", "weitermachen", "naechste", "Zahl", "nochmals"};
            String[] beendenArray = new String[]{"beenden", "fertig", "nicht", "schliesse"};

            //Wörter überprüfen bei weiterArray Match nochmals ausführen
            //bei beendenArray weiterMachen auf false stellen und beenden
            for (String word : words) {
                for (String weiter : weiterArray) {
                    if (word.contains(weiter)) {
                        System.out.println("Ok.");

                    }
                }
                for (String beendenRechner : beendenArray) {
                    if (word.contains(beendenRechner)) {
                        System.out.println("Ich beende den Rechner für dich.");
                        weiterMachen = false;

                    }
                }

            }

        } while (weiterMachen == true);
    }

    void deztoBinRechner() {

        //Für mindestens einen Durchlauf eine Do-While Schlaufe
        //Wenn weiterMachen boolean false, dann Programm beenden
        do {

            //Zahl einlesen
            int dezstring;
            System.out.println("Bitte gebe eine Dezimale Zahl ein:");
            dezstring = mEingabeZahl.nextInt();
            System.out.println("Deine Zahl lautet in der Binären Schreibweise: ");
            //Zahl convetieren
            System.out.println(Integer.toBinaryString(dezstring));
            System.out.println("Möchtest du weiter machen oder den Rechner beenden?");

            //Frage nach fortführung des Rechners
            //Arrays definieren, NextLine initalisieren
            auswahlString = mEingabeAuswahl.nextLine();
            String[] words = auswahlString.split(" ");
            String[] weiterArray = new String[]{"weiter", "weitermachen", "naechste", "Zahl", "nochmals"};
            String[] beendenArray = new String[]{"beenden", "fertig", "nicht", "schliesse"};

            //Wörter überprüfen bei weiterArray Match nochmals ausführen
            //bei beendenArray weiterMachen auf false stellen und beenden
            for (String word : words) {
                for (String weiter : weiterArray) {
                    if (word.contains(weiter)) {
                        System.out.println("Ok.");
                    }
                }
                for (String beendenRechner : beendenArray) {
                    if (word.contains(beendenRechner)) {
                        System.out.println("Ich beende den Rechner für dich.");
                        weiterMachen = false;

                    }
                }

            }

        } while (weiterMachen == true);

    }

}
