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
Hier wird der eigendliche Chatbot programmiert. Kommunikation
mit Fragen und Antworten.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class FragenAntwort {

    BinaerRechner bin1 = new BinaerRechner();
    SubnetRechner sub1 = new SubnetRechner();
    // SubnetRechner sub1 = new SubnetRechner();
    private Scanner mEingabe = new Scanner(System.in);
    private String nameUser;
    private String wohlbefindenUser;
    private String chatUser;

    void frageName() {

        System.out.println("Zuerst mal Hallo von meiner Seite.");
        System.out.println("Mein Name ist Bigiwu-Bot.");
        System.out.println("Wie lautet dein Name?");
        nameUser = mEingabe.nextLine();

        System.out.println("Dein Name lautet also " + nameUser + ".");
        System.out.println("Naja meiner ist ja auch nicht besser...");

    }

    void frageWohlbefinden() {

        System.out.println("Wie geht es dir heute " + nameUser + "?");
        wohlbefindenUser = mEingabe.nextLine();
        String[] words = wohlbefindenUser.split(" ");

        /*
            positve + positive = positive
            positve + negative = negative
            negative + negative = positive
         */
        // true = 1 ist negative, false = 0 ist positive
        Boolean aussageBoolean1 = true; 
        Boolean aussageBoolean2 = true; 
        Boolean aussageBoolean;
        String[] positives = new String[]{"gut", "ausgezeichnet", "super", "perfekt", "gesund", "angenehm", "schöner", "geht", "keine", "heil", "reich", "schön", "ausgeschlafen"};
        String[] negatives = new String[]{"nicht", "schlecht", "solala", "miserabel", "katastrophal", "krank", "schlimm", "übel", "böse", "krankheit", "mau", "kaputt", "müde"};

        for (String word : words) {
            for (String positive : positives) {
                if (word.contains(positive)) {
                    aussageBoolean1 = false;
                } else {
                    aussageBoolean1 = true;
                }
            }
        }
        for (String word : words) {
            for (String negative : negatives) {
                if (word.contains(negative)) {
                    aussageBoolean2 = true;
                } else {
                    aussageBoolean2 = false;
                }
            }
        }
        
        aussageBoolean = aussageBoolean1 ^ aussageBoolean2;

        if (aussageBoolean == false) {
            // positive
            System.out.println("Gut zu hören " + nameUser + ". Mein Code hat keine Bugs also"
                    + " gehts mir gut. :) ");
        } else {
            //negative
            System.out.println("Schade aber auch das geht vorüber."
                    + " Think positiv :) ");
        }

        System.out.println("So an die Arbeit!");
        System.out.println("Ich kann dir diverse Fragen"
                + " zum Thema Netzwerk beantworten.");

        System.out.println("Ich kann dir auch ein Auflistung mit den mir"
                + " bekannten Themen geben.");
        System.out.println("Sag dafür nur Thema.");

        /*
        
        Boolean hasPositives;
        Boolean hasNegatives;
        
     
        
        for (String positive : positives) {
            hasPositives = wohlbefindenUser.contains(positive);
            if(hasPositives)
                break;
        }
        
        for (String negative : negatives) {
            hasNegatives = wohlbefindenUser.contains(negative);
            if(hasNegatives)
                break;
        }
                    System.out.println("Das freut mich zu hören!");
                System.out.println("Mein Code hat keine Bugs also"
                        + " gehts mir auch gut.");
                break;
  
        
         */

 /*  switch (wohlbefindenUser) {
            case "gut":
            case "Gut":
            case "Sehr gut": 
            case "sehr gut":{
                System.out.println("Das freut mich zu hören!");
                System.out.println("Mein Code hat keine Bugs also"
                        + " gehts mir auch gut.");
                break;
            }
            case "schlecht":{
                System.out.println("Schade denk einfach an etwas positives"
                        + " wie z.B. Security updates. :) ");
                break;
                
            }
            
        }*/
    }

    void chatPartner() {
        
        System.out.println("Wie kann ich dir helfen?");
        
        chatUser = mEingabe.nextLine();
        String[] words = chatUser.split(" ");
        String[] binrechnerArray = new String[]{"umrechnen", "binaer", "binär", "dezimal"};
        String[] subnetingArray = new String[]{"Subnetz", "IP", "IP Adresse", "Gateway", "Broadcast"};
        String[] themaArray = new String[]{"thema", "was kannst du zeigen", "was weisst"};

        

        for (String word : words) {
            for (String binrechner : binrechnerArray) {
                if (word.contains(binrechner)) {
                    System.out.println("Sehr gut, zum Thema Binaer und"
                            + " und Dezimalrechner kann ich dir Auskunft"
                            + " geben.");
                    binrechnerMenu();
                }
            }
            for (String subrechner : subnetingArray) {
                if (word.contains(subrechner)) {
                    System.out.println("Aber sicher doch " + nameUser + ". Ich kann dir mit"
                            + " einem Subnetz und IP Rechner aushelfen.");
                    // HIER SUBNET RECHNER INTEGRIEREN
                }
            }

            for (String thema : themaArray) {
                if (word.contains(thema)) {
                    System.out.println("Alles klar " + nameUser + ".");
                    System.out.println("Ich kann dir zu folgenden Themen auskunft geben.");

                }
            }
        }

    }

    void binrechnerMenu() {

        System.out.println("Für den Binärrechner gibt es 2 Modi.");
        System.out.println("Einmal von Binär nach Dezimal und Dezimal zu"
                + " Binär.");
        System.out.println("Welchen darf ich für dich starten?");
        chatUser = mEingabe.nextLine();
        String[] words = chatUser.split(" ");
        String[] binDezArray = new String[]{"binär"};
        String[] dezBinArray = new String[]{"dezimal"};

        for (String word : words) {
            for (String binDezRechner : binDezArray) {
                if (word.contains(binDezRechner)) {
                    System.out.println("Ich starte für dich den Binär zu "
                            + "Dezimal Rechner");
                    bin1.bintoDezRechner();
                }
            }
            for (String dezBinRechner : dezBinArray) {
                if (word.contains(dezBinRechner)) {
                    System.out.println("Ich starte für dich den Dezimal zu "
                            + "Binär Rechner");
                    bin1.deztoBinRechner();
                }
            }
        }

    }
}
