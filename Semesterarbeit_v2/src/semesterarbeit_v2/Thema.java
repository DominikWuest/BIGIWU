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
    Klasse für die Auflistung der bekannten Themen.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

public class Thema {

    // Gibt dem User eine kurze Auflistungen seiner Ihm gekannten
    // Themen zurück. Es sind nicht alle aufgeführt. Es gibt noch
    // ein paar versteckte Funktion die der User selber finden kann
    
    void detailiertThema(NameUser nameUser1) {
        
        System.out.println("Alles klar " + nameUser1.getNameUser() + ".");
        System.out.println("Da ich leider noch keinen Zugriff zum Internet "
                + "habe ist meine Auswahl beschränkt.");
        System.out.println("Aber zu diesen Themen kann ich dir helfen.");
        
        System.out.println("-------------------");
        System.out.println("-Netzwerk Generell-");
        System.out.println("---Subnetzrechner--");
        System.out.println("-----Topologien----"); 
        System.out.println("----Binärrechner---"); 
        System.out.println("------Firewall-----");
        System.out.println("------Switches-----");
        System.out.println("-------Router------");
        System.out.println("--------WLAN-------"); 
        System.out.println("--------LAN--------");
        System.out.println("-------------------");
        
        System.out.println("Und vieleicht noch etwas mehr frag mich "
                + "doch einfach :) ");
    }

}
