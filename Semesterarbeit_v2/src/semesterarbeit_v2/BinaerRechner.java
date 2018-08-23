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
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
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

    // Arrays für überprüfung initialisieren
    String[] weiterArray = new String[]{"weiter", "weitermachen",
        "naechste", "Zahl", "nochmals"};
    String[] beendenArray = new String[]{"beenden", "fertig",
        "nicht", "schliesse", "exit"};

    void bintoDezRechner() {

        System.out.println("Zum beenden des Rechners sag "
                + "einfach Beenden :) ");

        //Für mindestens einen Durchlauf eine Do-While Schlaufe
        //Wenn weiterMachen boolean false, dann Programm beenden
        do {

            System.out.println("Bitte gib einen binären String ein: (0/1)");

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

            // Frage nach fortführung des Rechners
            // NextLine initalisieren, Wörter aufteilen in neues Array
            System.out.println("Möchtest du weiter machen "
                    + "oder den Rechner beenden?");
            auswahlString = mEingabeAuswahl.nextLine();
            // Splittet in einzelne Wörter. Erkennt auch 
            // Sonderzeichzen nach dem 
            // Wort z.b. Netzwerk? wird korrekt als Netzwerk erkannt.
            // REGEX \\W+
            String[] words = auswahlString.split("\\W+");

            // Wörter überprüfen bei weiterArray Match nochmals ausführen
            // bei beendenArray weiterMachen auf false stellen und beenden
            // Mithilfe der Funktion FunktionArray überprüft
            if (FunktionArray.uebereinstimungen(words, weiterArray)) {
                System.out.println("Ok.");
            } else if (FunktionArray.uebereinstimungen(words, beendenArray)) {
                System.out.println("Ich beende den Rechner für dich.");
                weiterMachen = false;
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
            System.out.println("Deine Zahl lautet in der "
                    + "Binären Schreibweise: ");
            //Zahl convetieren
            System.out.println(Integer.toBinaryString(dezstring));
            System.out.println("Möchtest du weiter machen "
                    + "oder den Rechner beenden?");

            //Frage nach fortführung des Rechners
            //NextLine initalisieren, Wörter aufteilen in neues Array
            auswahlString = mEingabeAuswahl.nextLine();
            String[] words = auswahlString.split(" ");

            // Wörter überprüfen bei weiterArray Match nochmals ausführen
            // bei beendenArray weiterMachen auf false stellen und beenden
            // Mithilfe der Funktion FunktionArray überprüft
            if (FunktionArray.uebereinstimungen(words, weiterArray)) {
                System.out.println("Machen wir weiter.");
            } else if (FunktionArray.uebereinstimungen(words, beendenArray)) {
                System.out.println("Ich beende den Rechner für dich.");
                weiterMachen = false;
            }
        } while (weiterMachen == true);

    }

}
