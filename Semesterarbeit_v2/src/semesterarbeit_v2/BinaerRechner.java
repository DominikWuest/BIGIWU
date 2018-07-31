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

    Scanner mEingabeZahl = new Scanner(System.in);
    Scanner beenden = new Scanner(System.in);
    Scanner mEingabeAuswahl = new Scanner (System.in);

    int auswahl;
    int binaerzahl1;
    long binaerzahl2;
    int binaerausgabe;
    String bitstring;
    String auswahlString;
    Boolean weiterMachen = true;

    void bintoDezRechner() {

        //Bitlänge zählen
        do {

            System.out.println("Zum beenden des Rechners sag einfach Beenden :) ");
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

            } else if (bitstring.contains("beenden")) {
                System.out.println("Ich beende den Rechner für dich.");
                weiterMachen = false;

            }

        } while (weiterMachen == true);
    }

    void deztoBinRechner() {

        do {

            int dezstring;
            System.out.println("Bitte gebe eine Dezimale Zahl ein:");
            dezstring = mEingabeZahl.nextInt();
            System.out.println("Deine Zahl lautet in der Binären Schreibweise: ");
            System.out.println(Integer.toBinaryString(dezstring));
            System.out.println("Möchtest du weiter machen oder den Rechner beenden?");
            
            auswahlString = mEingabeAuswahl.nextLine();
            String[] words = auswahlString.split(" ");
            String[] weiterArray = new String[]{"weiter", "weitermachen", "naechste", "Zahl", "nochmals"};
            String[] beendenArray = new String[]{"beenden", "fertig", "nicht", "schliesse"};
            
            for (String word : words){
                for (String weiterMachen : weiterArray ){
                    if (word.contains(weiterMachen)) {
                        System.out.println("Ok.");
                    }
                }
                for (String beendenRechner : beendenArray ){
                    if (word.contains(beendenRechner)) {
                        System.out.println("Ich beende den Rechner für dich.");
                        weiterMachen = false;
                        
                        
                    }
                }
                
            }
            

        } while (weiterMachen == true);

    }

    // WIRD NICHT MEHR VERWENDET
    /* private void beendenBintoDezRechner() {

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
     */
}
