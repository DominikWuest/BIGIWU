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
    Klasse mit den Arrays
    Hier werden alle Arrays gespeichert um den restlichen Code schlanker
    zu halten. Arrays können in allen Classen verwendet werden.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

public class StringArrays {

    //FragenAntwort Klasse Strings
    public static String[] binrechnerArray = new String[]{"binaer", "dezimal", "null",
        "eins", "nullen"};

    public static String[] subnetingArray = new String[]{"subnetz", "ip", "adresse",
        "adressen", "gateway", "broadcast", "subnetting",
        "ipadressen", "ipadresse", "subnet", "subnetzrechner",
        "subnetzmaske", "maske", "iprechner", "ipadresse", "ipadressen",
        "gatewayadresse", "broadcastadresse"};

    public static String[] themaArray = new String[]{"thema", "katalog",
        "themas", "themen", "wissensdatenbank"};

    public static String[] firewallArray = new String[]{"firewall", "ports",
        "trunk", "sicherheit", "blockieren"};

    public static String[] wlanArray = new String[]{"wifi", "wlan", "ghz", "drathlos"};

    public static String[] nameArray = new String[]{"name", "heisst",
        "gigachatbot3000", "bigiwu"};

    public static String[] topologieArray = new String[]{"topologie", "stern",
        "daisychain", "bus", "mesh", "line", "zusammenschliessen",
        "token", "ring", "tokenring", "tree"};

    public static String[] lanArray = new String[]{"lan", "ethernet", "cat",
        "drahtgebundene", "patch", "rj45", "rj-45"};

    public static String[] switchArray = new String[]{"switch", "port",
        "ethernetconnection", "verbindung", "networkswitch"};

    public static String[] routerArray = new String[]{"router", "internetverbindung",
        "internet", "anbieter", "provider"};

    public static String[] networkArray = new String[]{"netzwerk", "network", "generell",
        "allgemein"};

    public static String[] wetterArray = new String[]{"wetter", "sonne", "regen",
        "schnee", "kalt", "warm", "regenschirm", "jacke",
        "schneit", "regnet", "schirm"};

    public static String[] wohlbefindenBotArray = new String[]{"geht", "fuehlst",
        "gefuehle"};

    public static String[] witzArray = new String[]{"witz", "lustig",
        "lachen", "fun", "funny", "witzig", "witziges"};

    public static String[] infoArray = new String[]{"urheber", "copyright",
        "impressum", "about", "mehr erfahren", "über dich"};

    public static String[] schimpfwortArray = new String[]{"scheisse", "bloed", "doof",
        "mist", "dumm"};

    public static String[] beendenArray = new String[]{"fertig", "exit", "quit",
        "cancel", "schluss", "schliessen", "aufhoeren", "beenden",
        "ciao", "adios", "bye"};

    // BinRechnerMenu
    public static String[] binDezArray = new String[]{"binaer", "bin"};
    public static String[] dezBinArray = new String[]{"dezimal", "dez"};

    // BinaerRechner und SubnetRechner
    public static String[] weiterArray = new String[]{"weiter", "weitermachen",
        "naechste", "Zahl", "nochmals"};
    public static String[] exitMethodeArray = new String[]{"beenden", "fertig",
        "nicht", "schliesse", "exit", "quit", "aufhoeren", "cancel"};

    // NoMatch Arrays
    public static String[] nochmalsArray = new String[]{"nochmals", "vertippt",
        "noch", "mal", "typo", "normal", "bot", "eingeben"};
    public static String[] googleArray = new String[]{"google", "suche",
        "internet", "search", "starten"};

    // WohlbefindenUser
    public static String[] positivesArray = new String[]{"gut", "ausgezeichnet",
        "super", "perfekt", "gesund", "angenehm", "schoener",
        "geht", "keine", "heil", "reich", "schoen", "ausgeschlafen", "glücklich"};
    public static String[] negativesArray = new String[]{"schlecht", "solala",
        "miserabel", "katastrophal", "krank", "schlimm", "uebel",
        "böse", "krankheit", "scheisse", "mau", "kaputt", "muede",
        "grauenhaft", "beschissen", "hungrig", "hunger"};
    public static String[] verneinungenArray = new String[]{"nicht", "ned"};

}
