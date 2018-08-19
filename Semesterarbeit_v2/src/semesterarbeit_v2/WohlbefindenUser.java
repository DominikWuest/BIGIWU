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
    In dieser Klasse wird nach dem Wohlbefinden des Users gefragt.
    Der Bot erkennt eine Vielzahl von Wörtern und kann auf ein
    mehrfache Verneinung eine korrekte Antwort geben.
    Getestet mit der 40-fachen Verneinung. Korrekte Antwort erhalten.
    Gibt 4 unterschiedliche Antworten auf die möglichen Szenarien zurück.
    Hier bewusst auf eine zufällige passende Antwort verzichetet, dass
    der User auch bei einer X-fachen Verneinung die korrekte Antwort
    auslesen kann. 
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class WohlbefindenUser {

    // Scanner und String initalisieren
    private String wohlbefindenUser;
    private Scanner mEingabe = new Scanner(System.in);

    // Fragt nach dem Wohlbefinden des Users
    void frageWohlbefinden() {

        System.out.println("Wie geht es dir heute?");

        // Initialisiere Eingabe, Trenne Wörter separat 
        // damit jedes geprüft werden kann
        wohlbefindenUser = mEingabe.nextLine();
        String[] words = wohlbefindenUser.split(" ");

        /*
        Eingabe geht durch ein For each. Jedes Wort wird 
        geprüft ob es im Array vorkommt. Wird ein 
        positives Word erkannt geht man in die positiv Schlaufe. 
        Da wird nach einer Verneinung gesucht. Findet man keine 
        ist die Aussage positiv. Findet man eine Verneinung ist 
        die Aussage negativ, trotz positiven Wort. Wird ein 
        negatives Word erkannt geht man in die negative 
        Schlaufe. Da wird nach einer Verneinung gesucht.
        Findet man keine ist die Aussage negativ. Findet 
        man eine Verneinung ist die Aussage positiv, 
        trotz negativen Wort.
         */
        
        // Initialisiere boolean
        Boolean positivBoolean = false;
        Boolean negativBoolean = false;
        Boolean verneinungBoolean = false;

        // Arrays für gesuchte Schlüsselwörter
        String[] positivesArray = new String[]{"gut", "ausgezeichnet", 
            "super", "perfekt", "gesund", "angenehm", "schoener", 
            "geht", "keine", "heil", "reich", "schoen", 
            "ausgeschlafen"};
        String[] negativesArray = new String[]{"schlecht", "solala", 
            "miserabel", "katastrophal", "krank", "schlimm", "uebel", 
            "böse", "krankheit", "scheisse", "mau", "kaputt", "muede", 
            "grauenhaft", "beschissen"};
        String[] verneinungenArray = new String[]{"nicht", "ned"};
        
        /*
         Aufgrund eines Logikfehlers kann hier nicht die
         Funktion FunktionArray verwendet werdne.
         Diese bricht nach einem Match ab, so wäre die
         mehrfache Verneinung nicht gewährleistet.
        */
        
        // Jedes Wort wird geprüft und die Booleans geändert
        for (String word : words) {
            // prüft ob positiv vorhanden
            for (String positive : positivesArray) {
                if (word.equalsIgnoreCase(positive)) {
                    positivBoolean = true;
                }
            }
        }
        for (String word : words) {
            // prüft ob negativ vorhanden
            for (String negative : negativesArray) {
                if (word.equalsIgnoreCase(negative)) {
                    negativBoolean = true;
                }
            }
        }
        for (String word : words) {
            // prüft ob verneinung vorhanden
            // Erkennt so mehrfach verneinungen
            for (String verneinung : verneinungenArray) {
                if (word.equalsIgnoreCase(verneinung)) {
                    verneinungBoolean = !verneinungBoolean;

                }
            }
        }
        

        // Positive Schlaufe
        if (positivBoolean == true) {
            // Verneinung gefunden
            if (verneinungBoolean == true) {
                System.out.println("Schade aber auch das geht vorüber."
                        + " Think positiv :) ");
                // Keine Verneinung gefunden
            } else {
                System.out.println("Gut zu hören mein Code hat keine Bugs "
                        + "also gehts mir gut. :) ");
            }
        }
        // Negative Schlaufe
        if (negativBoolean == true) {
            // Verneinung gefunden 
            if (verneinungBoolean == true) {
                System.out.println("Sehr schön, meinen Code geht es auch "
                        + "prächtig :) ");
                // Keine Verneinung gefunden
            } else {
                System.out.println("Das ist schade! Aber "
                        + "Kopfhoch das wird schon wieder :) ");
            }
        }

        //Text anzeige zur Info für User
        System.out.println("So an die Arbeit!");
        System.out.println("Ich kann dir diverse Fragen"
                + " zum Thema Netzwerk beantworten.");

        System.out.println("Ich kann dir auch ein Auflistung mit den mir"
                + " bekannten Themen geben.");
        System.out.println("Sag dafür nur Thema.");

    }

}
