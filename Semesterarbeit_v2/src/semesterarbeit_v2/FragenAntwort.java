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
    Topologien top1 = new Topologien();
    Lan lan1 = new Lan();
    Wlan wlan1 = new Wlan();
    Firewall firewall1 = new Firewall();
    Switch switch1 = new Switch();
    Router router1 = new Router();
    Thema thema1 = new Thema();
    Network network1 = new Network();
    Name name1 = new Name();
    Wetter wetter1 = new Wetter();
    WohlbefindenBot wohlbefindenBot1 = new WohlbefindenBot();
    Witz witz1 = new Witz();
    Impressum impressum1 = new Impressum();

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
        String[] binrechnerArray = new String[]{"umrechnen", "binaer", "dezimal", "rechner", "rechnen", "eins", "nullen"};
        String[] subnetingArray = new String[]{"subnetz", "ip", "adresse", "gateway", "broadcast"};
        String[] themaArray = new String[]{"thema", "wissen", "weisst", "sagen"};
        String[] firewallArray = new String[]{"firewall", "ports", "trunk", "sicherheit", "blockieren"};
        String[] wlanArray = new String[]{"wifi", "wlan", "ghz", "drathlos"};
        String[] nameArray = new String[]{"name", "heisst", "gigachatbot3000", "bigiwu"};
        String[] topologieArray = new String[]{"topologie", "stern", "daisychain", "bus", "mesh", "line", "zusammenschliessen", "token", "ring", "tokenring", "tree"};
        String[] lanArray = new String[]{"lan", "ethernet", "cat", "drahtgebundene", "patch"};
        String[] switchArray = new String[]{"switch", "ports", "ethernetconnection", "verbindung"};
        String[] beendenArray = new String[]{"fertig", "exit", "quit", "cancel", "schluss", "schliessen", "schliesse", "aufhoeren", "beenden"};
        String[] routerArray = new String[]{"router", "internetverbindung", "internet", "anbieter", "provider"};
        String[] networkArray = new String[]{"netzwerk", "network", "generell", "allgemein", "erklaerung"};
        String[] wetterArray = new String[]{"wetter", "sonne", "regen", "schnee", "kalt", "warm", "regenschirm", "jacke", "schneit", "regnet"};
        String[] wohlbefindenBotArray = new String[]{"geht", "fuehlst"};
        String[] witzArray = new String[]{"witz", "lustig", "lachen"};
        String[] infoArray = new String[]{"urheber", "copyright", "impressum", "about"};

        for (String word : words) {
            for (String binrechner : binrechnerArray) {
                if (word.contains(binrechner)) {
                    System.out.println("Sehr gut, zum Thema Binaer und"
                            + " Dezimalrechner kann ich dir Auskunft"
                            + " geben " + nameUser + ".");
                    binrechnerMenu();
                }
            }
            for (String network : networkArray) {
                if (word.contains(network)) {
                    System.out.println("Eine generelle kurze Erklärung?");
                    System.out.println("Aber sicher doch " + nameUser + ".");
                    network1.detaliertNetwork();

                }
            }
            for (String wohlbefindenBot : wohlbefindenBotArray) {
                if (word.contains(wohlbefindenBot)) {
                    
                    wohlbefindenBot1.wohlBot();
                    

                }
            }
            for (String witze : witzArray) {
                if (word.contains(witze)) {
                    
                    witz1.witzeSammlung();
                    

                }
            }
            for (String impressum : infoArray) {
                if (word.contains(impressum)) {
                    impressum1.infoImpressum();

                }
            }
            for (String subrechner : subnetingArray) {
                if (word.contains(subrechner)) {
                    System.out.println("Aber sicher doch " + nameUser + ". Ich kann dir mit"
                            + " einem Subnetz und IP Rechner aushelfen.");
                    // HIER SUBNET RECHNER INTEGRIEREN
                }
            }
            for (String topologien : topologieArray) {
                if (word.contains(topologien)) {
                    System.out.println("Das Thema Topologie finde ich auch spannend " + nameUser + ".");
                    System.out.println("Hier meine Zusammenfassung.");
                    top1.detailiertTopologien();

                }
            }
            for (String lan : lanArray) {
                if (word.contains(lan)) {
                    System.out.println("Classic. Lass mir dir LAN erklären " + nameUser + ".");
                    lan1.detailiertLan();

                }
            }
            for (String firewall : firewallArray) {
                if (word.contains(firewall)) {
                    System.out.println("The Stage is on Fire!" + nameUser + " das weiss ich zur Firewall.");
                    firewall1.detailiertFirewall();

                }
            }
            for (String switchWord : switchArray) {
                if (word.contains(switchWord)) {
                    System.out.println(nameUser + " zu Switchen weiss ich so einiges.");
                    switch1.detailiertSwitch();

                }
            }
            for (String router : routerArray) {
                if (word.contains(router)) {
                    System.out.println("Fragen zum Wunderkasten, welcher Internet ins Haus bringt?");
                    System.out.println("Die kann ich dir beantworten " + nameUser + ".");
                    router1.detailiertRouter();

                }
            }
            for (String thema : themaArray) {
                if (word.contains(thema)) {
                    System.out.println("Alles klar " + nameUser + ".");
                    thema1.detailiertThema();

                }
            }
            for (String wlan : wlanArray) {
                if (word.contains(wlan)) {
                    System.out.println("Zum Thema WLAN kann ich dir helfen " + nameUser + ".");
                    wlan1.detailiertWlan();

                }
            }

            for (String nameBot : nameArray) {
                if (word.contains(nameBot)) {
                    System.out.println("Jaa jaaa " + nameUser + ". Wiedermal fragen zu meinen Namen. ;) ");
                    name1.detailiertName();
                }
            }
            
            for (String wetter : wetterArray) {
                if (word.contains(wetter)) {
                    System.out.println(nameUser + " hast du keine Fenster bei dir?");
                    System.out.println("Aber ja ich kann dir sagen wie das Wetter heute sein wird. Fast so gut wie Siri.");
                    wetter1.detailiertWetter();
                    
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
        //TEST CODE Google Search Auslagern in eigene Klasse
            /*for (String google : googleArray) {
                if (word.contains(google)) {
                    System.out.println("Google Search");

                    String question = "what is this?";

                    question = question.replace(' ', '+');

                    try {
                        Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome https://www.google.com/search?q=" + question});
                    } catch (Exception e) {

                    }

                }
            }*/

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
