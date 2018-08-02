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
                }
            }
        }
        for (String word : words) {
            for (String negative : negatives) {
                if (word.contains(negative)) {
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

        System.out.println("Wie kann ich dir helfen " + nameUser + "?");

        chatUser = mEingabe.nextLine();
        String[] words = chatUser.split(" ");
        String[] binrechnerArray = new String[]{"umrechnen", "binaer", "dezimal", "rechner"};
        String[] subnetingArray = new String[]{"Subnetz", "IP", "IP Adresse", "Gateway", "Broadcast"};
        String[] themaArray = new String[]{"thema", "wissen", "weisst", "sagen"};
        String[] beendenArray = new String[]{"fertig", "exit", "quit", "cancel", "schluss", "schliessen", "schliesse", "aufhoeren", "beenden"};
        String[] wlanArray = new String[]{"wifi", "wlan", "ghz", "drathlos"};

        for (String word : words) {
            for (String binrechner : binrechnerArray) {
                if (word.contains(binrechner)) {
                    System.out.println("Sehr gut, zum Thema Binaer und"
                            + " und Dezimalrechner kann ich dir Auskunft"
                            + " geben " + nameUser + ".");
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
                    System.out.println("Da ich leider noch keinen Zugriff zum Internet habe ist meine Auswahl beschränkt. "
                            + " Aber zu diesen Themen kann ich dir helfen.");
                    System.out.println("-------------------");
                    System.out.println("Netzwerk Generell--");
                    System.out.println("Subnetzrechner-----");
                    System.out.println("Topologien---------");
                    System.out.println("Binärrechner-------");
                    System.out.println("Firewall-----------");
                    System.out.println("Switches-----------");
                    System.out.println("Router-------------");
                    System.out.println("WLAN---------------");
                    System.out.println("LAN----------------");
                    System.out.println("-------------------");
                    System.out.println("Und vieleicht noch etwas mehr frag mich doch einfach :) ");

                }
            }
            for (String wlan : wlanArray) {
                if (word.contains(wlan)) {
                    System.out.println("WLAN steht für Wireless Local Area Network.");
                    System.out.println("Hiermit ist eine 2.4 GHZ oder 5 GHZ Funkverbindung gemeint, mit welcher Internet ohne");
                    System.out.println("auf ein Kabel angewiesen zu sein zu einem Gerät übertragen werden kann.");
                    System.out.println("Wi-Fi ist ein für Vermarktungszwecke erfundener Kunstbegriff,");
                    System.out.println("der in Analogie zu Hi-Fi gebildet wurde.");
                    System.out.println("Er diente dafür um das freie WLAN attraktiv zu vermarkten.");
                           

                }
            }
            for (String beenden : beendenArray) {
                if (word.contains(beenden)) {
                    System.out.println("Ich hoffe ich konnte dir helfen " + nameUser + ".");
                    System.out.println("Ich schliesse mich nun für dich.");
                    System.out.println("Bye bye!");
                    System.exit(0);

                }
            }
        }

    }

    void binrechnerMenu() {

        System.out.println("Für den Binärrechner gibt es 2 Modi.");
        System.out.println("Einmal von Binär nach Dezimal und Dezimal zu"
                + " Binär.");
        System.out.println("Welchen darf ich für dich starten? Binaer oder Dezimal?");
        chatUser = mEingabe.nextLine();
        String[] words = chatUser.split(" ");
        String[] binDezArray = new String[]{"binaer"};
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
