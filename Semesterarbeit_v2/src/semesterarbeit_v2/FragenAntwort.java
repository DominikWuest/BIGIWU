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
    
    //Objekte aus Klassen erstellen
    BinRechnerMenu binM1 = new BinRechnerMenu();
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
    SubnetRechner subnet1 = new SubnetRechner();
    
    //Initialisiere Scanner und Variabeln
    private Scanner mEingabe = new Scanner(System.in);
    private String nameUser;
    private String chatUser;

    void frageName() {

        System.out.println("Zuerst mal Hallo von meiner Seite.");
        System.out.println("Mein Name ist Bigiwu-Bot.");
        System.out.println("Wie lautet dein Name?");
        nameUser = mEingabe.nextLine();

        System.out.println("Dein Name lautet also " + nameUser + ".");
        System.out.println("Naja meiner ist ja auch nicht besser...");

    }

    

    void chatPartner() {

        System.out.println("Wie kann ich dir helfen " + nameUser + "?");

        chatUser = mEingabe.nextLine();
        String[] words = chatUser.split(" ");
        String[] binrechnerArray = new String[]{"binaer", "dezimal", "rechnen", 
            "eins", "nullen"};
        
        String[] subnetingArray = new String[]{"subnetz", "ip", "adresse", 
            "adressen", "gateway", "broadcast", "subnetting", 
            "ipadressen", "ipadresse"};
        
        String[] themaArray = new String[]{"thema", "katalog", 
            "themas", "themen"};
        
        String[] firewallArray = new String[]{"firewall", "ports", 
            "trunk", "sicherheit", "blockieren"};
        
        String[] wlanArray = new String[]{"wifi", "wlan", "ghz", "drathlos"};
        
        String[] nameArray = new String[]{"name", "heisst", 
            "gigachatbot3000", "bigiwu"};
        
        String[] topologieArray = new String[]{"topologie", "stern", 
            "daisychain", "bus", "mesh", "line", "zusammenschliessen", 
            "token", "ring", "tokenring", "tree"};
        
        String[] lanArray = new String[]{"lan", "ethernet", "cat", 
            "drahtgebundene", "patch"};
        
        String[] switchArray = new String[]{"switch", "ports", 
            "ethernetconnection", "verbindung"};
        
        String[] beendenArray = new String[]{"fertig", "exit", "quit", 
            "cancel", "schluss", "schliessen", "aufhoeren", "beenden", 
            "ciao", "adios", "bye"};
        
        String[] routerArray = new String[]{"router", "internetverbindung", 
            "internet", "anbieter", "provider"};
        
        String[] networkArray = new String[]{"netzwerk", "network", "generell", 
            "allgemein", "erklaerung"};
        
        String[] wetterArray = new String[]{"wetter", "sonne", "regen", 
            "schnee", "kalt", "warm", "regenschirm", "jacke", 
            "schneit", "regnet"};
        
        String[] wohlbefindenBotArray = new String[]{"geht", "fuehlst", 
            "gefuehle"};
        
        String[] witzArray = new String[]{"witz", "lustig", "lachen"};
        
        String[] infoArray = new String[]{"urheber", "copyright", 
            "impressum", "about"};

        for (String word : words) {
            for (String binrechner : binrechnerArray) {
                if (word.equalsIgnoreCase(binrechner)) {
                    System.out.println("Sehr gut, zum Thema Binaer und"
                            + " Dezimalrechner kann ich dir Auskunft"
                            + " geben " + nameUser + ".");
                    binM1.binrechnerMenu();
                }
            }
            for (String network : networkArray) {
                if (word.equalsIgnoreCase(network)) {
                    System.out.println("Eine generelle kurze Erklärung?");
                    System.out.println("Aber sicher doch " + nameUser + ".");
                    network1.detaliertNetwork();

                }
            }
            for (String wohlbefindenBot : wohlbefindenBotArray) {
                if (word.equalsIgnoreCase(wohlbefindenBot)) {
                    
                    wohlbefindenBot1.wohlBot();
                    

                }
            }
            for (String witze : witzArray) {
                if (word.equalsIgnoreCase(witze)) {
                    
                    witz1.witzeSammlung();
                    

                }
            }
            for (String impressum : infoArray) {
                if (word.equalsIgnoreCase(impressum)) {
                    impressum1.infoImpressum();

                }
            }
            for (String subrechner : subnetingArray) {
                if (word.equalsIgnoreCase(subrechner)) {
                    System.out.println("Aber sicher doch " + nameUser + ". Ich kann dir mit"
                            + " einem Subnetz und IP Rechner aushelfen.");
                    subnet1.ipToNetmask();
                }
            }
            for (String topologien : topologieArray) {
                if (word.equalsIgnoreCase(topologien)) {
                    System.out.println("Das Thema Topologie finde ich auch spannend " + nameUser + ".");
                    System.out.println("Hier meine Zusammenfassung.");
                    top1.detailiertTopologien();

                }
            }
            for (String lan : lanArray) {
                if (word.equalsIgnoreCase(lan)) {
                    System.out.println("Classic. Lass mir dir LAN erklären " + nameUser + ".");
                    lan1.detailiertLan();

                }
            }
            for (String firewall : firewallArray) {
                if (word.equalsIgnoreCase(firewall)) {
                    System.out.println("The Stage is on Fire! " + nameUser + " das weiss ich zur Firewall.");
                    firewall1.detailiertFirewall();

                }
            }
            for (String switchWord : switchArray) {
                if (word.equalsIgnoreCase(switchWord)) {
                    System.out.println(nameUser + " zu Switchen weiss ich so einiges.");
                    switch1.detailiertSwitch();

                }
            }
            for (String router : routerArray) {
                if (word.equalsIgnoreCase(router)) {
                    System.out.println("Fragen zum Wunderkasten, welcher Internet ins Haus bringt?");
                    System.out.println("Die kann ich dir beantworten " + nameUser + ".");
                    router1.detailiertRouter();

                }
            }
            for (String thema : themaArray) {
                if (word.equalsIgnoreCase(thema)) {
                    System.out.println("Alles klar " + nameUser + ".");
                    thema1.detailiertThema();

                }
            }
            for (String wlan : wlanArray) {
                if (word.equalsIgnoreCase(wlan)) {
                    System.out.println("Zum Thema WLAN kann ich dir helfen " + nameUser + ".");
                    wlan1.detailiertWlan();

                }
            }

            for (String nameBot : nameArray) {
                if (word.equalsIgnoreCase(nameBot)) {
                    System.out.println("Jaa jaaa " + nameUser + ". Wiedermal fragen zu meinen Namen. ;) ");
                    name1.detailiertName();
                }
            }
            
            for (String wetter : wetterArray) {
                if (word.equalsIgnoreCase(wetter)) {
                    System.out.println(nameUser + " hast du keine Fenster bei dir?");
                    System.out.println("Aber ja ich kann dir sagen wie das Wetter heute sein wird. Fast so gut wie Siri.");
                    wetter1.detailiertWetter();
                    
                }
            }

            
            for (String beenden : beendenArray) {
                if (word.equalsIgnoreCase(beenden)) {
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

}
