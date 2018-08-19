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
    Beschimpfung beschimpfung1 = new Beschimpfung();
    HelfenAussage helfen1 = new HelfenAussage();
    NoMatch noMatch1 = new NoMatch();

    //Initialisiere Scanner und Variabeln
    private Scanner mEingabe = new Scanner(System.in);
    private String nameUser;
    private String chatUser;

    // Fragt nach dem Namen des Users
    void frageName() {

        System.out.println("Zuerst mal Hallo von meiner Seite.");
        System.out.println("Mein Name ist Bigiwu-Bot.");
        System.out.println("Wie lautet dein Name?");
        nameUser = mEingabe.nextLine();

        System.out.println("Dein Name lautet also " + nameUser + ".");
        System.out.println("Naja meiner ist ja auch nicht besser...");

    }

    void chatPartner() {

        // Fragt den User wie er ihm helfen kann
        helfen1.helfenSammlung(nameUser);

        // Initialisiere Eingabe und Split der Wörter für Erkennung
        // Darstellung für Ausdruck auf A4 untereinander geschoben
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

        String[] schimpfwortArray = new String[]{"scheisse", "bloed", "doof",
            "mist", "dumm"};

        String[] beendenArray = new String[]{"fertig", "exit", "quit",
            "cancel", "schluss", "schliessen", "aufhoeren", "beenden",
            "ciao", "adios", "bye"};

        String[][] allArray = new String[][]{binrechnerArray, subnetingArray,
            themaArray, firewallArray, wlanArray, nameArray, topologieArray,
            lanArray, switchArray, beendenArray, routerArray, networkArray,
            wetterArray, wohlbefindenBotArray, infoArray, witzArray,
            schimpfwortArray};

        // Geht in die Funkton Uebereinstimmungen und prüft Wort für Wort
        // ob er in dem Vorgegeben Array einen Match hat.
        // Findet er einen öffnet er die Methode die zum Array passt
        // und liefert dem User die Antwort.
        // Darstellung für A4 ausdruck zusammengerückt.
        if (Utilities.uebereinstimungen(words, binrechnerArray)) {
            System.out.println("Sehr gut, zum Thema Binaer und"
                    + " Dezimalrechner kann ich dir Auskunft"
                    + " geben " + nameUser + ".");
            binM1.binrechnerMenu();
        } else if (Utilities.uebereinstimungen(words, subnetingArray)) {
            System.out.println("Aber sicher doch " + nameUser + "."
                    + " Ich kann dir mit einem Subnetz "
                    + "und IP Rechner aushelfen.");
            subnet1.ipToNetmask();
        } else if (Utilities.uebereinstimungen(words, themaArray)) {
            System.out.println("Alles klar " + nameUser + ".");
            thema1.detailiertThema();
        } else if (Utilities.uebereinstimungen(words, firewallArray)) {
            System.out.println("The Stage is on Fire! "
                    + nameUser + " das weiss ich zur Firewall.");
            firewall1.detailiertFirewall();
        } else if (Utilities.uebereinstimungen(words, wlanArray)) {
            System.out.println("Zum Thema WLAN kann ich dir "
                    + "helfen " + nameUser + ".");
            wlan1.detailiertWlan();
        } else if (Utilities.uebereinstimungen(words, nameArray)) {
            System.out.println("Jaa jaaa " + nameUser + ". "
                    + "Fragen zu meinen Namen. ;) ");
            name1.detailiertName();
        } else if (Utilities.uebereinstimungen(words, topologieArray)) {
            System.out.println("Das Thema Topologie finde ich "
                    + "auch spannend " + nameUser + ".");
            System.out.println("Hier meine Zusammenfassung.");
            top1.detailiertTopologien();
        } else if (Utilities.uebereinstimungen(words, lanArray)) {
            System.out.println("Classic. Lass mir dir LAN "
                    + "erklären " + nameUser + ".");
            lan1.detailiertLan();
        } else if (Utilities.uebereinstimungen(words, switchArray)) {
            System.out.println(nameUser + " zu Switchen "
                    + "weiss ich so einiges.");
            switch1.detailiertSwitch();
        } else if (Utilities.uebereinstimungen(words, routerArray)) {
            System.out.println("Fragen zum Wunderkasten, "
                    + "welcher Internet ins Haus bringt?");
            System.out.println("Die kann ich dir beantworten "
                    + nameUser + ".");
            router1.detailiertRouter();
        } else if (Utilities.uebereinstimungen(words, networkArray)) {
            System.out.println("Eine generelle kurze Erklärung?");
            System.out.println("Aber sicher doch " + nameUser + ".");
            network1.detaliertNetwork();
        } else if (Utilities.uebereinstimungen(words, wetterArray)) {
            System.out.println(nameUser + " hast du keine "
                    + "Fenster bei dir?");
            System.out.println("Aber ja ich kann dir sagen wie "
                    + "das Wetter heute sein wird. "
                    + "Fast so gut wie Siri.");
            wetter1.detailiertWetter();
        } else if (Utilities.uebereinstimungen(words, wohlbefindenBotArray)) {
            wohlbefindenBot1.wohlBot();
        } else if (Utilities.uebereinstimungen(words, infoArray)) {
            impressum1.infoImpressum();
        } else if (Utilities.uebereinstimungen(words, witzArray)) {
            witz1.witzeSammlung();
        } else if (Utilities.uebereinstimungen(words, schimpfwortArray)) {
            beschimpfung1.schimpfSammlung();
        } else if (Utilities.uebereinstimungen(words, beendenArray)) {
            System.out.println("Ich hoffe ich konnte dir "
                    + "helfen " + nameUser + ".");
            System.out.println("Ich schliesse mich "
                    + "nun für dich.");
            System.out.println("Bye bye!");
            System.exit(0);
        }
    }
}
