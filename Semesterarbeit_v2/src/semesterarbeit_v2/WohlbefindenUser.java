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
    In dieser Klasse wird nach dem Wohlbefinden des Users gefragt
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
        Eingabe geht durch ein For each. Jedes Wort wird geprüft ob
        es im Array vorkommt. Wird ein positives Word erkannt geht man
        In die positiv Schlaufe. Da wird nach einer Verneinung gesucht.
        Findet man keine ist die Aussage positiv. Findet man eine Verneinung
        ist die Aussage negativ, trotz positiven Wort.
        Wird ein negatives Word erkannt geht man
        In die negative Schlaufe. Da wird nach einer Verneinung gesucht.
        Findet man keine ist die Aussage negativ. Findet man eine Verneinung
        ist die Aussage positiv, trotz negativen Wort.
         */
        //Initialisiere boolean
        Boolean positivBoolean = false;
        Boolean negativBoolean = false;
        Boolean verneinungBoolean = false;

        //Arrays für gesuchte Schlüsselwörter
        String[] positives = new String[]{"gut", "ausgezeichnet", "super", "perfekt", "gesund", "angenehm", "schoener", "geht", "keine", "heil", "reich", "schoen", "ausgeschlafen"};
        String[] negatives = new String[]{"schlecht", "solala", "miserabel", "katastrophal", "krank", "schlimm", "übel", "böse", "krankheit", "mau", "kaputt", "muede"};
        String[] verneinungen = new String[]{"nicht", "ned"};

        //Jedes Wort wird geprüft und die Booleans geändert
        for (String word : words) {
            //prüft ob positiv
            for (String positive : positives) {
                if (word.equalsIgnoreCase(positive)) {
                    positivBoolean = true;
                }
            }
        }
        for (String word : words) {
            //prüft ob negativ
            for (String negative : negatives) {
                if (word.equalsIgnoreCase(negative)) {
                    negativBoolean = true;
                }
            }
        }
        for (String word : words) {
            //prüft ob verneinung
            for (String verneinung : verneinungen) {
                if (word.equalsIgnoreCase(verneinung)) {
                    verneinungBoolean = true;

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
                System.out.println("Ach Kopfhoch das wird schon wieder :) ");
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
