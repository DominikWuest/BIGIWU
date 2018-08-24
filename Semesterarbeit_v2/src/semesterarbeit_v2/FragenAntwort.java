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
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
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
    NameBot name1 = new NameBot();
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
    private String chatUser;

    // Fragt nach dem Namen des Users


    void chatPartner(NameUser nameUser1) {

        // Fragt den User wie er ihm helfen kann
        helfen1.helfenSammlung(nameUser1);

        // Initialisiere Eingabe und Split der Wörter für Erkennung
        
        chatUser = mEingabe.nextLine();
        // Splittet in einzelne Wörter. Erkennt auch Sonderzeichzen nach dem 
        // Wort z.b. Netzwerk? wird korrekt als Netzwerk erkannt.
        // REGEX \\W+
        String[] words = chatUser.split("\\W+");
        

        // Geht in die Funkton Uebereinstimmungen und prüft Wort für Wort
        // ob er in dem Vorgegeben Array einen Match hat.
        // Findet er einen öffnet er die Methode die zum Array passt
        // und liefert dem User die Antwort.
        // Arrays mit möglichen Antowrten sind in der Klasse 
        // StringArrays definiert.
        if (FunktionArray.uebereinstimungen(words, StringArrays.binrechnerArray)) {
            binM1.binrechnerMenu(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.subnetingArray)) {
            subnet1.ipToNetmask(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.themaArray)) {
            thema1.detailiertThema(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.firewallArray)) {
            firewall1.detailiertFirewall(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.wlanArray)) {
            wlan1.detailiertWlan(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.nameArray)) {
            name1.detailiertName(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.topologieArray)) {
            top1.detailiertTopologien(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.lanArray)) {
            lan1.detailiertLan(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.switchArray)) {
            switch1.detailiertSwitch(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.routerArray)) {
            router1.detailiertRouter(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.networkArray)) {
            network1.detaliertNetwork(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.wetterArray)) {
            wetter1.detailiertWetter(nameUser1);
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.wohlbefindenBotArray)) {
            wohlbefindenBot1.wohlBot();
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.infoArray)) {
            impressum1.infoImpressum();
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.witzArray)) {
            witz1.witzeSammlung();
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.schimpfwortArray)) {
            beschimpfung1.schimpfSammlung();
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.beendenArray)) {
            System.out.println("Ich hoffe ich konnte dir "
                    + "helfen " + nameUser1.getNameUser() + ".");
            System.out.println("Ich schliesse mich "
                    + "nun für dich.");
            System.out.println("Bye bye!");
            System.exit(0);
        } else {
            noMatch1.noMatchGoogle(chatUser);
        }
    }
}